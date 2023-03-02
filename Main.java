import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h,m,s,i;
        System.out.print("Enter second:");
        i=input.nextInt();
        h=i/3600;
        m=(i%3600)/60;
        s=m%60;

        System.out.println("Result="+h+":"+m+":"+s);

        }
    }