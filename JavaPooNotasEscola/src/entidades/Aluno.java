package entidades;

public class Aluno {

	public static final double PESO_1_PERIODO = 0.30;
	public static final double PESO_2_3_PERIODOS = 0.35;

	public String nome;
	public double[] notas = new double[3];

	public double media() {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			if (i == 0) {
				media = notas[i] * PESO_1_PERIODO;
			} else {
				media += notas[i] * PESO_2_3_PERIODOS;
			}

		}
		return media;

	}

	public String resultadoFinal(double porcentagem) {
		double resultado = media();
		if (resultado < porcentagem / 10) {
			return "nota final= " + resultado + ". Reprovado." + " Faltam "
					+ String.format("%.2f", (porcentagem / 10 - resultado)) + " pontos";
		} else {
			return "nota final= " + resultado + ". Aprovado.";
		}

	}
}