import java.util.*;
// class pen{                                                         //---|
//         String colour;                 //------|                        |
//     String type;                      //-------|----->PROPERTIES        |
//                                                                 //      |---------->CLASS
//     //  public void write(){                                   //       |
//     //     System.out.println("writing something");           //--------|-------------------------------->method        
//     //  }                                                    //         |
//     //  public void printcolour(){                          //          |
//     //     System.out.println(this.colour);                //           |
//     //  }                                                 //            |
//     //  public void printtype(){                         //             |
//     //     System.out.println(this.type);               //              |
//     //  }                                              //               |
//                pen(String colour,String type){        //                |                         ------|
//                 this.colour = colour;                //                 |                               |
//                 this.type = type;                   //                  |                               |-------->parameterize constructor..
//                }                                   //                   |                               | 
// }                                                                  //---|                        -------|
// public class EXP {
//     public static void main(String[] args) {
//         pen pen1 = new pen("red","ball pen");//--------------->COCNSTRUCTORS
//         System.out.println(pen1.colour +"\n"+ pen1.type);
//     }
// }

//-------------------------------------Inheritence----------------------------------
class shape{
    public void creating_shape(){
        System.out.println("creating a new shape \n");
    }
}
class traingle extends shape{
    public void creating_traingle(int l,int h){
        System.out.println("creating a new traingle"+"\n"+(1*l*h)/2);
    }                        //--------------------------------------------------------------single level inheritance
}
class bileteral extends traingle{
    public void creating_biletarel(int l){
        System.out.println("creating a new biletaral traingle"+"\n"+(1*l*l)/2);
    }                      //---------------------------------------------------------------multi level ingheritence
}
class rectengle extends shape{
    public void creating_rectengle(int x,int y){
        System.out.println("creating a new rectangle"+"\n"+x*y);
    }                   //---------------------------------------------------------------------hierarcial inheritance 
}
class square extends rectengle{
    public void creating_square(int r){
        System.out.println("creating a new square"+"\n"+r*r);
    }                  //----------------------------------------------------------------------hybrid inheritence
}
public class EXP {

public static void main(String[] args) {
    shape A2 = new shape();
    square A1 = new square();
    bileteral A3 = new bileteral();
    A1.creating_shape();
    A2.creating_shape();
    A1.creating_rectengle(3, 4);
    A1.creating_square(3);
    A3.creating_shape();
    A3.creating_traingle(3, 4);
    A3.creating_biletarel(4);

    }
}