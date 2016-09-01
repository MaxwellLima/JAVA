
public class Corrida {
	String tipo;
	String autodromo;
	int voltas;
	String listarDados;
	String vencedor;
        
	public String listarDados(){
		int cont=1;
		while(voltas != 0){
			System.out.println("Volta numero " + cont);
			cont+=1;
			voltas-=1;
		}
		return listarDados;
	}
	
	public void iniciarCorrida(){
		
	}


}
