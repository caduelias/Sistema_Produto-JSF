package br.com.trabalho.dao;

import java.util.List;

import br.com.trabalho.model.Produto;

public interface ProdutoDAO {
	
	public void save(Produto produto);
	public Produto getProduto(Long codigo);
	public void remove(Produto produto);
	public void update(Produto produto);
	public List<Produto> list();
}
