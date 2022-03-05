import static org.junit.Assume.assumeNotNull;

import org.junit.jupiter.api.Test;

public class PrincipalTest {
	
	@Test
	public void TestaPrincipal() {
		Principal pl = new Principal();	
		pl.main(null);
		pl.imprime("teste");
	}
	
	

}
