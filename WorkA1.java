import java.util.Scanner;
public class WorkA1 {
    public static void main(String[] args) {
        float num1,num2,sum,dif,pro,quo,le;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        num1=input.nextFloat();
        System.out.println("Enter number 2:");
        num2=input.nextFloat();
        sum=num1+num2;
        dif=num1-num2;
        pro=num1*num2;
        quo=num1/num2;
        le=num1%num2;
        System.out.println("sum:"+sum+"\n"+"dif:"+dif+"\n"+"pro:"+pro+"\n"+"quo:"+quo+"\n"+"le:"+le);

    }
}
//subtraction-