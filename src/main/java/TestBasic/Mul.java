package TestBasic;

import javafx.scene.SubScene;

public class Mul extends Sub {

    int a =5;

    static{
        System.out.println("Mul static block ");
    }

    Mul()
    {
        System.out.println("constructor method as Test Mul");
        System.out.println("a is :"+ (a)+1 );
    }



    static void house()
    {
        System.out.println("its Mul house");
    }

    final void land()
    {
        System.out.println("final method in Mul as land ");
    }

}
