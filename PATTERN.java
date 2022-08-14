import java.util.*;
public class PATTERN {
public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    for (int i = 0 ; i <= 6; i++) {
    //    System.out.println(a);
         for (int j = 0; j <=6; j++) {
                if (j==i) {
                    System.out.print("  ");
                    
                }
                else{
                    System.out.print("* ");
                }
             }
             System.out.println();  
         }
    }
}