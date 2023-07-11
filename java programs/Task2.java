import java.util.Scanner;

public class Task2{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    String s="Naveed";  
    String ch="";
    for(int i=s.length-1; i>=0; i--)
    {
      ch+=s.charAt(i);
    }
    System.out.println(ch);
  } 
  }