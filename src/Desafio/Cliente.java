package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public String nome;
	public List<Compra> compras = new ArrayList<>();

	public Cliente() {

	}


	public double obterValorTotal() {
		double soma = 0.0;
		
			for (Compra result : compras) {
				soma = result.subTotal();
			}
			return soma;

	}
	
	public String impressora() {
		
		return 	"Cliente: " + this.nome + 
				"\nTotal: R$ " + String.format("%.2f", obterValorTotal());
	}
	
}
