package synchronization;

public class TraditionalThreadSynchronized {
	public static void main(String[] args) {
		/**
		 * This is the bad example, cause this doesn't use synchronization correctly.
		 * The reason is it actually creates two objects, so 
		 * each thread gets the lock of different object, which sync doesn't work at all
		 */
		final Outputter outputter = new Outputter();
		final Outputter outputter2 = new Outputter();
		new Thread() {
			public void run(){
				outputter.output("abcd");
			}
		}.start();
		new Thread() {
			public void run(){
				outputter2.output("efgh");
			}
		}.start();
		
		/**
		 * This is the good example
		 */
		final Outputter outputter3 = new Outputter();
		new Thread() {
			public void run(){
				outputter3.output("1234");
			}
		}.start();
		new Thread() {
			public void run(){
				outputter3.output("5678");
			}
		}.start();
	}
}	
