package practice;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {4,-3,5,-1,2,55,12,55};
        //function calculate sum of all the elements in an array
        //System.out.println("Sum of the elements in the array: " + arraySum(array));

        //function to calculate the average of numbers in the array
        //System.out.println("Average of the elements in the array: " + arrayAvg(array));

        //function to find the smallest number in the array
        //System.out.println("Smallest number in the array: " + arrayMin(array));

        //function to find the second largest number in an array
        //System.out.println("Second largest number in the array: " + arraySecondLarge(array));
    }

    private static int arraySecondLarge(int[] array) {
        int max = array[0];
        int secondMax = 0;
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                secondMax = max;
                max = array[i];
            }
            else if(array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    private static int arrayMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min >= array[i]){
                min = array[i];
            }
        }
        return min;
    }

    private static float arrayAvg(int[] array) {
        return (float) arraySum(array) / array.length;
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
