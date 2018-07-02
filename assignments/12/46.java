package aufgabe46;

public class PrintThread implements Runnable {

	private boolean running = true;

	@Override
	public void run() {
		System.out.println("ausgabe");
		while (running) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Thread unterbrochen");
			}
			System.out.println("ausgabe");
		}
		System.out.println("Thread angehalten");
	}
	
	public void terminate() {
		running = false;
	}
}
