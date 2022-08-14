import java.util.*;
public class towerhanoi {
    static void hanoiTower(int a,char src,char hel,char des)
    {
      if (a==1) {
        System.out.println("transfer disk "+a+" from "+src+" to "+des);
        return;
        
      }
      hanoiTower(a-1, src, des , hel);
      System.out.println("transfer disk "+a+" from "+src+" to "+des);
      hanoiTower(a-1, hel, src, des);
    }
    
 
   public static void main(String[] args) {
   System.out.println("enter the number of disks:");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   System.out.println("The sourse , helper ,destination name are :");
   char src = 'A';
   char hel  = 'B';
   char des = 'C';
   hanoiTower(a,src,hel,des);
    }
}
