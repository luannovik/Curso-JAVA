package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Meu nome é " + nome;
    }


    @Override
    public boolean equals(Object o) {
        Usuario usuario = (Usuario) o;
        return usuario.nome.equals(this.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
