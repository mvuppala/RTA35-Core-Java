package practice;

public class GenericExample {
    public <T> boolean  areEqual(T val1,T  val2){
        return val1 == val2;
    }

    public static void main(String[] args) {
        GenericExample gen = new GenericExample();
        System.out.println("Integer example " + gen.areEqual(21,12));
        System.out.println("String example " + gen.areEqual("abc", "abc"));
    }

}
