package classe;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {

        Locale.setDefault((Locale.US));


        Produto p1 = new Produto();
        p1.nome = "Processador i7 8° Geração";
        p1.preco = 1999.00;
        p1.desconto = 0.1;


        Produto p2 = new Produto();
        p2.nome = "Moto G8 Power";
        p2.preco = 1331.43;
        p2.desconto = 0.15;


        System.out.println("Produto 1: ");
        System.out.printf("Nome: %s\n", p1.nome);
        System.out.printf("Preco: %.2f\n", p1.preco);
        System.out.printf("Desconto: %.2f\n", p1.desconto);
        System.out.printf("\n");
        System.out.println("Produto 2:");
        System.out.printf("Nome: %s\n", p2.nome);
        System.out.printf("Preço: %.2f\n", p2.preco);
        System.out.printf("Desconto: %.2f\n", p2.desconto);


        // Fazendo pelo Print
        System.out.printf("Preço com desconto do %s pelo printf: %.2f\n", p1.nome, p1.preco * (1 - p1.desconto));
        System.out.printf("Preco com desconto do %s pelo printf: %.2f\n", p2.nome, p2.preco * (1 - p2.desconto));


        // Usando variaveis
        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        System.out.printf("Preço com desconto do %s usando variaveis: %.2f\n", p1.nome, precoFinal1);
        System.out.printf("Preço com desconto do %s usando variaveis: %.2f\n", p2.nome, precoFinal2);

        double media = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média dos produtos: %.2f\n", media);


        // Usando métodos
        double precoDescontoMetodo1 = p1.precoComDesconto();
        double precoDecsontoMetodo2 = p1.precoComDesconto(0.6);

        System.out.printf("Preco do produto %s com desconto: %.2f\n", p1.nome, precoDescontoMetodo1);
        System.out.printf("Preço do produto %s com desconto: %.2f\n\n\n", p2.nome, precoDecsontoMetodo2);

        // Metodo estatico que recebe dois objetos do tipo Protudo
        media(p1, p2);

        System.out.println(p1.precoComDesconto());
    }


    public static void media(Produto p1, Produto p2) {
        System.out.println((p1.precoComDesconto() + p2.precoComDesconto()) / 2);
    }

}

