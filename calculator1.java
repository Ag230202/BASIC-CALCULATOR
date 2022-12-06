import java.util.Scanner;
import java.lang.Math;

public class calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		int choice;
		char sym;
		
		choice=1;
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		
		while (choice==1 ) {
			
			System.out.println("Enter the first number:");
			num1=sc.nextDouble();
			System.out.println("Enter the second number and except 0:");
			num2=sc.nextDouble();
			System.out.println("Enter the symbol :");
			System.out.println("Addition:\"+\" , Substraction:\"-\",Multiplication:\"*\" , Division:\"/\"");
			System.out.println("Power:\"^\", Modulus:\"/\"");
			sym=sc.next().charAt(0);
			
			
			if (sym=='+')
			{
				double add=num1+num2;
				System.out.println(num1 +" "+ sym+" "+num2+"="+add);
			}
			else if (sym=='-')
			{
				double sub=num1-num2;
				System.out.println(num1 +" "+ sym+" "+num2+"="+sub);
			}
			else if (sym=='*')
			{
				double prod=num1*num2;
				System.out.println(num1 +" "+ sym+" "+num2+"="+prod);
			}
			else if (sym=='/' && num2!=0)
			{
				double div=(double) (num1/num2);
				System.out.println(num1 +" "+ sym+" "+num2+"="+div);
				
			}
			else if (sym=='%')
			{
				double rem=num1%num2;
				System.out.println(num1 +" "+ sym+" "+num2+"="+rem);
			}
			else if (sym=='^')
			{
				double pow= Math.pow(num1, num2);
				System.out.println(num1 +" "+ sym+" "+num2+"="+pow);
			}
			
	
			else {
				System.out.println("Wrong input or symbol");
			}
		}
		 System.out.println("End of calculation");
			
			
		}

	}


