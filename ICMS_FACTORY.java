package tdecrispim;

public class ICMS_FACTORY {
	public static Calcular_ICMS criarCalculadora(String estado) {
		if (estado.equalsIgnoreCase("minas gerais")) {
			return new Calcular_ICMS_MG();
		} else if (estado.equalsIgnoreCase("goias")) {
			return new Calcular_ICMS_GO();
		} else if (estado.equalsIgnoreCase("mato grosso")) {
			return new Calcular_ICMS_MT();
		} else if (estado.equalsIgnoreCase("rio de janeiro")) {
			return new Calcular_ICMS_RJ();
		}else {
			return null;
}
}
}