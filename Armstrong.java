package Kodluyoruz;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// Armstrong say� bulma
 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen i�lem yapmak istedi�iniz say�y� giriniz : ");
		int numara = scan.nextInt();
		int basNumara = 0;
		int tempNumara = numara;
		int ilkNumara;
		int toplam = 0;
		int basPow;
		
		
		while(tempNumara != 0) {
			tempNumara /= 10;
			basNumara++;
		}
		
		tempNumara =  numara;
		while(tempNumara != 0) {
			ilkNumara = tempNumara % 10;
			basPow = 1;
			for(int i = 1; i<= basNumara; i++) {
				basPow *= ilkNumara;
			}
			
			toplam += basPow;
			tempNumara /= 10;
		}
		
		if(toplam == numara) {
			System.out.print(numara + " Say�y� bir Armstrong say�d�r : " );
		}else {
			System.out.print(numara + " Say�y� bir Armstrong say� de�ildir : " );

		}
		

	}

}
