package Polimurfisme;

public class ResidentEvil {
	
	public static void main(String[] args) {
		Zombie [] zombie = new Zombie [3];
		
		zombie[0] = new Alice();
		zombie[1] = new LeonKennedy();
		zombie[2] = new AdaWong();
		
//		loop
		
		for ( int i = 0; i < zombie.length; i++) {
			zombie[i].virus();
			zombie[i].makan();
			zombie[i].bergerak();
			System.out.println();
		}
	}
}
