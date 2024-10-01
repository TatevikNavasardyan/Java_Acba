package org.example.Homework_2;

/*input 1 2 3
        4 5 6
        7 8 9
  output 3 6 9 8 5 2 1 4 7
 */
public class MultiDimArray {
    public static void main(String args[]) {
        int[][] inputNumbers = new int[3][3];
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputNumbers[i][j] = k;
                k++;
               // System.out.print(inputNumbers[i][j] + " ");
            }
            //System.out.println();
        }


        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = 0; j < inputNumbers[0].length; j++) {
                if (i == 1) {
                    System.out.print(inputNumbers[2-j][i] + " ");

                } else
                    System.out.print(inputNumbers[j][2-i] + " ");

            }

        }


    }
}
