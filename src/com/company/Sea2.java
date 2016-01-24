package com.company;

/**
 * Created by Marina on 24.01.16.
 */
public class Sea2 {
    public static void main(String[] args) {
        char[][] Tab  = {
                {'0', '0', '0', '0','0', '0','0', '0','0', '0'},
               {'0', '*', '0', '*', '*', '0', '*','0', '0', '*'}
       };
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 10; j++) {
               System.out.print(Tab[i][j] + "\t");
           }
           System.out.println();
       }
       }
    }