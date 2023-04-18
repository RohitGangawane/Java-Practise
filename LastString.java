public class LastString {
  public static void main(String[] args) {
     stringl s1 = new stringl();
     s1.lastStr("Hello World Rohit");
  }

}

class stringl {
    void lastStr(String Str) {

        String arr[] = Str.split(" ");
    
        System.out.println( arr[arr.length-1]);

    }
}

