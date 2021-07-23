package com.ust.examples;

abstract interface MusicPlayer{
	public static final int defaultVolume=30;
	
	public abstract void play(String p);
	public abstract void stop(String p);
	
}

class Mpp implements  MusicPlayer{
	
	public void play(String p) {
		if(p=="voilin") {
			System.out.println("play");
			
		}
		else {
			System.out.println("pause");
		}
	}
	public void stop(String p) {
		if(p=="jazz") {
			System.out.println("stop");
			
		}
		else {
			System.out.println("play");
			
		}
	}
	
	
}

public class Example48 {

	public static void main(String[] args) {
		Mpp m=new Mpp();
		m.play("voilin");
		m.stop("jazz");
		

	}

}
