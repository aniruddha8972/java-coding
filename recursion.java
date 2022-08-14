import java.util.*;
 class recursion { 
//     static int factorial(int a) {
//     if (a==0||a==1) {
//         return 1;
//     }
//     int sum = a*factorial(a-1);
//      return sum;  
//     }
   
//    public static void main(String[] args) {
//    System.out.println("enter the number that you wanna get factorial:\n");
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    System.out.println("the factorial of the number is:\n"+ factorial(a));
//     }


//                               _______________________fibonacci series__________________________

// static void fibonacci(int a,int b,int n)
// {
//     int nextnum  = 0;
//      if (n>0) {
//     nextnum = a+b;
//     a = b;
//     b= nextnum;
//     System.out.println(nextnum);
    
//       fibonacci(a,b,n-1);
// }
// }

// public static void main(String[] args) {
// System.out.println("enter how many fibonacci numbers you want to print:");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int a =0;
// int b = 1;
// System.out.println("the factorial of the number is:");
// System.out.println(0+"\n"+1);
// fibonacci(a,b,n-2);
// }



 //                           ______________________x^n functoin________________________________


//  static int powerOf(int a,int n)
//  {
//    if (n==0) {
//      return 1;
//    } else {
//      return a*powerOf(a, n-1);
//    }
//  }
 

// public static void main(String[] args) {
// System.out.println("enter the number that you wanna to power of'^' :");
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println("enter the number that how many times you wanna power of :");
// int n = sc.nextInt();
// System.out.println("the sum is :");
// System.out.println(powerOf(a, n));

//  }



//                                    _____________________________string reverse___________________________
// static void strrev(String A,int index)
//     {
//       if (index==0) {
//         System.out.print(A.charAt(index));
//         return;
//       }
//       System.out.print(A.charAt(index));
//       strrev(A,index-1);
      
//     }
    
 
//    public static void main(String[] args) {
//    System.out.println("enter the srting:");
//    Scanner sc = new Scanner(System.in);
//    String A  = sc.nextLine();
//    int index = A.length()-1;
//    strrev(A, index);
   
//     }

//                                            _____________________________occurance of an element_________________________

// public static int first = -1;
//    public static int last = -1;

//     static void Occurence(String A,int index,char element)
//     {
//       if (index == A.length()) {
//         System.out.println("the first occurence is :\n"+first);
//         System.out.println("the last occurence is :\n"+last);
//         return;
//       }
      
//       if (A.charAt(index)==element) {
//         if (first==-1) {
//           first= index;
//         }
//         else
//         {
//           last = index;
//         }
//       }
//       Occurence(A, index+1, element);
//     }
    
 
//    public static void main(String[] args) {
//    System.out.println("enter the srting:");
//    Scanner sc = new Scanner(System.in);
//    String A  = sc.nextLine();
//    System.out.println("enter the element that you want to search  :");
//    char element = sc.next().charAt(0);
//    int index = 0;
//    Occurence(A, index, element);
   
//     }


// -------------------------------replace all x to the end of a string-----------------------


  public static void move(String str, int index,int count, StringBuilder STR) {
    if (index == str.length()) {
     for (int i = 0; i <count; i++) {
       STR.append('x');
     }
     System.out.println("the new string is:\n"+STR);
      return;
    }
    if (str.charAt(index) == 'x') {
      count++;
    }
    else
    {
      STR.append(str.charAt(index));
    }
    move(str, index+1,count, STR);
  }
   

  public static void main(String[] args) {
 String str = "abcxxxxxxdx";
 int index = 0;
 int count = 0;

 StringBuilder STR = new StringBuilder();
 move(str, index,count, STR);
   }
 
}


