import java.util.*;
public class Char{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    String s = sc.next();
    int nn = sc.nextInt();
    String sc1 = s.substring(s.length()-nn,s.length());
    System.out.println(sc1);
  }
}
