package com.megh.learning;

public class SwitchStatement {
    public static void main(String[] args) {

        switchMethod1();

        }



    private static void switchMethod1() {
        String food = "banana";
        //can give multiple values as a case but not multiple conditions using || &&
        switch (food) {
            case "apple", "banana":
            case "mango":
                System.out.println("FRUIT");
                break;
            case "carrot", "cabbage":
                System.out.println("VEGETABLE");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
