package practice;

import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        int[] array1 = {2,1,4,3};
        int[] array2 = {6,7,4,5,6,8,6};
        //function to check whether two arrays are same
        //System.out.println("The two arrays are same: " + Arrays.equals(array1, array2));

        //function to check if an array is sorted in ascending order or not
        //System.out.println("Array sorted in ascending order: " + checkSort(array2));

        //function to merge and sort arrays
        //System.out.println("The merged and sorted array " + mergeAndSort(array1,array2));

        //function to remove all the occurrences of a number in an array
        int remove = 6;
        System.out.println("Array after removing " + remove + " is " + removeNum(array2, remove));
    }

    private static String removeNum(int[] array, int remove) {
        int len = 0;
        for(int n : array){
            if(n == remove){
                len++;
            }
        }
        int[] newArray = new int[array.length - len];
        int i = 0;
        for(int j : array){
            if(j != remove){
              newArray[i] = j;
              i++;
            }
        }
        return Arrays.toString(newArray);
    }

    private static String mergeAndSort(int[] array1, int[] array2) {
        int len1 = array1.length;
        int len2 = array2.length;
        int[] mergedArray = Arrays.copyOf(array1, len1 + len2 );
        for(int i = 0; i < len2; i++){
            mergedArray[len1 + i] = array2[i];
        }
        Arrays.sort(mergedArray);
        return Arrays.toString(mergedArray);
    }

    private static boolean checkSort(int[] array){
        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        return Arrays.equals(temp,array);
    }
}
