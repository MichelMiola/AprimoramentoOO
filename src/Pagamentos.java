import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;


public class Pagamentos implements Iterable<Pagamento>{
	
	private double valorPago;
	private Collection<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	 public double getValorPago() {
		return valorPago;
	}

	private void paga(double valor) {
	        if (valor < 0) {
	            throw new IllegalArgumentException("Valor invalido para pagamento");
	        }
	        if (valor > 100) {
	            valor = valor - 8;
	        }
	        this.valorPago += valor;
	    }
	    
	    public void registra(Pagamento pagamento) {
	        this.pagamentos.add(pagamento);
	        paga(pagamento.getValor());
	    }
	    
	    public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
	        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	        for (Pagamento pagamento : this) {
	            if (pagamento.getData().before(data)) {
	                pagamentosFiltrados.add(pagamento);
	            }
	        }
	        return pagamentosFiltrados;
	    }
	    
	    public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
	        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	        for (Pagamento pagamento : this) {
	            if (pagamento.getValor() > valorMinimo) {
	                pagamentosFiltrados.add(pagamento);
	            }
	        }
	        return pagamentosFiltrados;
	    }
	    
	    public Collection<Pagamento> pagamentosDo(Documento documento) {
	        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
	        for (Pagamento pagamento : this) {
	            if (pagamento.getDocumentoCredor().equals(documento)) {
	                pagamentosFiltrados.add(pagamento);
	            }
	        }
	        return pagamentosFiltrados;
	    }

		@Override
		public Iterator<Pagamento> iterator() {
			return this.pagamentos.iterator();
		}
	    
}
