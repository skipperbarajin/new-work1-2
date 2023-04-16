import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x,y,z,a,b,c;
        System.out.println("Enter x:");
        x=input.nextDouble();
        System.out.println("Enter y:");
        y=input.nextDouble();
        System.out.println("Enter z:");
        z=input.nextDouble();
        a=Math.pow(x,y)+Math.pow(y,x)/Math.abs(z);
        b=Math.exp(y)-Math.log10(x*z);
        c=Math.max(x,y)%Math.min(y,z);

        System.out.println("Result1:"+Math.round(a));
        System.out.println("Result2:"+Math.floor(b));
        System.out.println("Result3:"+Math.ceil(c));


    }
}