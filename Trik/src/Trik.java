import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		int s=1,b=0,l=0; // กำหนดค่าเริ่มให้แก้วทั้ง 3 ใบ
		int tmp=0; //ใช้สำหรับพักค่า เพื่อที่จะสลับค่า
		String text = null; //ใช้รหับค่า A B C รูปแบบการสลับ
		char Char;
		Scanner scan =  new Scanner(System.in);
		do{
		System.out.println("Enter Value 50 character (A or B or C) : "); 
		text=scan.next();
		}while(text.length() > 50 || text.length() < 1 || text.length() == 0);
		for(int i=0;i<text.length();i++)
		{
			Char=text.charAt(i);
			if(Char=='A'|| Char=='a')
			{
				tmp=s;
				s=b;
			=tmp;
			}
			if(Char=='B'|| Char=='b')
			{
				tmp=c;
				c=l;
				l=tmp;
			}
			if(Char=='C'|| Char=='c')
			{
				tmp=r;
				r=l;
				l=tmp;
			}
		}
		if(r==1)System.out.println("glass 1");
		if(c==1)System.out.println("glass 2");
		if(l==1)System.out.println("glass 3");
		}

	}


