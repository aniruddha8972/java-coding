
import java.util.*;

public class gfgprobs {

   public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> list  = new ArrayList<>();
    for (int i = 0; i <arr.size(); i++) {
        if (arr.get(i) == k) {
            for (int j = i; j >= 0; j--) {
                list.add(arr.get(j));
            }
            for (int j = i+1; j <arr.size(); j++) {
                list.add(arr.get(j));
            }
            System.out.println(list);
           
        }
    }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <N; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr.size());
        int k = sc.nextInt();
        reverseInGroups(arr, N, k);
    }
}
