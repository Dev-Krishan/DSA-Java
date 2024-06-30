/*
 * Task
 * Print all the indices of element occurance
 * I have done using a list add all the occurance in that
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        //System.out.println(findOccurance(arr, 0, 3));
        System.out.println(Arrays.toString(otherApproach(arr, 0, 3, 0)));
        scn.close();
    }

    static List<Integer> findOccurance(int[] arr, int idx, int ele) {
        List<Integer> list = new ArrayList<>();
        if (idx == arr.length) {
            return list;
        }
        if(arr[idx] == ele){
            list.add(idx);
        }
        list.addAll(findOccurance(arr, idx+1, ele));
        return list;
    }

    /* ANOTHER APPROACH
     * Create an array of that size(no of occurance of element in that array)
     * Steps: 
     * While going from 0 to arr.length-1 count the occurnace
     * and while returning add element
     */
    static int[] otherApproach(int [] arr, int idx, int elem, int idxTIllFound){
        if(idx== arr.length){
            return new int[idxTIllFound];
        }

        if(arr[idx]== elem){
            int[] returnArr = otherApproach(arr, idx+1, elem, idxTIllFound+1);
            returnArr[idxTIllFound] = idx;
            return returnArr;
        }
        else{
            int [] returnArr = otherApproach(arr, idx+1, elem, idxTIllFound);
            return returnArr;
        }
    }
}
