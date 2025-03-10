package com.vamsi.strings;
public class Test{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        System.out.println(s1==s2);           //false
        System.out.println(s1.equals(s2));    //true
        System.out.println(s1==s3);           //true 
        System.out.println(s1==s3);           //true
    }
}