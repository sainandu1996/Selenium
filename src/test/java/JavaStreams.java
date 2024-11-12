import com.google.common.collect.Streams;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    //regular java to count names containing letter A
    @Test
    public  void regularjava() {



        ArrayList<String> names = new ArrayList<String>();
        names.add("Sai");
        names.add("Apple");
        names.add("Anaconda");
        names.add("Krishna");
        names.add("Amd");
        int count =0;

        for (int i =0;i< names.size();i++){
             String actual = names.get(i);

            if(actual.startsWith("A")){
                count++;
            }

        }
        System.out.println(count);
    }


    //With Streams same with above
    @Test
    public  void StreamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Sai");
        names.add("Apple");
        names.add("Anaconda");
        names.add("Krishna");
        names.add("Amd");

        long number = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(number);

        //Declaring arraylist with streams
        //Prints 3 even though no names because return true is given
      Long a=  Stream.of("Sai","Apple","Adam").filter(s -> {
            s.startsWith("B");
            return  true;
        }  ).count();
        System.out.println(a);

        //Print names with >4 words
        names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s) );
        //limiting the results
        names.stream().filter(s -> s.length()>4).limit(2).forEach(s -> System.out.println(s));







    }

    //Multiple operations on Streams
    @Test
    public  void StreamMap(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Ball");
        names.add("Cat");



        //Names ending with a and convert to Uppercase
        Stream.of("Sanath","Sai","Alekhya","Kousalya").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        //Names start with a with uppercase and sorted
        List<String> names1 = Arrays.asList("Aloo","Sanath","Sai","Alekhya","Kousalya","Anand");
        names1.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));

        //Concatination of 2 arrays
        Stream<String> newStream=  Stream.concat(names.stream(),names1.stream());
        //newStream.sorted().forEach(s -> System.out.println(s));

        //Match or search for boolan return
        boolean value= newStream.anyMatch(s -> s.equalsIgnoreCase("Kousalya"));
        System.out.println(value);
        Assert.assertTrue(value);

    }

    //Collect the result and make them to list/set.map
    //Print unique numbers
    @Test
    public void StreamCollect(){
      List<String> ls=     Stream.of("Sanath","Sai","Alekhya","Kousalya").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

        //Print distinct in ascending/sorted order
        List<Integer> values = Arrays.asList( 2,2,1,1, 3, 5, 5, 6, 6, 7);
       // values.stream().distinct().sorted().forEach(s -> System.out.println(s));

        //get the index of 3
          List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li);
        System.out.println(li.get(3));

    }
}
