import java.util.*;
public class Problem5 {
  public static void main(String[] args) {
    System.out.println("What is your integer?");
    Scanner console = new Scanner(System.in);
    int input = console.nextInt();
    System.out.println(conversion(input));
  }
  public static String conversion(int input) {
    String converted="";
    int x;
    x=input/1000;
    for(int i=1; i<=x;i++) {
      converted+="M";
    }
    input=input%1000;
    x=input/900;
    for(int i=1; i<=x;i++) {
      converted+="CM";
    }
    input=input%900;
    x=input/500;
    for(int i=1; i<=x;i++) {
      converted+="D";
    }
    input=input%500;
    x=input/400;
    for(int i=1; i<=x;i++) {
      converted+="CD";
    }
    input=input%400;
    x=input/100;
    for(int i=1; i<=x;i++) {
      converted+="C";
    }
    input=input%100;
    x=input/90;
    for(int i=1; i<=x;i++) {
      converted+="XC";
    }
    input=input%90;
    x=input/50;
    for(int i=1; i<=x;i++) {
      converted+="L";
    }
    input=input%50;
    x=input/40;
    for(int i=1; i<=x;i++) {
      converted+="XL";
    }
    input=input%40;
    x=input/10;
    for(int i=1; i<=x;i++) {
      converted+="X";
    }
    input=input%10;
    x=input/9;
    for(int i=1; i<=x;i++) {
      converted+="IX";
    }
    input=input%9;
    x=input/5;
    for(int i=1; i<=x;i++) {
      converted+="V";
    }
    input=input%5;
    x=input/4;
    for(int i=1; i<=x;i++) {
      converted+="IV";
    }
    input=input%4;
    x=input/1;
    for(int i=1; i<=x;i++) {
      converted+="I";
    }
    return converted;
  }
}
