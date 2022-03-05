import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ListaDeParesNumerosTest {
	
	@Test
	public void ListaDeParesENumTesta() {
		ListaDePareseNumeros ldpn = new ListaDePareseNumeros();
		ldpn.setX(2);
		ldpn.addExemplos();							
		System.out.println(ldpn.imprimeListadesoNumeros());
							ldpn.calculaPares();
	    System.out.println("Resultado: "+ldpn.ResultadoDoCalculoDePares());
	    
	    assertEquals(2,ldpn.getX());
	}
}
