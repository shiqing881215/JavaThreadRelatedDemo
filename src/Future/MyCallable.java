package Future;

import java.util.concurrent.Callable;

/**
 * 	This example is copied from http://www.journaldev.com/1090/java-callable-future-example 
 */
public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// Make a delay in order to show the get method of Future
		// block and wait
		Thread.sleep(1000);
		// Return the current executing thread name.
		return Thread.currentThread().getName();
	}

}
