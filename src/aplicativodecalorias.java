import java.util.Scanner;
public class aplicativodecalorias {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("X:");
	int X = ler.nextInt();
	System.out.println("Q1:");
	int Q1 = ler.nextInt();
	System.out.println("Q2:");
	int Q2 = ler.nextInt();
	System.out.println("Q3:");
	int Q3 = ler.nextInt();
	
	
	if (Q2-Q1<=X) 
	{
		System.out.println("O numero de calorias é:"+Q2);
	}
	else {System.out.println("O numero de calorias é:"+Q3);
	}
	}
}

