
public class MyThread extends Thread{
	public void run() {
		for (int count = 1, row = 1; row < 10; row++, count++) {
	           for (int i = 0; i < count; i++)
	                System.out.print ('*');
	           System.out.print ('\n');
	      }
	}
}
