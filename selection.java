import java.util.*;
public class selection {
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
    for (int i = 0; i < arr.length-1; i++) {
        int smallest = i;
       for (int j = i+1; j < arr.length; j++) {
           if (arr[smallest]>arr[j]) {
               smallest =  j;
               
           } else {
               continue;
           }
       }
       int temp = arr[smallest];
       arr[smallest]  = arr[i];
       arr[i] = temp;
    }
    System.out.println("the sorted elements are:");
    printArray(arr);


    }

}
