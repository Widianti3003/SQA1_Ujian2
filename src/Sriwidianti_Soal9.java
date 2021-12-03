import java.util.Scanner;

public class Sriwidianti_Soal9 {
	public int jumlahArray(int[] nilai) {
		Scanner in = new Scanner (System.in);
		int batas = in.nextInt();
		System.out.println("Masukkan nilai maksimal deret = ");
		 int sum = 0;
		 for (int i = 0; i<nilai.length; i++) {
		  sum += nilai[i];
		 }
		 return sum;
		}
		public boolean cariNilai(int[] arr, int nilai) {
			 for (int x = 0; x<arr.length; x++) {
				  if (arr[x] == nilai)
				   return true;
				 }
				 return false;
				}
}
