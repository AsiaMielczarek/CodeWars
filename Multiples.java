package pl.repeat.codewars;

import java.util.TreeSet;

public class Multiples {

    public static int solution(int number){
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            if(i%3 == 0 || i%5 == 0){
                numbers.add(i);
            }
        }
        int result = 0;
        for (int i: numbers) {
            result += i;
        }
        return result;
    }
}
