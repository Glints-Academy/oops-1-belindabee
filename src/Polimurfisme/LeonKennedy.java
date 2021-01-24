package Polimurfisme;

public class LeonKennedy extends Zombie {
	
	@Override
	void virus() {
		System.out.println("Pembunuh T Varus dan Seorang Polisi Inteligent");
	}
	
	@Override
	void makan() {
		System.out.println("Makan seadanya yang penting cukup nambah Energi");
	}
	
	@Override
	void bergerak() {
		System.out.println("Sangat Lincah dan tanggap");
	}
}
