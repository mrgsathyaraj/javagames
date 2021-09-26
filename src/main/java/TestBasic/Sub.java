package TestBasic;

public class Sub extends Test{

    int a =5;

    static{
        System.out.println("child static block ");
    }

    Sub()
    {
        System.out.println("constructor method as Test child");
        System.out.println("a is :"+ (a)+1 );
    }


    static void house()
    {
        System.out.println("its child house");
    }

    void land()
    {
        System.out.println("final method in child as land ");
    }

}
