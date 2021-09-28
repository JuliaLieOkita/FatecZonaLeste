public class ConversorData {

	public static void main(String[] args) {
		ConversorData conversor = new ConversorData(5, 8, 2016);
		
		System.out.println("Correspondente no calendário Juliano: " + dataJuliana(conversor));
	}
	
	int ano, mes, dia;
	
	public ConversorData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public static int dataJuliana(ConversorData conversor) {		
		int diaJuliano= (1461 * ( conversor.ano + 4800 + ( conversor.mes - 14)/12 )  ) / 4 +
                ( 367 * ( conversor.mes - 2- 12 * (  ( conversor.mes - 14)/12 )  ) ) /12 -
                ( 3 * ( ( conversor.ano + 4900 + ( conversor.mes - 14 ) / 12 ) / 100 )  ) / 4 + conversor.dia - 32075;
		
		return diaJuliano;
	}

}