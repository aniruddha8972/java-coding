import java.util.*;
public class insertation {
    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
        
   
   public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the element of numbers that you want to sort: ");
    int a = obj.nextInt();
    int arr[] = new int[a];
    System.out.println("enter the numbers :");
    for (int i = 0; i <a; i++) {
        arr[i] = obj.nextInt();
    }
    System.out.println(" your given elements are:");
    printArray(arr);
    
    
    for (int i = 1; i < arr.length; i++) {
        int j = i-1;
        int current = arr[i];
        while (j>=0 && current<arr[j]) {
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = current;
    }
   
    System.out.println("the sorted elements are:");
    printArray(arr);


    }

}
