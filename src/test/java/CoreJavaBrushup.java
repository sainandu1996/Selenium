public class CoreJavaBrushup {
    public static void  main (String[] args){

        //Data Types
        int num = 5;
        String name = "Sai Krishna";
        String[] name2 = {"sai","krishna","java"};
        char[] letter = {'s','a','i'};
        double value = 5.99;
        boolean answer = false;
        System.out.println("My name is " +name);

        //Arrays - used when values are not prefixed
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 7;

        System.out.println("the value in 5th index is " + arr[3]);

        //2nd type array declaration used when values are fixed
        int[] arr2 = {10,16,12,14,18,16,19,22};
        System.out.println(arr2[0]);

        //For loop - iterating each and every value in loop

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int j=0;j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
        //For loop for String
        for(int k=0;k<name2.length;k++){
            System.out.println(name2[k]);
        }

        //For Loop for Characters
        for(int l=0;l<letter.length;l++){
            System.out.println(letter[l]);
        }


        //EnhancedForLoop
        //write array nameon right side and variable and data type on left hand
        char[] vowels ={'a','e','i','o','u'};
        for(char z :vowels){
            System.out.println(z);
        }


    }
}
