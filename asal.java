package Kodluyoruz;

public class asal {

	public static void main(String[] args) {
		// Asal say� Bulma
		
		int sayac = 0;
     
		for (int i = 2; i <= 100; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(i);
            } 
            sayac = 0;
        }
	}

}
