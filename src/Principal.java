
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		imprime("\nQ1)");
		Mediana md = new Mediana();
		//gera numeros para possivel mediana.
		md.sorteiaNumeros(5);

		imprime(md.toString());
		//verifica se é possivel fazer mediana.
		md.CalculaMediana();
		
		imprime(md.toString()+ "\nQ2)");				
				
		ListaDePareseNumeros ldpn = new ListaDePareseNumeros();
		//gera um x para calcular menos o numero e gera um par.
		ldpn.setX(2);
		
		//usa o exemplo do desafio.
		ldpn.addExemplos();							
		
		imprime(ldpn.imprimeListadesoNumeros());
				ldpn.calculaPares();
				
				
	    imprime("Resultado: "+ldpn.ResultadoDoCalculoDePares());
	    imprime("Quantidade: "+ldpn.ResultadoQtdDosPares());
	    
	    imprime("\nQ3)");
	    
	    Mensagem msg = new Mensagem("tenha um bom dia");
	    //faz a primeira modificação de espaços...
	    msg.removeEspacos();	
	    
	    //passa a mensagem para matrix. e codifica mensagem.	    
	    msg.codificaMsg();
	    
	    
	    msg.imprimeMsgCodificada();

	}
	
	public static void imprime (String aux) {
		System.out.println(aux);
	}
		

}
