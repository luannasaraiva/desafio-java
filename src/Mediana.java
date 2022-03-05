import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Mediana {
	
	//Gera um numero aleatório de 0 a 100.
	public static int num = 100;
	
	
	protected List<Integer> lista; 
	
	public List<Integer> getLista() {
		return lista;
	}


	public Mediana() {
		lista = new Vector <Integer>();
	}
	
	
	public int geraNumero() {
		Random random = new Random();
		return random.nextInt(num);
	}
	
	
	public int tamLista() {
		return lista.size();
	}
	
	
	public void sorteiaNumeros(int n) {	
		for(int i = 0; i < n; i++) {
			lista.add(geraNumero());
		}
		
	}
	
	public void ordenaNumeros() {
		lista.sort(null);
	}
	
	public void CalculaMediana() {
		ordenaNumeros();
		if(tamLista()%2 == 0) {
			System.out.println("Não é possível ter mediana com numero par de elementos na lista");
		}
		
		else {			
			System.out.println("Mediana: "+lista.get(tamLista()/2));
		}
		
	}
	
	public String toString() {
		return lista.toString();
	}


}
