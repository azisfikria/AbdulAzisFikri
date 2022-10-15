package com.juaracoding.ujiandua;

public class soalSatu {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 9; i >= 0; i--) {
            for (int j = a; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            a++;
            System.out.println();
        }
    }
}
