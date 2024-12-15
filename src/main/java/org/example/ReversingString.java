package org.example;

public class ReversingString {
    public static void main(String[] args) {
        String str="Hellow";
        String reversed="";
        for(int i=0;i<str.length();i++){
            reversed =str.charAt(i)+reversed;

        }
        System.out.println(reversed);
    }
}
