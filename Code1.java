// WAP to calculate total and average of three numbers

import java.util.Scanner;
public class Code1 {
    public static void main(String args[]){
        int num1 ,num2, num3 ,total,ave;
        System.out.println("Enter three numbers:");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        total=num1+num2+num3;
        ave=total/3;
        System.out.println("Total : "+total);
        System.out.println("Average :"+ave);


    }
}
