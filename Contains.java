package pl.repeat.codewars;

public class Contains {

    public static boolean check(Object[] a, Object x) {
        for(Object toCheck: a){
            if(toCheck.equals(x)){
                return true;
            }
        }
        return false;
    }
}
