package TestBasic;

public class Test {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    int a =5;

    static{
        System.out.println("parent static block");
    }

    Test()
    {
        System.out.println("constructor method as Test parent");
        System.out.println("a is :"+ (a)+1 );
    }

    public void Name()
    {
        System.out.println("Non static method as name parent");

    }

    static void house()
    {
        System.out.println("its parent house");
    }

    void land()
    {
        System.out.println("final method in parent as land ");
    }

    public static void main(String[] args) {

        Mul obj1 = new Mul();
        obj1.Name();
        Sub.house();
        Mul.house();
        obj1.land();
        obj1.setA(5);
        System.out.println(obj1.getA());

    }

}
