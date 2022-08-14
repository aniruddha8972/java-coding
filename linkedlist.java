import java.util.*;
public class linkedlist {
    void rev(linkedlist ll,linkedlist ll1){
      ll.rev(ll, ll1);    
      System.out.println(ll1);
    }

    
    
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<>();
        LinkedList <String> ll1 = new LinkedList<>();
        

        ll.add("i");
        ll.add("am");
        ll.add("aniruddha");
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
// .addFirst()   ..    .addLast()
//.add(index,element).. .... .addAll(int index, Collection<E> c)
// .clear()
//.clone()
  System.out.println(ll.contains("am"));
System.out.println(ll.get(0));
//.getFirst()       .getLast()
System.out.println(ll.indexOf("i"));
//.lastIndexOf(object)
ll.offer("Giri");//offers the last element
System.out.println(ll);
ll.push("aniruddha");
System.out.println(ll);
ll.remove("aniruddha");
System.out.println(ll);
ll.set(2, "aniruddha");
System.out.println(ll);


//convert to an array
ll.toArray();
for (int i = 0; i < ll.toArray().length; i++) {
    System.out.println(ll.toArray()[i]);
}
//to string
System.out.println(ll.toString());

}
}
