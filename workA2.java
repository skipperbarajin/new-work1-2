import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      double a,b,x,y,m,s,xy,ab;
      Scanner input=new Scanner(System.in);
      System.out.println("Enter THE length of the house:");
      a=input.nextDouble();
        System.out.println("Enter THE width of the house:");
        b=input.nextDouble();
        System.out.println("Enter THE length of the yard:");
        x=input.nextDouble();
        System.out.println("Enter THE width of the yard:");
        y=input.nextDouble();
        xy=x*y;
        ab=a*b;
        m=xy-ab;
        s=m/2.3;

        System.out.println("The length of time it takes:"+s+" Second");
    }
}