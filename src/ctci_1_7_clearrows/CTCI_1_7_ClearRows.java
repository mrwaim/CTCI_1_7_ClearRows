/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_1_7_clearrows;

/**
 *
 * @author klsandbox
 */
public class CTCI_1_7_ClearRows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int picture [][] = {{1,0,3, 4, 5}, {6, 7, 8, 9 ,0}, {11, 12, 13, 14,15}, {16, 17, 18, 19, 20}, {21,0,23,24,25}};
        
        print(picture);
        print(zeroRows(picture));
    }
    
    public static int[][] zeroRows(int array[][]) {
        int [] rowsToClear = new int[array.length];
        int [] columnsToClear = new int[array[0].length];
        
        for (int ii =0 ; ii < array.length; ii++) {
            for (int jj = 0; jj < array[0].length; jj++) {
                if (array[ii][jj] == 0) {
                    rowsToClear[ii] = 1;
                    columnsToClear[jj] = 1;
                }
            }
        }
        
        for (int ctr = 0; ctr < rowsToClear.length; ctr++) {
            if (rowsToClear[ctr] == 1) {
                for (int ii = 0; ii < columnsToClear.length; ii++)
                {
                    array[ctr][ii] = 0;
                }
            }
        }
        
        for (int ctr = 0; ctr < columnsToClear.length; ctr++) {
            if (columnsToClear[ctr] == 1) {
                for (int jj = 0; jj < rowsToClear.length; jj++)
                {
                    array[jj][ctr] = 0;
                }
            }
        }
        
        return array;
    }

    public static void print(int array[][]) {
        for (int ii = 0; ii < array.length; ii++) {
            for (int jj = 0; jj < array[ii].length; jj++) {
                System.out.print(String.format("%3d", array[ii][jj]));
            }

            System.out.println();
        }
    }

}
