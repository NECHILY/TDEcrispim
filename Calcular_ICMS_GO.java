package tdecrispim;

public class Calcular_ICMS_GO implements Calcular_ICMS {
	@Override
	public double calcular(double valor) {
		return valor*0.20;
}
}