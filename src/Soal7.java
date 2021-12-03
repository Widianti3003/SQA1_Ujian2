
public class Soal7 {
	
	public static void main(String[] args) {
		Soal7 simpedes = new Soal7("Tessy Wahyuni Riwayati", 89, 100000);
		simpedes.cekSaldo();
		simpedes.setor(8000);
		simpedes.cekSaldo();
		simpedes.tarik(23000);
		simpedes.tarik(6000);
		simpedes.cekSaldo();
		simpedes.toString();
		System.out.println("Saldo anda saat ini adalah "+simpedes.getSaldo());
		System.out.println("Setoran sebesar "+simpedes.getNomor()+" berhasil dilakukan, Saldo anda sekarang "+simpedes.getCekSaldo());
		System.out.println("Saldo anda saat ini adalah "+simpedes.getCekSaldo());
		System.out.println("Penarik sebesar "+simpedes.getTarik()+" saldo anda sekarang "+simpedes.getCekSaldo1());
		System.out.println("Saldo anda saat ini adalah "+simpedes.getCekSaldo1());
	}
		private String nama = null;
		private int nomor=0;
		private int saldo=0;
		public Soal7 (String nama,int nomor,int saldo) {
			this.nama=nama;
			this.nomor=nomor;
			this.saldo=saldo;
		}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNomor() {
		return nomor;
	}
	public void setNomor(int nomor) {
		this.nomor = nomor;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public void cekSaldo() {
		int cekSaldo = saldo + saldo;
	}
	public int getCekSaldo() {
		return getCekSaldo();
	}
	public void cekSaldo1() {
		int cekSaldo1 = saldo - getTarik();
	}
	public int getCekSaldo1() {
		return getCekSaldo1();
	}
	public void setor(int x) {
		int setor = x ;
	}
	public void tarik(int x) {
		if (getCekSaldo() <= getTarik()) {
			System.out.println("Pernarikan anda tidak dapat dilakukan karena saldo tisak cukup");
		}else {
			int tarik = x;
		}
	}
	public int getTarik() {
		return getTarik();
	}
}
