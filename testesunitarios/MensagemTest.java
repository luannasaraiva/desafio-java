import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MensagemTest {

	@Test
	public void Mensagemtesta() {
		 Mensagem msg = new Mensagem("ola mundo");
		 String teste = "teste teste teste";
		 
		 assumeNotNull(msg);
		 msg.removeEspacos();
		 msg.codificaMsg();
		 msg.imprimeMsgCodificada();		 
		 msg.setMensagem(teste);		 
		 assertEquals(teste,msg.getMensagem());
		 assumeNotNull(msg.imprimeMensagem());
		 assumeNotNull(msg.tamMsg());
		 
		 
		 
		 
		 
	}

}
