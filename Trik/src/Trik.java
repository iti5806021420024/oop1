import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		int r=1,c=0,l=0; // ��˹��������������Ƿ�� 3 �
		int tmp=0; //������Ѻ�ѡ��� ���ͷ�����Ѻ���
		String text = null; //����Ѻ��� A B C �ٻẺ�����Ѻ
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
				tmp=r;
				r=c;
				c=tmp;
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


