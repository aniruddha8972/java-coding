import java.util.*;
public class array {
public static void main(String[] args) {
Scanner ob1 = new Scanner(System.in);
System.out.println("enter the size of array");
int a = ob1.nextInt();
int b = ob1.nextInt();
int arr[][] = new int[a][b];
System.out.println("entar the numbers:");
for (int i = 0; i < a; i++) {
    for (int j = 0; j < b; j++) {
        arr[i][j] = ob1.nextInt();
    }
}
System.out.println("enter the number that you want to search:");
int c = ob1.nextInt();
for (int i = 0; i < a; i++) {
    for (int j = 0; j < b; j++) {
        if (arr[i][j] ==c) {
            System.out.println("the number is in the index:\n"+i+","+j);
           }
           else{
              continue;
           }
        
    }
}
}
}


