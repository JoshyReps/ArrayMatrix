package com.mycompany.reponoyatest;
public class ReponoyaTest {

    public static void main(String[] args) {
     
        int[][] matrix = new int[10][10];
        
        for(int i = 0; i < matrix.length; i++) {
            
            int j = 0;
            
            for(int number : new int[]{1,2,3,4,5,6,7,8,9,10}) {
                matrix[i][j] = number * (i + 1);
                System.out.print("\t" + matrix[i][j++]);
            }
            System.out.println("");
        }
    }
}
