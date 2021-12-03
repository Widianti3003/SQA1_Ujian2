import java.util.Scanner;

public class Sriwidianti_Soal1 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
		}
		static void cetakFibonacci(int batas) {
		// silakan isi bagian ini
			 long fib[] = new long[batas];
	         
		        fib[0] = 0;
		        fib[1] = 1;
		         
		        for(int i = 2; i < batas; i++) {
		            fib[i] = fib[i-1] + fib[i-2];
		        }
		         
		        for (int i = 0; i < batas; i++) {
		            System.out.print(fib[i] +  " ");
		        }
		    }

}
