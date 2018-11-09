package pl.repeat.codewars;

import java.util.ArrayList;
import java.util.List;

public class Outlier {

    public static int findOutlier(int[] arrayOfIntegers){
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int toCheck: arrayOfIntegers) {
            if(toCheck%2 == 0){
                evenList.add(toCheck);
            } else {
                oddList.add(toCheck);
            }
        }

        if(evenList.size() > oddList.size()){
            return oddList.get(0);
        } else {
            return evenList.get(0);
        }
    }

}
