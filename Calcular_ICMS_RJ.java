package tdecrispim;

public class Calcular_ICMS_RJ  implements Calcular_ICMS{
	@Override
	public double calcular(double valor) {
		return valor*0.14;
}
}