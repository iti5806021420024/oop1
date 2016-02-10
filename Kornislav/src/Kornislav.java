import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int number1,number2,number3,number4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number_1 : ");
		number1=scan.nextInt();
		System.out.print("Input number_2 : ");
		number2=scan.nextInt();
		System.out.print("Input number_3 : ");
		number3=scan.nextInt();
		System.out.print("Input number_4 : ");
		number4=scan.nextInt();
		if(number1>number2)
		{
			temp=number1;
			number1=number2;
			number2=temp;
		}
		if(number1>number3)
		{
			temp=number1;
			number1=number3;
			number3=temp;
		}
		if(number1>number4)
		{
			temp=number1;
			number1=number4;
			number4=temp;
		}
		if(number2>number3)
		{
			temp=number2;
			number2=number3;
			number3=temp;
		}
		if(number2>number4)
		{
			temp=number2;
			number2=number4;
			number4=temp;
		}
		if(number3>number4)
		{
			temp=number3;
			number3=number4;
			number4=temp;
		}
		System.out.print("\nRectangle Area = : "+""+number3+""+" * "+number1+" = "+number3*number1);
	}
}



