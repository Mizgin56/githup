package Kodluyoruz;

import java.util.Scanner;

public class kod8 {

	public static void main(String[] args) {
		//Hesap Makinesi 
		
		System.out.println("HESAP MAK�NES� \n1.��LEM : TOPLAMA \n2.��LEM : �IKARMA \n3.��LEM : �ARPMA \n4.��LEM : B�LME");
		
		double a,b,islem;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz ilk say�y� giriniz : ");
		a = scan.nextDouble();
		
		System.out.print("L�tfen i�lem yapmak isyedi�iniz ikinci say�s� giriniz : ");
		b = scan.nextDouble();
		
		System.out.print("L�tfen yapmak istedi�iniz i�lem numaras�n� giriniz : ");
		islem = scan.nextDouble();
		
		if (islem == 1) {
			System.out.print("��LEM SONUCU : " + (a+b));
		
		}else if (islem == 2) {
			System.out.print("��LEM SONUCU : " + (a-b)) ;
			
		}else if (islem == 3) {
			System.out.print("��LEM SONUCU : " + (a*b));
			
		}else if (islem == 4) {
			System.out.print("��LEM SONUCU : " + (a/b));
		}else {
			System.out.print("HATALI ��LEM NUMARSI !!!");
		}
		
				
				
		
		

	}

}
