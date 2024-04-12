// WAP to convert temprature Celsius to fahrenheit 

import java.util.Scanner;
public class Code2 {
    public static void main(String args[]){
        double feh , cen;
        System.out.println("Convert centigrate to fehrenheit");
        Scanner sc=new Scanner(System.in);
        cen=sc.nextDouble();
        feh=(1.8*cen)+32;
        System.out.println("fenrenheit : "+feh);
    }
}
