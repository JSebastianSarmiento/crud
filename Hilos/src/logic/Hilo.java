package logic;

import javax.swing.JOptionPane;
import javax.swing.plaf.SliderUI;

public class Hilo implements Runnable  {

	private Thread op;
	private boolean b;

	public Hilo(boolean estado) {
		op = new Op(this);
		this.b=estado;
	}
	
	public void run() {

		while (b) {
			System.out.println("operacion hilo");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (JOptionPane.showConfirmDialog(null, "Desea detener el hilo")==0) {
				b = false;
			}
		}
		}


	

}
