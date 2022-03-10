import java.util.Scanner;
class ass26
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int res1,res2,res3,res4,res5;
int no1=sc.nextInt();
System.out.println("first no"+no1);
int no2=sc.nextInt();
System.out.println("second no"+no2);
res1=no1+no2;
res2=no1-no2;
res3=no1*no2;
res4=no1/no2;
res5=no1%no2;
System.out.println("result "+res1);
System.out.println("result "+res2);
System.out.println("result "+res3);
System.out.println("result "+res4);
System.out.println("result "+res5);
}
}