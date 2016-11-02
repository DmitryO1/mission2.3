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

            ArrayList<String> listMax = new ArrayList<>();
            ArrayList<String> listMin = new ArrayList<>();
            String max = null;
            String min = null;
            if (S.length() >= 2 && k > 0 && k < S.length() - k && k < S.length()/2 && S.length()<1000) {
                for (int i = 0; i < S.length() - k; i++) {

                    String firstSub = S.substring(i, i + k);
                    String secondSub = S.substring(i + 1, k + i + 1);
                    if (firstSub.compareTo(secondSub) > 0) {
                        max = firstSub;
                        min = secondSub;

                    } else if (firstSub.compareTo(secondSub) < 0) {
                        min = firstSub;
                        max = secondSub;
                    } else if (firstSub.compareTo(secondSub) == 0) {
                        min = firstSub;
                        max = secondSub;
                    }
                    listMax.add(i, max);
                    listMin.add(i, min);
                }
                Collections.sort(listMin);
                System.out.println(listMin.get(0));

                Collections.sort(listMax);
                System.out.println(listMax.get(listMax.size() - 1));
            }

           else System.out.print(S+"\n"+S+"\n");

        }
    }

}