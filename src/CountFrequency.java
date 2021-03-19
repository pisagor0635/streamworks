import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountFrequency {
    public static void main(String[] args) {
        int count = 0;
        //For Strings
        List<String> wordsList = new ArrayList();
        wordsList.add("hello");
        wordsList.add("hello");
        wordsList.add("bye");
        wordsList.add("ciao");
        wordsList.add("bye");
        wordsList.add("ciao");


        Map<String, Long> collect = wordsList.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);

//        Set<String> ks = collect.keySet();
//        for(String s : ks){
//            count += collect.get(s)/2;
//        }


        //For int

       /*int[] a = {1,2,3,5,5,4,2,4,4,4,4,5,4,2,4,2};


        Map<Integer, Long> collect = Arrays.stream(a).boxed().collect(groupingBy(Function.identity(), counting()));

        Set<Integer> ks = collect.keySet();
        for(Integer s : ks){
            count += collect.get(s)/2;
        }


        System.out.println("Pair : " + count);*/

    }
}
