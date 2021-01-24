package Polimurfisme;

public class Alice extends Zombie {
	
	@Override
	void virus() {
		System.out.println("Membunuh T Virus dan Zombie");
	}
	
	@Override
	void makan() {
		System.out.println("Makan makanan layaknya manusia");
	}
	
	@Override
	void bergerak() {
		System.out.println("sangat cepat dan tanggap");
	}
}
