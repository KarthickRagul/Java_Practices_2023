package org.example;

public class StringBuffer_Examples {
    public static void main(String args[]){

        //Immutable
//        String name = "Karthick";  // As string is class, but object is created by java itself
////        name = "Ragul";
////        name = "Karthick"+name; // We are not changing the existing string, basically creating new object
//        System.out.println(name);
//
//        String name2 = "Karthick"; // Refer String pool concept
//
//        System.out.println(name==name2);

        //Mutable

        StringBuffer sb = new StringBuffer("Karthick");
        sb.append(" Ragul");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.substring(0,6);
        System.out.println(sb);

    }
}
