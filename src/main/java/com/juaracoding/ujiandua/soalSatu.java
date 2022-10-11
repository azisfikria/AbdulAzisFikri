package com.juaracoding.ujiandua;

public class soalSatu {
    public static void main(String[] args) {
        String a = "1_3_5_7_9";
        String deret = a;
        while (deret.length() > 0) {
            System.out.println(deret);
            if (deret.length() < 2)
                break;
            deret = deret.substring(1, deret.length() - 1);
        }
    }
}
