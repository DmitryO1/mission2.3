package com.company;
import com.sun.deploy.util.StringUtils;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        String A = S.substring(0,k);
        String B = S.substring(S.length()-k,S.length());
        if(S.length()>=2)
            System.out.println(B);
            System.out.println(A);
    }
}
