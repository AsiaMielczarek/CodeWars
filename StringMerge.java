package pl.repeat.codewars;

public class StringMerge {

    public static String stringMerge(String s1, String s2, String letter){

        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }


}