package curso.polimorfismo;

public class ProdutoImportado extends Produto {
	private Double taxaImportacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return String.format("%s R$1.2f (Taxa Importação: R$1.2f)", getNome(),precoTotal(),taxaImportacao);
	}
	
	public Double precoTotal() {
		return getPreco() + taxaImportacao;
	}
	
	
}
