package edu.ren.datastructure.interviewBit.array;

/**
 * Created by rrn3194 on 9/26/18.
 */
public class SpiralMatrix {

    static void PrintSpiralMatrix(int a[][]) {
        int m = a.length;
        int n = a[0].length;
        //  for i=0 to m check if a[i].length is same
        //if not throw exception
        int startx = 0, starty = 0;
        int endx = m - 1;
        int endy = n - 1;
        while (startx <= endx) {                  //starty<=endy
            for (int i = starty; i < endy; i++)   //i=l=0;        loop for 1st row
            {
                System.out.print(a[startx][i] + " ");
            }

            for (int i = startx; i < endx; i++)                       //loop for last column
            {
                System.out.print(a[i][endy] + " ");
            }


            for (int i = endy; i > starty; i--)                //loop for last row
            {
                System.out.print(a[endx][i] + " ");
            }

            for (int i = endx; i > startx; i--)               //loop for first column
            {
                System.out.print(a[i][starty] + "  ");
            }

            startx++;
            starty++; //shrink collapse start and end boundary
            endx--;
            endy--;   //shrink collapse start and end boundary
        }
    }

    public static void main(String[] args) {

        int a[][] = {
                {1, 2, 3, 44},
                {4, 5, 6, 7},
                {7, 8, 9, 0},
                {5, 1, 3, 6}
        };
        PrintSpiralMatrix(a);
    }

}
