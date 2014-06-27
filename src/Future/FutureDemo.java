package Future;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 	This example is copied from http://www.journaldev.com/1090/java-callable-future-example 
 */
public class FutureDemo {
	
	public static void main(String[] args) {
		Callable<String> callable = new MyCallable();
		// Create a thread pool for use, at a certain time at most 10 threads could be used
		ExecutorService executor = Executors.newFixedThreadPool(10);
		// Future stands for the async call result (which is executed by another thread)
		List<Future<String>> futures = new ArrayList<Future<String>>();
		for (int i = 0; i < 30; i++) {
			// This will execute the callable which means call callable's call() method
			// and return the value into Future
			Future<String> future = executor.submit(callable);
			futures.add(future);
		}
		
		for (Future<String> fut : futures) {
			try {
				// Attention, this get method will block and wait for the async job finished
				// Block here until the job is done
				System.out.println(new Date() + " : " + fut.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}
}
