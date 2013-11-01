package logic;

public class Op extends Thread{
	private Thread hilo;
	private Hilo hilo2;
	
	public Op (Hilo hilo){
		this.hilo2 = hilo;
	}
}
