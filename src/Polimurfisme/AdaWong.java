package Polimurfisme;

public class AdaWong extends Zombie {
	
	@Override
	void virus() {
		System.out.println("Pembunuh T Varus dan Seorang Mata-mata");
	}
	
	@Override
	void makan() {
		System.out.println("yang bergizi");
	}
	
	@Override
	void bergerak() {
		System.out.println("Sangat Lincah dalam menembak");
	}
}
