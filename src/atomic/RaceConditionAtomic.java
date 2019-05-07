package atomic;

import java.util.concurrent.atomic.AtomicLong;

class Counter {
	//	public static long count = 0;
	public static AtomicLong count = new AtomicLong(0);
}

class UseCounter implements Runnable {
	public void increment() {
//		Counter.count++;
//		System.out.print(Counter.count + " ");

		System.out.print(Counter.count.incrementAndGet() + " ");
	}
	public void run() {
		increment();
		increment();
		increment();
	}
}

public class RaceConditionAtomic {
	public static void main(String args[]) {
		UseCounter c = new UseCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}