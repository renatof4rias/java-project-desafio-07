package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	public List<Item> itens = new ArrayList<>();
	
	public double subTotal() {
		double soma = 0.0;
		for (Item result : itens) {
			soma += result.produto.preco * result.quantidade;
		}
		return soma;
	}
	
}