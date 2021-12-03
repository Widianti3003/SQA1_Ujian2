import java.util.Scanner;

public class Sriwidianti_Soal4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan    = new Scanner(System.in);
		double sisa;
		int sisaJarak, jarakPerLiter, ubahwaktu;
		int totalJam, modWaktu;
		 System.out.print("Masukkan sisa BBM dalam tangki (liter) : ");
	        sisaJarak = scan.nextInt();

	      System.out.print("Masukkan konsumsi BBM kendaraan (km/liter) : ");
	      jarakPerLiter= scan.nextInt();
	      
	      	
	        
	        sisa       = sisaJarak * ((double) jarakPerLiter);
	      
	        System.out.printf("kecepatan rata rata anda adalah "+ "%d jam/km", sisaJarak);
	}
	
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}
}
