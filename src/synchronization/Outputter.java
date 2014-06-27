package synchronization;

public class Outputter {
	public synchronized void output(String name) {
//		synchronized (this) {
			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
			}
//		}
	}
}
