package curso.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoList {
	
	private List<Produto>listaProdutos;

	public ProdutoList() {
		listaProdutos = new ArrayList<>();
	}
	
	public int obterTamanho() {
		return listaProdutos.size();
	}
	
	public boolean adicionarProduto(Produto produto) {
		if(produto != null) {
			return listaProdutos.add(produto);
		}
		return false;
	}
	
	public boolean removerProduto(Produto produto) {
		if(produto != null) {
			return listaProdutos.remove(produto);
		}
		return false;
	}
	
	public boolean removerProduto(int indiceProduto) {
		if(indiceProduto > 0 && indiceProduto < listaProdutos.size()) {
			listaProdutos.remove(indiceProduto);
			return true;
		}
		return false;
	}
	
	public Produto obterProduto(int indiceProduto) {
		if(indiceProduto >= 0 && indiceProduto < listaProdutos.size()) {
			listaProdutos.get(indiceProduto);
		}
		return null;
	}
	
	public int obterIndiceProduto(Produto produto) {
		return listaProdutos.indexOf(produto);
	}
	
	public int obterIndiceProduto(String nomeProduto) {
		return obterIndiceProduto(listaProdutos.stream().filter(x -> x.getNome().equalsIgnoreCase(nomeProduto)).findFirst().orElse(null));
	}
	
	

}
