import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ParesTest {

	@Test
	public void ParesTesta () {
		int a = 1;
		int b = 2;
		Pares pr = new Pares(10,20);
		assumeNotNull(pr);
		pr.setA(a);
		pr.setB(b);
		
		assertEquals(a,pr.getA());
		assertEquals(b,pr.getB());
		
		assumeNotNull(pr.toString());
	}

}
