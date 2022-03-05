
public class Mensagem {
	
	protected String mensagem;
	protected char[][] msgCod;
	
	
	public Mensagem (String msg) {
		mensagem = msg;		
	}

	
	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public void removeEspacos() {
		mensagem = mensagem.replace(" ","");
				
	}
	
	public String imprimeMensagem() {
		return mensagem.toString();
	}
	
	public int tamMsg() {
		return mensagem.length();
	}
	
	public int raizQuadrada() {
		//arrendodar para cima.
		double  aux = Math.sqrt(mensagem.length()) + 0.5;
		return (int) aux;
		
	}
	
	public void codificaMsg() {
		int tam = raizQuadrada();
		msgCod = new char [tam][tam];				
		int count = 0;		
		
		for(int i = 0; i < raizQuadrada(); i++) {			
			for(int j = 0; j < raizQuadrada(); j++) {
				if(count < mensagem.length()){				
					msgCod[i][j] = mensagem.charAt(count);
					count++;	
				}
						
			}
		}									
	}
	
	
	public void imprimeMsgCodificada()	{
		for(int l = 0; l < raizQuadrada(); l++) {
			for(int c = 0; c < raizQuadrada(); c++) {
				System.out.print(msgCod[c][l]);
				if(c+1 == raizQuadrada()) {
					System.out.print(" ");
				}
			}
		}				
		
	}


	
}
