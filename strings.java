import java.util.*;
public class strings {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enyter name:");
//         String name = sc.nextLine();
//         System.out.println("enter title:");
//         String title = sc.nextLine();
//         String fullname = name+ " " + title;
//         System.out.println(" the full name is :");
//         System.out.println(fullname);
//         System.out.println(fullname.length());
//        for (int i = 0; i < fullname.length(); i++) {
//            System.out.println(fullname.charAt(i));
//        }
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter names:");
//     String name1 = sc.nextLine();
//     String name2 = sc.nextLine();
//     if (name1.compareTo(name2)==0) {
//         System.out.println("the strings are equal--");
//     } 
//     else if(name1.compareTo(name2)>0) {
//         System.out.println(name1+" is greater than "+ name2);
//     }
//     else {
//         System.out.println(name1+" is smaller than "+ name2);
//     }
// }


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter sentences:");
//     String sentence  = sc.nextLine();
//     System.out.println("enter the substring index:1.starting ,2.ending");
//     System.out.println(sentence.substring(sc.nextInt(),sc.nextInt()));
    
// }
// public static void main(String[] args) {
//    StringBuilder sb = new StringBuilder("aniruddha");
//    sb.setCharAt(3, 'x');    
//    System.out.println(sb);
//    sb.insert(3, "r");
//    System.out.println(sb);
//    sb.delete(4, 4);
//    System.out.println(sb);
//    sb.append("xe");
//    System.out.println(sb);
//    System.out.println(sb.length());
// }

public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    StringBuilder name = new StringBuilder(obj.nextLine());
    System.out.println("the name is:\n"+name);
    name.reverse();
   
    System.out.println(name);

}
}


