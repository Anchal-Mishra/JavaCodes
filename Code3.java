// WAP to interchange the value of two variables  without using a third variable

import java.util.Scanner;
public class Code3 {
    public static void main(String args[]){
        int num1 , num2;
        System.out.println("Interchange two numbers");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Number before interchange : ");
        System.out.println(num1+" "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Number after interchange : ");
        System.out.println(num1+" "+num2);
    }
}
