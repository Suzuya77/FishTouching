package FishTouching.java.leetCode.LeetCodeMedium;

import java.util.LinkedList;
import java.util.Queue;

public class T1091 {
    public static void main(String[] args) {

        int[][] grid = {
                {0,0,0,1},
                {0,1,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };

        System.out.println(shortestPathBinaryMatrix(grid));
    }

    private static int shortestPathBinaryMatrix(int [][] grid){
        if (grid[0][0] == 1) {
            return -1;
        }

        int[] initialPosition = {0,0};
        int step = 1;
        int boundary = grid.length;
        final int [][] movements = {{1,0},{1,1},{1,-1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(initialPosition);

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++){
                int[] curPosition = queue.poll();

                if ((curPosition[0] == boundary - 1) && (curPosition[1] == boundary -1)){
                    return step;
                }

                for (int[] direction : movements){
                    int nextX = curPosition[0] + direction[0];
                    int nextY = curPosition[1] + direction[1];

                    if (nextX < 0 || nextY < 0 || nextX >= boundary || nextY >= boundary || grid[nextX][nextY] == 1){
                        continue;
                    }

                    int [] qualifiedPosition = {nextX,nextY};
                    queue.add(qualifiedPosition);
                    grid[nextX][nextY] = 1;
                }
            }
            step ++;
        }
        return -1;
    }
}
