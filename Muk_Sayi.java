package Kodluyoruz;

import java.util.Scanner;

public class Muk_Sayi {

	public static void main(String[] args) {
		// M�kemmel Say�
		
		int sayi;
		//int bol = 0;
		int toplam = 0;
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("L�tfen i�lem yapmak istedi�iniz say�y� giriniz : ");
		 sayi = scan.nextInt();
		 
		 if(sayi<0) {
			 System.out.print("L�tfen pozitif bir tam say� giriniz !");
		 }else {
			 for(int i = 1; i<sayi; i++) {
				 if(sayi % i == 0) {
					 toplam += i;
				 }
			 }
			 

		 }
		 
		 if(toplam == sayi) {
			 System.out.print(sayi + " Say�s� m�kemmel bir say�d�r :)");
		 }else {
			 System.out.print(sayi + " Say�s� m�kemmel bir say� de�ildir :( ");
		 }
		 
		 
	}

}
