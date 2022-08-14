
import java.util.*;
public class switchcase{
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("enter the numbers");
       int a  = obj.nextInt();
       int b = obj.nextInt();
       System.out.print("press 1 for addition\npress 2 sub\npress 3 for mul\npress 4 for div\npress 5 for mod\n");
       int mode = obj.nextInt();
       int c;
     switch (mode) {
         case 1:
             c = (a+b);
             System.out.println("the output is\n "+c);
             break;
         case 2:
             c = (a-b);
             System.out.println("the output is\n"+c);
             break;
         case 3:
             c = a*b;
             System.out.println("the output is\n"+c);
             break;
         case 4:
             c = a/b;
             System.out.println("the output is\n"+c);
             break;
         case 5:
             c = a%b;
             System.out.println("the output is\n"+c);
             break;
     
         default:
             System.out.println("invalid input");
             break;
     }
    
        
       
}
}