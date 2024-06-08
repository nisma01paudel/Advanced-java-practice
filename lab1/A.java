public class A {
    int a;
    String name;
    A(){
        a=0;
        name = "Ankush";
    }
    void show(){
        System.out.println(a +"  "+name);
    }
    
}
/**
 * B
 */
 class B {

    public static void main(String[] args) {
        A ref = new A();
        ref.show();
    }
}