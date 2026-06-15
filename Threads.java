package com.CSE2027.day1;
import java.util.*;

public class Threads {
	class MusicApp extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				
				System.out.println("Play song");
				System.out.println("Lyrics");
			}
		}
	}

	public static void main(String[] args) {
		
		

	}

}
