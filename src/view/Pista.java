// git@github.com:01Trixie/SemaforoLista05_Ex4.git

package view;

import java.util.concurrent.Semaphore;
import controller.Corrida;
public class Pista {
	public static void main(String[] args) {
		int permissao = 1;
		
		Semaphore semaforo = new Semaphore(permissao);
		
		for(int idCarro = 0; idCarro < 7; idCarro++) {
			Thread tPista = new Corrida(idCarro);
			tPista.start();
		}
	}

}
