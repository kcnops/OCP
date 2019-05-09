public class VolatileTest {

	public static Long count = 0L;

	public static class IncRunnable implements Runnable {
		@Override
		public void run() {
			for(int i=0; i<5000; i++) {
				VolatileTest.count++;
			}
		}
	}

	public static class DecRunnable implements Runnable {
		@Override
		public void run() {
			for(int i=0; i<5000; i++) {
				VolatileTest.count--;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread tInc = new Thread(new IncRunnable());
		Thread tDec = new Thread(new DecRunnable());
		tInc.start();tDec.start();
		tInc.join();tDec.join();
		System.out.println(VolatileTest.count);
	}

}
