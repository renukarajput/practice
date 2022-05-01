package xipl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {
//        ([A-Z]{3}|[A-Z]?[\\s\\$\\€\\¥\\£])?\\s?(\\d{1,3}((,\\d{1,3})+)?(.\\d{1,3})?(.\\d{1,3})?(,\\d{1,3})?)
//        ([A-Z]{3}|[A-Z]?[\s\$\€\¥\£])?\s?(\d{1,3}((,\d{1,3})+)?(.\d{1,3})?(.\d{1,3})?(,\d{1,3})?)
//        (\b(?i)subtotal\b|\bsub total\b).*(\d+(?:[,.]\d+)*)
//        final String regex = "([A-Z]{3}|[A-Z]?[\\s$€¥£])?\\s?(\\d{1,3}((,\\d{1,3})+)?(.\\d{1,3})?(.\\d{1,3})?(,\\d{1,3})?)";

        final String regex = "([£€$¥£]|USD|US\\$)\\s?\\d+(,?\\d+\\.?\\d+|\\.?\\d+)";
        System.out.println("reg -:::: " + regex);

        String input =
            "l Verizon 9:25 PM 86%\n"
            + "Done FOLIODETE 20180126102118.pdf\n"
            + "HILTON TUCSON EL CONQUISTADOR\n"
            + "10000 N ORACLE ROAD\n"
            + "TUCSON, AZ 85704\n"
            + "Hilton United States of America\n"
            + "TELEPHONE 520-544-5000 FAX (520) 544-1228\n"
            + "HOTELS&RESORTS Reservations\n"
            + "www.hilton.com or 1 800 HILTONS\n"
            + "Natale, Ariane Room No: 1411/Q2\n"
            + "Arrival Date: 1/24/2018 12:55:00 AM\n"
            + "520 STASSI LANE Departure Date: 1/26/2018 10:21:00 AM\n"
            + "Adult/Child: 1/0\n"
            + "SANTA MONICA CA 90402 Cashier ID: MLATHROP1\n"
            + "UNITED STATES OF AMERICA Room Rate: 209.00\n"
            + "AL:\n"
            + "HH\n"
            + "VAT #\n"
            + "Folio No/Che 998591 A\n"
            + "Confirmation Number: 3404253554\n"
            + "HILTON TUCSON EL CONQUISTADOR 1/26/2018 10:21:00 AM\n"
            + "DATE DESCRIPTION ID REF NO CHARGES CREDIT BALANCE\n"
            + "1/8/2018 Advance Deposit VS 2220 ROBERTY 6114423 ($239.41)\n"
            + "1/24/2018 GUEST ROOM CWASHBU 6128189 $209.00\n"
            + "RN\n"
            + "1/24/2018 ROOM TAX CWASHBU 6128189 $30.41\n"
            + "RN\n"
            + "1/25/2018 GUEST ROOM CGRAHAM 6128752 $209.00\n"
            + "1/25/2018 ROOM TAX CGRAHAM 6128752 $30.41\n"
            + "1/26/2018 vS 5384 MLATHRO 6129327 ($239.41)\n"
            + "P1\n"
            + "BALANCE $0.00\n"
            + "THANK YOU FOR CHOOSING THE HILTON EL CONQUISTADOR. WE REALIZE THAT YOU HAVE A CHOICE WHEN TRAVELING AND\n"
            + "SINCERELY APPRECIATE YOUR BUSINESS. IF YOU HAVE ANY BILLING QUESTIONS PLEASE CALL 520-544-1236\n"
            + "CREDIT CARD DETAIL\n"
            + "APPR CODE 00043D MERCHANT ID 000100682400\n"
            + "CARD NUMBER VS '2220 EXP DATE 10/20\n"
            + "TRANSACTION ID 6114423 TRANS TYPE Sale\n";


        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}