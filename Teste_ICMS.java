package tdecrispim;

public class Teste_ICMS {

	public static void main(String[] args) {
		Calcular_ICMS calculo1 = ICMS_FACTORY.criarCalculadora("minas gerais");
		double resultado1 = calculo1.calcular(100.0);
		System.out.println("ICMS Minas Gerais: " + resultado1);

		Calcular_ICMS calculo02 = ICMS_FACTORY.criarCalculadora("goias");
		double resultado2 = calculo02.calcular(100.0);
		System.out.println("ICMS Goias: " + resultado2);
		
		Calcular_ICMS calculo3 = ICMS_FACTORY.criarCalculadora("mato grosso");
		double resultado3 = calculo3.calcular(100.0);
		System.out.println("ICMS Mato Grosso: " + resultado3);
		
		Calcular_ICMS calculo4 = ICMS_FACTORY.criarCalculadora("rio de janeiro");
		double resultado4 = calculo4.calcular(100.0);
		System.out.println("ICMS Rio de Janeiro: " + resultado4);
	}

}
