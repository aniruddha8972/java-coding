import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        //add element..
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element..
        int element = list.get(0);
        System.out.println(element);

        //add element in index
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(3, 4);
        System.out.println(list);

        //delete element
        list.remove(1);
        System.out.println(list);

        //size of list
       int Size =  list.size();
       System.out.println(Size);

       //sorting
       Collections.sort(list);
       System.out.println(list);

       //checking the arraylist is empty or not;

       System.out.println(list.isEmpty());

       //geting the index of the element of the arraylist ......if the element is not in the arraylist it returns -1 as output;
       System.out.println(list.indexOf(4));


       //to make a duplicate copy for output;
      System.out.println(list.clone());

      //if the element is in the array it returns true else returns false..
      System.out.println(list.contains(5));

      list.subList(1, 2);
      System.out.println(list.subList(1,3));

    }
}
