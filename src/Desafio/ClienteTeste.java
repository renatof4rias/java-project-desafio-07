package Desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Fone Ouvido Apple";
		p1.preco = 120.0;
		
		Produto p2 = new Produto();
		p2.nome = "Fone Ouvido AKG";
		p2.preco = 95.0;
		

		Item i1 = new Item();
		i1.quantidade = 1;
		i1.produto = p1;
		
		Item i2 = new Item();
		i2.quantidade = 1;
		i2.produto = p2;
		
		
		Compra c1 = new Compra();
		c1.itens.add(i1);
		c1.itens.add(i2);
		
		Cliente cl1 = new Cliente();
		cl1.nome = "Luiz";
		cl1.compras.add(c1);
		
		
		System.out.println(cl1.impressora());
		
	}

}
