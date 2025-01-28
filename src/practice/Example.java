package practice;

class BaseClassEx{
    final int i = 10;
}

class SubClassEx extends BaseClassEx{
    void print(){
        System.out.println(i); // final variable can be accessed in the subclass tho
      //  i++;  error.

    }
}
public class Example {
    public static void main(String[] args) {
        SubClassEx sc = new SubClassEx();
        sc.print();


    }
}


