import java.util.Scanner;
class LCM{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int lcm = (num1>num2)?num1:num2;
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
				break;
			else
				lcm++;
		}
		System.out.println("LCM of "+num1+ "and "+num2+" is "+lcm);
	}
}