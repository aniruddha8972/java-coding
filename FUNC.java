import java.util.*;
public class FUNC {
     public static int factorial(int n){
         if (n==1||n==0) {
             return 1;
             
         } else {
             return(n*factorial(n-1));
         }
        }
public static void main(String[] args) {

    Scanner numbers = new Scanner(System.in);
    System.out.println("enter the number:");
    int a= numbers.nextInt();
   System.out.println("the factorial of "+a+" is:\n"+factorial(a));
} 
}