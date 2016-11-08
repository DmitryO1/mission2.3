package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testing {
    public static boolean regExp(String S) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]*");
        Matcher matcher = pattern.matcher(S);
        return matcher.matches();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if (regExp(S) == true) {
            int k = in.nextInt();

            String max = "";
            String min = "";

            if (S.length() >= 2 && k > 0 && k < S.length() - k && k < S.length() / 2 && S.length() < 1000) {
                for (int i = 0; i < S.length() - k+1; i++) {

                    String firstSub = S.substring(i, i + k);

                    if (max.equals("") || min.equals("") ) {
                        max = firstSub;
                        min = firstSub;
                    }

                        if (firstSub.compareTo(max) > 0) {
                            max = firstSub;
                        }
                        if (firstSub.compareTo(min) < 0){
                            min = firstSub;
                        }
                    }
                System.out.println(min);
                System.out.println(max);
            }
            else System.out.print(S+"\n"+S+"\n");
        }
    }
}