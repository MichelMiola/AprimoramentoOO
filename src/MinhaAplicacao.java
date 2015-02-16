import java.util.Calendar;


public class MinhaAplicacao {

	public static void main(String[] args) {
        ArmazenadorDeDividas bd = new BancoDeDados("servidor", "usuario", "senha");
        BalancoEmpresa balanco = new BalancoEmpresa(bd);

        Documento cnpjPapelaria = new Cnpj("00.000.001/0001-01");
        Divida divida = new Divida();
        divida.setTotal(100);
        divida.setCredor("Papelaria");
        divida.setDocumentoCredor(cnpjPapelaria);

        balanco.registrar(divida);

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Luiz");
        pagamento.setDocumentoCredor(new Cpf("000.000.001-01"));
        pagamento.setValor(100);
        pagamento.setData(Calendar.getInstance());

        balanco.pagaDivida(cnpjPapelaria, pagamento);

      }
	
}
