public class MethodsinJava {
    public static  void main(String[] args) {
        MethodsinJava a = new MethodsinJava();

        //created a string so that the method return is string
        String s =  a.GetData();
        System.out.println(s);
        GetData2();

    }


    //here i am creating method which can be accessed in other classes also by giving the same classname that is MethodsinJava

    //also here i am returning name and in above class i am calling again
    public String GetData() {
        System.out.println("Hello World");
        return "Sai Krishna";
    }

    //used static method so that its class level and no need to create object to call the method even in other classes also
    public static void  GetData2() {
        System.out.println("static method");

    }
}
