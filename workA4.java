import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float de1,num1,de2,num2,x,y,xy;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter numerator1:");
        num1=input.nextFloat();
        System.out.println("Enter denominator1:");
        de1=input.nextFloat();
        System.out.println("Enter numerator2:");
        num2=input.nextFloat();
        System.out.println("Enter denominator2:");
        de2=input.nextFloat();
        x=num1/de1;
        y=num2/de2;
        xy=x*y;

        System.out.println("result is:"+xy);
    }
}