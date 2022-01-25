package edu.leetcode.unionfind;

public class IslandNumbersUnionFind extends IslandNumbers {

    @Override
    public int numIslands(char[][] positions) {
        UnionFind unionFind = new UnionFind(positions);
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[0].length; j++) {
                if (positions[i][j] == '0')
                    continue;
                positions[i][j] = '0';
                int[][] neighbourDirections = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
                for (int[] direction : neighbourDirections) {
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if (isValid(x, y, positions.length, positions[0].length) && positions[x][y] == '1') {
                        unionFind.union(i * positions[0].length + j, x * positions[0].length + y);
                    }
                }
            }
        }
        return unionFind.getCount();
    }

    class UnionFind {
        int[] parent;
        int[] rank;
        int count;
        int rowSize;
        int columnsPerRow;

        UnionFind(char[][] positions) {
            rowSize = positions.length;
            columnsPerRow = positions[0].length;
            parent = new int[rowSize * columnsPerRow];
            rank = new int[rowSize * columnsPerRow];
            for (int i = 0; i < positions.length; i++) {
                for (int j = 0; j < positions[0].length; j++) {
                    if (positions[i][j] == '1') {
                        parent[i * columnsPerRow + j] = i * columnsPerRow + j;
                        rank[i * columnsPerRow + j] = 0;
                        count++;
                    }
                }
            }
        }

        public int getCount() {
            return count;
        }

        public int find(int i) {
            if (parent[i] != i) {
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }

        public void union(int i, int j) {
            int rootOne = find(i);
            int rootTwo = find(j);
            if (rootOne != rootTwo) {
                if (rank[rootOne] > rank[rootTwo]) {
                    parent[rootTwo] = rootOne;
                } else if (rank[rootOne] < rank[rootTwo]) {
                    parent[rootOne] = rootTwo;
                } else { //Both sets have same elements ,Either can be made parent, and it's rank incremented
                    parent[rootTwo] = rootOne;
                    rank[rootOne] += 1;
                }
                count--;
            }
        }
    }
}


