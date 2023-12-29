abstract class Demo
{
    public int A;
    public int B;
    
    public Demo()
    {
        System.out.println("Inside Constaructor ");
        this.A=0;
        this.B=0;
    }
    abstract void Fun();
    // in c++ virtual void Fun()=0;
    void gun()
    {
        System.out.println("inside gun");
    }
}
class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside Hello Constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Fun of Hello
        ");
    }
}
class AbstractDemo
{
    public static void main(String Arg[])
    {
       // Demo obj = new Demo();
       Hello hobj = new Hello();
       hobj.Fun();
       hobj.gun();
    }
}