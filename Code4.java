// WAP to calculate sum of each digit of a 4 digit number also display number in reverse order

public class Code4 {
    public static void main(String args[]){
        int num=8965, rev, a,b,c,d;
        a=num%10;
        num=num/10;
        b=num%10;
        num=num/10;
        c=num%10;
        num=num/10;
        d=num%10;
        num=num/10;
        rev=a*1000+b*100+c*10+d*1;
        System.out.println("each digit :"+a+" "+b+" "+c+"  "+d);
        System.out.println("Reverse Order : "+rev);
    }
}
