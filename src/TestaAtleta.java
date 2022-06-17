
public class TestaAtleta {

	public static void main(String[] args) {
		
		Atleta atleta = new Atleta();
			atleta.peso = 68;
			atleta.altura = 1.74;
			
			System.out.println("IMC: " + atleta.obterIMC() + "\n" + atleta.classificar() + "\n" + atleta.obterRisco());
	}
}
