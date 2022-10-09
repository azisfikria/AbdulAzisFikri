package com.juaracoding.ujiandua;

public class soalSatu {
    public static void main(String[] args) {
        String a = "1_3_5_7_9";
        String str = a;
        while (str.length() > 0) {
            System.out.println(str);
            if (str.length() < 2)
                break;
            str = str.substring(1, str.length() - 1);
        }
    }
}
