package entidades;

public class Aluno {
	public String nome;
	public double[] notas = new double[3];

	public double media() {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			if (i == 0) {
				notas[i] *= 30;
			} else {
				notas[i] *= 35;
			}

			media += notas[i]/100;
		}
		return media;

	}

	public String resultadoFinal(double porcentagem) {
		double resultado = media();
		if (resultado < porcentagem/10) {
			return "nota final= " + resultado + ". Reprovado." + " Faltam " + (porcentagem - resultado + "pontos");
		} else {
			return "nota final= " + resultado + ". Aprovado.";
		}

	}
}