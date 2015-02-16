
 public class Cnpj implements Documento{
        private String valor;
        
        public Cnpj() {}

        public Cnpj(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }
        
        public void setValor(String valor) {
			this.valor = valor;
		}

		public boolean ehValido() {
            return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                    && segundoDigitoVerificador() == segundoDigitoCorreto();
        }
        private int primeiroDigitoVerificador() {
            // Extrai o primeiro dígito verificador do CNPJ armazenado
            // no atributo valor
        	return 0;
        }
        private int primeiroDigitoCorreto() {
            // Calcula o primeiro dígito verificador correto para
            // o CNPJ armazenado no atributo valor
        	return 0;

        }
        private int segundoDigitoVerificador() {
            // Extrai o segundo dígito verificador do CNPJ armazenado
            // no atributo valor
        	return 0;

        }
        private int segundoDigitoCorreto() {
            // Calcula o segundo dígito verificador correto para
            // o CNPJ armazenado no atributo valor
        	return 0;

        }
        
        @Override
        public boolean equals(Object obj) {
        	if(!(obj instanceof Cnpj)){
        		return false;
        		
        	}
        	
        	Cnpj outro = (Cnpj) obj;
        	return this.valor.equals(outro.valor);
        }
        
        @Override
        public int hashCode() {
        	return this.valor.hashCode();
        }
        
        @Override
        public String toString() {
        	return this.valor;
        }
        
    }