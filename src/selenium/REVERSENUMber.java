package selenium;

import java.util.Scanner;

public class REVERSENUMber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num = sc.nextInt();
	int temp = num;
	int sum=0;
	while(num>0)
	{
		int rem = num%10;
		sum=sum+rem*10;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("The reverse number is "+sum);
	}
	else
	{
		System.out.println("The number is not a reverse number  "+sum);
	}
	
	
}
}
