package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testing {
    public static boolean regExp(String S){
        Pattern pattern = Pattern.compile("^[a-zA-Z]*");
        Matcher matcher = pattern.matcher(S);
        return matcher.matches();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if (regExp(S) == true)
        {
            int k = in.nextInt();

            String max = "";
            String min = "";

            if (S.length() >= 2 && k > 0 && k < S.length() - k && k < S.length()/2 && S.length()<1000) {
                for (int i = 0; i < S.length() - k; i++) {

                    String firstSub = S.substring(i, i + k);
                    String secondSub = S.substring(i + 1, k + i + 1);

                    String tempMax;
                    String tempMin;

                    if (firstSub.compareTo(secondSub) > 0) {
                        tempMax = firstSub;
                        tempMin = secondSub;
                        if (i==0) {
                            min = secondSub;
                            max = firstSub;
                        }
                    } else {
                        tempMin = firstSub;
                        tempMax = secondSub;
                        if (i==0) {
                            min = firstSub;
                            max = secondSub;
                        }
                    }

                    if(tempMax.compareTo(max) > 0)
                        max = tempMax;
                    if(tempMin.compareTo(min) < 0)
                        min = tempMin;
                }

                System.out.println(min);
                System.out.println(max);
            }
           else System.out.print(S+"\n"+S+"\n");

        }
    }

}