package huawei;

import javax.net.ssl.*;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.*;

//If the JDK version is earlier than 1.8, use a third-party library to provide the Base64 class.
//import org.apache.commons.codec.binary.Base64;
public class SmsApiService {

    //This parameter does not need to be modified. It is used to format the Authentication header field and assign a value to the X-WSSE parameter.
    private static final String WSSE_HEADER_FORMAT = "UsernameToken Username=\"%s\",PasswordDigest=\"%s\",Nonce=\"%s\",Created=\"%s\"";
    //This parameter does not need to be modified. It is used to format the Authentication header field and assign a value to the Authorization parameter.
    private static final String AUTH_HEADER_VALUE = "WSSE realm=\"SDP\",profile=\"UsernameToken\",type=\"Appkey\"";

    public static void main(String[] args) throws Exception {

        //Mandatory. The values here are example values only. Obtain the actual values based on Development Preparation.
//        https://smsapi.ap-southeast-1.myhuaweicloud.com:443
        String url = "https://smsapi.ap-southeast-1.myhuaweicloud.com:443/sms/batchSendSms/v1"; //Application access address and API access URI
        String appKey = "xy2417ZuCU4ZMfk4Vr35y6k09Jw8"; //Application Key
        String appSecret = "hVnKCLAGE2Wo73UqtM38mmgTVr5q";  //Application Secret
        //India app secret = hVnKCLAGE2Wo73UqtM38mmgTVr5q
        // HK = "hMmCoxCKom5dCNX7oIhipA3NywOD";
        String sender = "csms12345678"; //Channel number for Chinese mainland SMS or international SMS
        String templateId = "1454cdcecde24266a2071f98961d8e20";
//                "1454cdcecde24266a2071f98961d8e20"; //Template ID

        //Mandatory for Chinese mainland SMS. This parameter is valid and mandatory when Template Type corresponding to templateId is Universal template. The signature name must be approved and be the same type as the template.
        //This parameter is not required for international SMS.
        String signature = "HUAWEI CLOUD SMS test"; //Signature name

        //Mandatory. Global number format (including the country code), for example, +8615123456789. Use commas (,) to separate multiple numbers.
        String receiver = "+917066518794,+919156165852"; //Recipient number

        //Optional. Address for receiving SMS status reports. The domain name is recommended. If this parameter is set to an empty value or left unspecified, customers do not receive status reports.
        String statusCallBack = "";

        /**
         *Optional. If a non-variable template is used, assign an empty value to this parameter, for example, String templateParas = "";
         * Example of a single-variable template: If the template content is "Your verification code is ${NUM_6}", templateParas can be set to "[\"369751\"]".
         *Example of a dual-variable template: If the template content is "You have ${NUM_2} delivered to ${TXT_20}", templateParas can be set to "[\"3\",\"main gate of People's Park\"]".
         * To view more information, choose Service Overview > Template and Variable Specifications.
         */
        String templateParas = String.format("[\"%s\", \"%s\"]", "131313" , "15"); //"[\"121212\",\"15\"]"; //Template variable. The following uses a single-variable verification code SMS message as an example. The customer needs to generate a 6-digit verification code and define it as a character string to prevent the loss of first digits 0 (for example, 002569 is changed to 2569).

        //Request body. If the signature name is not required, set signature to null.
        String body = buildRequestBody(sender, receiver, templateId, templateParas, statusCallBack, signature);
       //templateParas=%5B%22369751%22%5D&signature=HUAWEI+CLOUD+SMS+test&from=csms12345678&to=%2B919156165852&templateId=3dff56d0faae4f4fa8ef7a36f1610b38&minute=5
        if (null == body || body.isEmpty()) {
            System.out.println("body is null.");
            return;
        }

        //The value of X-WSSE in the request headers is as follows:
        String wsseHeader = buildWsseHeader(appKey, appSecret);
        if (null == wsseHeader || wsseHeader.isEmpty()) {
            System.out.println("wsse header is null.");
            return;
        }

        Writer out = null;
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        HttpsURLConnection connection = null;
        InputStream is = null;

        //Ignore the certificate trust issues to prevent API calling failures caused by HTTPS certificate authentication failures.
        HostnameVerifier hv = new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        trustAllHttpsCertificates();
        try {
            URL realUrl = new URL(url);
            connection = (HttpsURLConnection) realUrl.openConnection();

            connection.setHostnameVerifier(hv);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(true);
            //Request method
            connection.setRequestMethod("POST");
            //Parameters in the request headers
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Authorization", AUTH_HEADER_VALUE);
            connection.setRequestProperty("X-WSSE", wsseHeader);

            connection.connect();
            out = new OutputStreamWriter(connection.getOutputStream());
            out.write(body); //Parameters in the request body
            out.flush();
            out.close();

            int status = connection.getResponseCode();
            if (200 == status) { //200
                is = connection.getInputStream();
            } else { //400/401
                is = connection.getErrorStream();
            }
            in = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String line = "";
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result); //Record the response entity.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.close();
                }
                if (null != is) {
                    is.close();
                }
                if (null != in) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Construct the request body.
     *
     * @param sender
     * @param receiver
     * @param templateId
     * @param templateParas
     * @param statusCallBack
     * @param signature      | Signature name, which must be specified when the universal template for Chinese mainland SMS is used.
     * @return
     */
    static String buildRequestBody(String sender, String receiver, String templateId, String templateParas,
                                   String statusCallBack, String signature) {
        if (null == sender || null == receiver || null == templateId || sender.isEmpty() || receiver.isEmpty()
                || templateId.isEmpty()) {
            System.out.println("buildRequestBody(): sender, receiver or templateId is null.");
            return null;
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("from", sender);
        map.put("to", receiver);
        map.put("templateId", templateId);
        if (null != templateParas && !templateParas.isEmpty()) {
            map.put("templateParas", templateParas);
        }
        if (null != statusCallBack && !statusCallBack.isEmpty()) {
            map.put("statusCallback", statusCallBack);
        }
        if (null != signature && !signature.isEmpty()) {
            map.put("signature", signature);
        }
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (String s : map.keySet()) {
            try {
                temp = URLEncoder.encode(map.get(s), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            sb.append(s).append("=").append(temp).append("&");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    /**
     * Construct the value of X-WSSE.
     *
     * @param appKey
     * @param appSecret
     * @return
     */
    static String buildWsseHeader(String appKey, String appSecret) {
        if (null == appKey || null == appSecret || appKey.isEmpty() || appSecret.isEmpty()) {
            System.out.println("buildWsseHeader(): appKey or appSecret is null.");
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String time = sdf.format(new Date()); //Created
        String nonce = UUID.randomUUID().toString().replace("-", ""); //Nonce

        MessageDigest md;
        byte[] passwordDigest = null;

        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update((nonce + time + appSecret).getBytes());
            passwordDigest = md.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //If the JDK version is 1.8, load the native Base64 class and use the following code:
        String passwordDigestBase64Str = Base64.getEncoder().encodeToString(passwordDigest); //PasswordDigest
        //If the JDK version is earlier than 1.8, load a third-party library to provide the Base64 class and use the following code:
        //String passwordDigestBase64Str = Base64.encodeBase64String(passwordDigest); //PasswordDigest
        //If passwordDigestBase64Str contains newline characters, run the following code:
        //passwordDigestBase64Str = passwordDigestBase64Str.replaceAll("[\\s*\t\n\r]", "");
        return String.format(WSSE_HEADER_FORMAT, appKey, passwordDigestBase64Str, nonce, time);
    }

    /**
     * Ignore the certificate trust issues.
     *
     * @throws Exception
     */
    static void trustAllHttpsCertificates() throws Exception {
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                        return;
                    }

                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                        return;
                    }

                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                }
        };
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }
}
