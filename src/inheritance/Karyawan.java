package inheritance;

public class Karyawan {
	String NIP;
	String nama;
	String jenisKelamin;
	
	public void kerja() {
		System.out.println("Saatnya Ngajar");
	}
	
	public void namaKamu(String nama) {
		this.nama = nama;
	}
}
