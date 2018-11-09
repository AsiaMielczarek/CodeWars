package pl.repeat.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class TwoToOne {

        public static String longest (String s1, String s2) {

            List<Character> l1 = getList(s1);
            List<Character> l2 = getList(s2);

            TreeSet<Character> t1 = getTreeSet(l1);
            TreeSet<Character> t2 = getTreeSet(l2);

            if(t1.size() > t2.size()){
                return getString(t1);
            } else {
                return getString(t2);
            }
        }

        private static List<Character> getList(String s) {
//            ArrayList<Character> list = new ArrayList<>();
//            for(char c: s.toCharArray()){
//                list.add(c);
//            }
//            return list;
            return s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        }

        private static TreeSet<Character> getTreeSet(List<Character> l) {
            TreeSet <Character> set = new TreeSet<>(l);
            return set;
        }

        private static String getString(TreeSet<Character> s){
            StringBuffer sb = new StringBuffer();
            for(char c: s){
                sb.append(c);
            }
            return sb.toString();
        }

}
