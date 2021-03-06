package edu.ren.geeks.array;

public class SquareRoot {

    public static int squareRootOfNo(int no){
        return findSquareRoot(no, 0, no);
//        return squareRootOfNoRec(no, 0, no);
    }

    private static int findSquareRoot(int no, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            long square = (long)mid * mid;
            if (square == no) {
                return mid;
            }
            if (square < no) {
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static int squareRoot(int no){
        for (int i = 0; i < no/2; i++) {
            if (i*i == no){
                return i;
            }
        }
        return 0;
    }

    private static int squareRootOfNoRec(int no, int start, int end) {
        int mid = start + (end - start) / 2;
        int square = mid * mid;
        if (start <= end) {
            if (square == no) {
                return mid;
            }
            if (square < no) {
                return squareRootOfNoRec(no, mid + 1, end);
            }
            return squareRootOfNoRec(no, start, mid - 1);

        }
        return 0;
    }
}
