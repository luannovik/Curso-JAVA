package classe;

// Classe do tipo Produto
public class Produto {

    // Atributos que pertecem a instancia (objeto)
    String nome;
    double preco;
    double desconto;


    // Métodos
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoAdicional) {
        return preco * (1 - (desconto + descontoAdicional));
    }


}
