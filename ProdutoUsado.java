package curso.polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutoUsado extends Produto {
	
	private LocalDate dataFabricacao;

	public ProdutoUsado() {
		super();
	}
	
	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return String.format("%s (usado) R$1.2f (Data Fabricação: %s)", getNome(), getPreco(),dataFabricacao.format(DateTimeFormatter.ofPattern("dd-mm-yyyy")));
	}

	
	
	
}
