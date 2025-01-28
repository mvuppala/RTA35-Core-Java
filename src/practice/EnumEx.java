package practice;

enum Priorities{
    LOW, MEDIUM, HIGH
}
public class EnumEx {
    public static void main(String[] args) {
        for(Priorities p : Priorities.values()){
            System.out.print(p+" ");
        }
        System.out.println();

        Priorities level = Priorities.LOW;
        printPriority(level);
    }

    public static void printPriority(Priorities level) {
        switch (level) {
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
            default:
                System.out.println("Default");
        }
    }
}
