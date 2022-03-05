
import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MedianaTest {

	@Test
	public void MedianaTesta() {
		Mediana mdT = new Mediana();
		assumeNotNull(mdT);
		
		assumeNotNull(mdT.geraNumero());
		assumeNotNull(mdT.tamLista());
		sorteiaTest(mdT);
		mdT.ordenaNumeros();

		assumeNotNull(mdT.toString());
		mdT.num = 101;
		sorteiaTest(mdT);
		assumeNotNull(mdT.getLista());
	
		
	}
	
	public void sorteiaTest(Mediana mdT) {
		mdT.sorteiaNumeros(10);
		mdT.sorteiaNumeros(11);
		mdT.sorteiaNumeros(12);
		mdT.CalculaMediana();
	}

}
