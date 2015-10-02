/**
 * 
 */
package calculator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author bhavesh
 *
 */
public class TestRunnerClass {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(CalculateTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	   }
}
