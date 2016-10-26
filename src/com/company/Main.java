package com.company;
import com.sun.deploy.util.StringUtils;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;



class untitled3 {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();

            if((S.length()<=100 && S.length()>=1)&&(start>=0 && start<end)&&(end<=S.length()) && S.matches("[a-zA-Z]+")){

                System.out.println( S.substring(start, end));
            }
            else {System.out.println("Error input");}
    }

 }