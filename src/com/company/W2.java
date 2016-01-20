package com.company;

public class W2 {
    public static void main(String[] args) {
        int count = 1;
        int zp = 100;
        while (count <12){
            do {
                zp = zp + 1000;
                System.out.println(zp);
                ++count;
            } while (false);
        }
    }
}
