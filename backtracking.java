public class backtracking {
    public static void subsq(String str, int index,String newString) {
        if (str.length()==0) {
          System.out.println(newString);
          return;
        }
   
       for (int i = 0; i < str.length(); i++) {
         String newstr = str.substring(0,i)+str.substring(i+1);
         subsq(newstr, index+1, newString+str.charAt(i));
       }
      }
      public static void main(String[] args) {
     String str = "abbc";
     int index = 0;
     String newString = "" ;
     subsq(str, index, newString);
       }
}
