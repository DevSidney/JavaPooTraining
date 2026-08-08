package util;

public class Conversor {
	public static final double IOF = 0.06;

	public static double conversor(double valorMoeda, double quantidadeComprado) {
		return valorMoeda * quantidadeComprado * (1 + IOF);

	}

}
