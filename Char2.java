import java.util.*;
public class Char{
  public static void main(String[] args){
    Scanner scr  = new Scanner(System.in);
    String ss = scr.next();
    int n = scr.nextInt();
    String sc = ss.substring(ss.length()-n,ss.length());
    System.out.println(sc);
  }
}
