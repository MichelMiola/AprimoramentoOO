import java.text.NumberFormat;
import java.util.Locale;


public class RelatorioDeDivida {

	private final Divida divida;
	
	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj credor: " + divida.getDocumentoCredor().getValor());
		System.out.println("Credor: " + divida.getCredor());
		
		System.out.println("Valor da divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorTotalPago()));
	}
	
	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Uma empresa");
		divida.setTotal(100);
		Cnpj cnpj1 = new Cnpj("00.000.001/0002-12");
		divida.setDocumentoCredor(cnpj1);;
		
		Pagamento pagamento = new Pagamento();
		Cnpj cnpj2 = new Cnpj("00.000.001/0002-01");
		pagamento.setDocumentoCredor(cnpj2);
		pagamento.setPagador("Outra empresa");
		pagamento.setValor(20);
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorioDeDivida.geraRelatorio(formatador);
	}
}
