package com.company;
import com.sun.deploy.util.StringUtils;

import java.util.Scanner;



class untitled3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.length()<B.length())
        {
        System.out.println("Yes");
        }
        else   {System.out.println("No");}

        String a = com.sun.xml.internal.ws.util.StringUtils.capitalize(A);
        String b = com.sun.xml.internal.ws.util.StringUtils.capitalize(B);


        System.out.println(a+" "+b);
    }

 }