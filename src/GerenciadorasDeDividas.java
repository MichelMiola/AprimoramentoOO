
public class GerenciadorasDeDividas {
	
	public void efetuaPagamento(Divida divida, double valor, String nomePagador, Documento documentoCredor) {
		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoCredor(documentoCredor);;
		pagamento.setPagador(nomePagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
}
