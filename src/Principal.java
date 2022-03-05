
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		imprime("\nQ1)");
		Mediana md = new Mediana();
		md.sorteiaNumeros(5);

		imprime(md.toString());
		
		md.CalculaMediana();
		
		imprime(md.toString()+ "\nQ2)");				
		
		ListaDePareseNumeros ldpn = new ListaDePareseNumeros();
		ldpn.setX(2);
		ldpn.addExemplos();							
		
		imprime(ldpn.imprimeListadesoNumeros());
				ldpn.calculaPares();
				
				
	    imprime("Resultado: "+ldpn.ResultadoDoCalculoDePares());
	    
	    imprime("\nQ3)");
	    
	    Mensagem msg = new Mensagem("tenha um bom dia");
	    msg.removeEspacos();	   
	    msg.codificaMsg();
	    msg.imprimeMsgCodificada();

	}
	
	public static void imprime (String aux) {
		System.out.println(aux);
	}
		

}
