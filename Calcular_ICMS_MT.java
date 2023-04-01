package tdecrispim;

public class Calcular_ICMS_MT implements Calcular_ICMS{
	@Override
	public double calcular(double valor) {
		return valor*0.02;
}
}