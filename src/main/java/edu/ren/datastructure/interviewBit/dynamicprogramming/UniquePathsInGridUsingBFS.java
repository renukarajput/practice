package edu.ren.datastructure.interviewBit.dynamicprogramming;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class UniquePathsInGridUsingBFS extends UniquePathsInGridIterative{
    static class Cell {
        int row;
        int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }


        Cell up(){
            return new Cell(row+1,col);
        }

        Cell right(){
            return new Cell(row,col+1);
        }
        void moveRight(){
            this.col+=1;
        }
        void moveLeft(){
            this.col-=1;
        }
        void moveDown(){
            this.row+=1;
        }

        void moveUp(){
            this.row-=1;
        }
        Cell down(){
            return new Cell(row+1,col);
        }


    }
    @Override
    protected int get(List<List<Integer>> grid, int row, int col) {
        int[][] wayMatrix=new int[row+1][col+1];
        Queue<Cell> queue=new ArrayDeque<>();
        queue.add(new Cell(0,0));
        while (!queue.isEmpty()){
           Cell head= queue.remove();
           if(grid.get(head.row).get(head.col)==0){
               if(row!=head.row) {
                   Cell up = head.up();
                   queue.add(up);
                   wayMatrix[up.row][up.col]+=1;
               }
               if(col!=head.col){
                   Cell right = head.right();
                   queue.add(right);
                   wayMatrix[right.row][right.col]+=1;

               }
           }
        }
        return wayMatrix[row][col];
    }
}
