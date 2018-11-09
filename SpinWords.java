package pl.repeat.codewars;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class SpinWords {

    public String spinWords(String sentence) {

        List<String> words = Arrays.asList(sentence.split("\\s"));
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).length() > 4){
                sb.append(new StringBuffer(words.get(i)).reverse().toString());
            } else {
                sb.append(words.get(i));
            }
            if(i < words.size()-1){
                sb.append(" ");
            }
        }
        return sb.toString();
//
//        return Arrays.stream(sentence.split(" "))
//                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
//                .collect(Collectors.joining(" "));
    }
}




