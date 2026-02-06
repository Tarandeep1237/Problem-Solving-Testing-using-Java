import java.io.*;
import java.util.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int bottom = m - layer - 1;
            int left = layer;
            int right = n - layer - 1;

            // top
            for (int i = left; i <= right; i++)
                elements.add(matrix.get(top).get(i));

            // right
            for (int i = top + 1; i < bottom; i++)
                elements.add(matrix.get(i).get(right));

            // bottom
            for (int i = right; i >= left; i--)
                elements.add(matrix.get(bottom).get(i));

            // left
            for (int i = bottom - 1; i > top; i--)
                elements.add(matrix.get(i).get(left));

            int rotation = r % elements.size();
            Collections.rotate(elements, -rotation);

            int index = 0;

            // put top
            for (int i = left; i <= right; i++)
                matrix.get(top).set(i, elements.get(index++));

            // put right
            for (int i = top + 1; i < bottom; i++)
                matrix.get(i).set(right, elements.get(index++));

            // put bottom
            for (int i = right; i >= left; i--)
                matrix.get(bottom).set(i, elements.get(index++));

            // put left
            for (int i = bottom - 1; i > top; i--)
                matrix.get(i).set(left, elements.get(index++));
        }

        // print result
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput =
                bufferedReader.readLine().trim().split(" ");

        int m = Integer.parseInt(firstInput[0]);
        int n = Integer.parseInt(firstInput[1]);
        int r = Integer.parseInt(firstInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            String[] row = bufferedReader.readLine().trim().split(" ");
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(row[j]));
            }

            matrix.add(list);
        }

        Result.matrixRotation(matrix, r);
    }
}
