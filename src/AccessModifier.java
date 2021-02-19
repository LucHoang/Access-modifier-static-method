public class AccessModifier {

    public static void main(String args[]){

        A obj=new A();

        System.out.println(obj.data);//Private - Compile Time Error

        obj.msg();//Private - Compile Time Error

    }
}

class A{

    public int data=40;
    //private int data-40;

    public void msg(){System.out.println("Hello java");}
    //private void msg(){System.out.println("Hello java");}

}
