import java.util.*;
public class CFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int arr[] = new int[N];
     
      for (int i = 0; i < N; i++) {
        arr[i] =sc.nextInt();
      }
      int count = 0;
      for (int i = 0; i < N; i++) {
        int visited = arr[i];
        if (arr[i]==visited) {
          count=count+1;
        } else {
          continue;
        }
        System.out.println(count);
      }
    }
}