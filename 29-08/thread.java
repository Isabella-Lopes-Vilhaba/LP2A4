package main;

public class Main implements Runnable {
	static int contador = 0;

	public static void main(String[] args) throws InterruptedException {
//		Thread principal = Thread.currentThread();
//		System.out.println("Nome da thread: " + principal.getName());
//		System.out.println("Thread.toString():" + principal);
		
		System.out.println("Estamos na: " + Thread.currentThread().getName());
		
		Runnable runnable = new Main();
		
//		runnable.run();
		
		Thread t = new Thread( runnable );
		t.start();
		
		t.join();
		
		System.out.println(contador);
	}

	@Override
	public void run() {
		System.out.println("Aqui quem fala é a: " + Thread.currentThread().getName());
		while(contador < 1500) contador++;
	}

}
