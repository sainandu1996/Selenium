import java.util.Arrays;

public class CoreJavaBrushup3 {
    public static void main (String[] args) {

        /*In Java String is an object that stores sequence of characters.
        String can be declared in 2 ways*/

        /*Here only 1 object is created and memory also as it has same characters*/
        //String Literal
        String s= "Sai";
        String s1="Sai";

        //here 2 objects and nmemory is allocated for both as we have given new keyword
        String s2 = new String("Sai");
        String s3 = new String("Sai");

        String s4 = "Sai Krishna Selenium";
         String[] splittedstring =    s4.split(" ");
         //Using the method Arrays.toString as it group of string

         System.out.println(Arrays.toString(splittedstring));

         //when only individuals are being accessed no need to convert
        System.out.println(splittedstring[0]);

        //iterate and split all characters
        for(int i=0;i<s4.length();i++){
            System.out.println(s4.charAt(i));
        }
        System.out.println("*******");

        //printing in reverse order
        for(int j= s4.length()-1;j>=0;j--){
            System.out.println(s4.charAt(j));

        }



    }
}
