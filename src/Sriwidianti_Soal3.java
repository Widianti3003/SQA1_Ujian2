import java.util.Scanner;

public class Sriwidianti_Soal3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan    = new Scanner(System.in);
		double waktu;
		int jarakTempuh, kecepatan, ubahwaktu;
		int totalJam, modWaktu;
		 System.out.print("Masukan jarak (kilometer) : ");
	        jarakTempuh     = scan.nextInt();

	      System.out.print("Masukan waktu (jam) : ");
	      kecepatan       = scan.nextInt();
	      
	      	jarakTempuh = jarakTempuh * 1000;
	        kecepatan   = kecepatan * 1000;
	        
	        waktu       = jarakTempuh / ((double) kecepatan / 3600);
	        ubahwaktu  = (int) waktu;

	        modWaktu    = ubahwaktu % 3600;
	        totalJam    = (ubahwaktu - modWaktu) / 3600; 
	        System.out.printf("kecepatan rata rata anda adalah "+ "%d jam/km", totalJam);
	}
	
	static void hitungKecepatan(int hitungKecepatan ) {
		new Sriwidianti_Soal3 ();
		System.out.println(hitungKecepatan);
	
		}
}
