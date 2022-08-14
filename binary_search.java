import java.util.*;
public class binary_search {
    // binary search
//in binary search the arrays sould be sorted in ascending form 

    public static void binary(int arr[],int first,int last,int x) {
        int mid = (first+last)/2;
        while (first<=last) {
             if (arr[mid]<x) {
                first = mid +1;
            }
            else if (arr[mid]==x) {
                System.out.println("the array is in the list"); 
                break;
            }
            if (arr[mid]>x) {
                last = mid -1;
            }
            mid = (first+last)/2;
        }
        
        if (arr[mid] !=x) {
            System.out.println("the number is not in the array..");
        }
    }

    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15,16,17,18,19,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int x = sc.nextInt();
       int first = 0;
       int last = arr.length-1;
       binary(arr, first, last, x);
       
    }
    



}
