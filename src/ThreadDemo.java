
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		/**
		 * You cannnot guarantee the output order, because the main thread and MyThread is seperate
		 */
		for (int i = 0; i < 20; i++)
			System.out.println ("i = " + i + ", i * i = " + i * i);
	}
}
