package ff.mm;

import java.util.Scanner;

public class bolme {

	public static void main(String[] args) {
		Scanner tara= new Scanner (System.in);
		System.out.println("İlk sayı giriniz: ");
		float a = tara.nextInt();
		System.out.println("İkinci sayı giriniz: ");
		float b = tara.nextInt();
		System.out.println("Cevap: "+ bolme(a,b));
	}
	public static float bolme(float a,float b){
		
		return a/b ;
	}

}
