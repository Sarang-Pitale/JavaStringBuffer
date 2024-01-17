package com.sample;
public class Demo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("This is my string");
        sb.append(" with String Buffer");
        sb.insert(3,"abcd");
        sb.replace(3,6,"");
        sb.reverse();
        System.out.println(sb);
    }
}
