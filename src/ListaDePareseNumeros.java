import java.util.List;
import java.util.Vector;

/*
 * Adiciona uma lista de numeros para fazer pares.
 * E também gera pares
 */

public class ListaDePareseNumeros {
	protected List<Pares> lp;
	protected List<Integer> lnum;
	protected int x;
	
	ListaDePareseNumeros(){		
		lnum = new Vector <Integer>();
		lp = new Vector <Pares>(); 
	}
	
	public void addExemplos() {
		lnum.add(1);
		lnum.add(5);
		lnum.add(3);
		lnum.add(4); 
		lnum.add(2);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String imprimeListadesoNumeros() {
		return lnum.toString();
	}
	
	public void calculaPares() {
	    for(int i = 0; i < lnum.size(); i++) {
	    	for(int j = 0; j < lnum.size(); j++) {
	    		
	    		if(lnum.get(i) - lnum.get(j) == x) {
	    			lp.add(new Pares(lnum.get(i),lnum.get(j)));
	    		}
	    	}
	    }
	    	    
	}
	
	public String ResultadoDoCalculoDePares() {
		return lp.toString();
	}
	
	public int ResultadoQtdDosPares() {
		return lp.size();
	}
}
