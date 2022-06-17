
public class Atleta {

	public double peso;
	public double altura;
	
	public double obterIMC() {
		
		return peso / (altura * altura);
	}
	public String classificar() {
		
		if(obterIMC() < 18.5) {
			return "Classificação: Abaixo do peso.";
		}
		else if(obterIMC() > 18.5 && obterIMC() < 24.9) {
			return "Classificação: Peso normal.";
		}
		else if(obterIMC() > 25.0 && obterIMC() < 29.9) {
			return "Classificação: Pré-obesidade.";
		}
		else if(obterIMC() > 30.0 && obterIMC() < 34.9) {
			return "Classificação: Obesidade Grau I.";
		}
		else if(obterIMC() > 35.0 && obterIMC() < 39.9) {
			return "Classificação: Obesidade Grau II.";
		}
		else {
			return "Classificação: Obesidade Grau III.";
		}
		
	}
	public String obterRisco() {
		
		if(obterIMC() < 18.5) {
			return "Risco à saúde: Muito alto!";
		}
		else if(obterIMC() > 18.5 && obterIMC() < 24.9) {
			return "Risco à saúde: Baixo.";
		}
		else if(obterIMC() > 25.0 && obterIMC() < 29.9) {
			return "Risco à saúde: Médio!";
		}
		else if(obterIMC() > 30.0 && obterIMC() < 34.9) {
			return "Risco à saúde: Alto!";
		}
		else if(obterIMC() > 35.0 && obterIMC() < 39.9) {
			return "Risco à saúde: Muito alto!";
		}
		else {
			return "Risco à saúde: Muitissímo alto!";
		}
	}
}
