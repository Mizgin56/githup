package Kodluyoruz;

import java.util.Scanner;

public class kod_16 {

	public static void main(String[] args) {
		// Art�k y�l hesaplama
		
		int yil;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen hesaplamak istedi�iniz y�l� giriniz : ");
		yil = scan.nextInt();
		
		if(yil % 4 == 0 && yil % 100 != 0) {
			System.out.print( yil + " " +"Y�l� Art�k Y�ld�r :) ");
		}else if(yil % 100 == 0 && yil % 400 == 0) {
			System.out.print(yil + " " +"Art�k Y�ld�r :) ");
		}else {
			System.out.print(yil + " " +"Art�k Y�l De�ildir :( ");
		}
		
		
		
		
	}
	

}
