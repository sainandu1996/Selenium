import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {
    public static void main(String[] args) {

        int [] numbers = {1,2,5,10};

             //IfElseLoop
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] % 5 == 0){
                System.out.println(numbers[i]);
                break; //stops the loop and exits
            }
            else {
                System.out.println(numbers[i] + " is not multiple of 5");
            }

        }

        //ArrayList
        ArrayList<String> a = new ArrayList<String>();
        a.add("Sai");
        a.add("Krishna");
        a.add("Java");
        a.add("Selenium");
        a.remove(2);
        System.out.println(a.get(1));
        System.out.println("****");

        //ForLoop for ArrayList
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("****");

        //EnhancedForloop
        for( String s  :a){
            System.out.println(s);
        }
        //One Of the methods in ArrayList
        System.out.println(a.contains("Selenium"));
        System.out.println("****");


        //Convert List to ArrayList
        String[] names ={"a","b","c"};
       List<String> namelist = Arrays.asList(names);
       System.out.println(namelist.contains("z"));


    }
}

