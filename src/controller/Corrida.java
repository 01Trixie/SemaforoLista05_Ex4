package controller;

import java.util.concurrent.Semaphore;

public class Corrida extends Thread {
	
	private int idCarro;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	private int distanciaPercorrida = 0;
	int [][] lugar = new int[3][6];

	// METODO CONSTRUTOR DA CLASSE
	public Corrida(int idCarro) {
		this.idCarro = idCarro;
	}
	
	// INICIAR A THREAD
	public void run() {
		percurso();
	}
	
	public void percurso() {
		int distanciaTotal = (int) (Math.random() * 3601);
		int deslocamento = 300;
		int tempo = 1000;
		
		while (distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			String status = "#" + idCarro + " ja andou " + distanciaPercorrida + "m";
			String podium = "#" + idCarro + " foi o " + posChegada + "° a chegar.";
			posChegada++;
			try {
				sleep(tempo); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(status);
			if(distanciaPercorrida == 12.000) {
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 6; i++) {
						lugar[i][j] = idCarro;
						System.out.println(podium);
					}
				}
			} else if(distanciaPercorrida == 24.000) {
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 6; i++) {
						lugar[i][j] = idCarro;
						System.out.println(podium);
					}
				}
			}else if(distanciaPercorrida == 36.000) {
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 6; i++) {
						lugar[i][j] = idCarro;
						System.out.println(podium);
					}
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; i++) {
				System.out.println(lugar[i][j]);
			}
		}
		
	}
	
}

