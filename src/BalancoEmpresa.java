public class BalancoEmpresa {
	
	private ArmazenadorDeDividas armazenadorDeDividas;
	
	public BalancoEmpresa(ArmazenadorDeDividas armazenadorDeDividas) {
		this.armazenadorDeDividas = armazenadorDeDividas;
	}
	
	public void registrar(Divida divida) {
		armazenadorDeDividas.salva(divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = armazenadorDeDividas.carrega(documentoCredor);
		
		if(divida != null){
			divida.registra(pagamento);
		}
		armazenadorDeDividas.salva(divida);
		
	}
	
}
