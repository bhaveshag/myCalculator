/**
 * 
 */
package calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bhavesh
 *
 */
public class CalculateTest {
	MyCalculator calc;
	
	@Before
	public void setUp() throws Exception {
    calc = new MyCalculator();
	}

  @Test
  public void mult() {
    assertEquals(3, calc.mult(1, 3),0.1);
  }

  @Test
  public void div() {
    assertEquals(6, calc.div(120, 20),0.1);
  }

  @Test
  public void add() {
    assertEquals(15, calc.add(10, 5),0.1);
  }

  @Test
  public void sub() {
    assertEquals(3, calc.sub(10, 7),0.1);
  }
}
