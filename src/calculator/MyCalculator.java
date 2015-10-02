/**
 * 
 */
package calculator;
/**
 * @author bhavesh
 *
 */
public class MyCalculator {
	public double add(double x, double y) {
		return x + y;
	}

	public double sub(double x, double y) {
		return x - y;
	}

	public double mult(double x, double y) {
		return x * y;
	}

	public double div(double x, double y) {
		try{
		return x / y;
	}catch(Exception e){
			return -1;
		}
	}
}
