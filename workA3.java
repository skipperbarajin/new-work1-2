import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km,t,l,x;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The distance:");
        km=input.nextFloat();
        System.out.println("Enter The fuel prices:");
        t=input.nextFloat();
        System.out.println("Enter The Consumption in 100km:");
        l=input.nextFloat();
        x=km*(l/100)*t;

        System.out.println("Travel expenses is:"+x+"Toman");
    }
}