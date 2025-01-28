import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'a' value:");
        double a=sc.nextDouble();
        System.out.print("Enter 'b' value:");
        double b=sc.nextDouble();
        System.out.print("Enter operator:");
        char op=sc.next().charAt(0);
        double result;
        switch(op){
            case '+':
            result=a+b;
            System.out.println("result:"+result);
            break;
            case '-':
            result=a-b;
            System.out.println("result:"+result);
            break;
            case '*':
            result=a*b;
            System.out.println("result:"+result);
            break;
            case '/':
            result=a/b;
            System.out.println("result:"+result);
            break;
            default:
            System.out.println("Invalid Operator");
        }
        //System.out.println( result);
    }
}
