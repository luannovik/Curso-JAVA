package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuario = new HashSet<>();

        Usuario u1 = new Usuario("Roberta");
        System.out.println(u1.toString());

        usuario.add(new Usuario("Roberto"));

      for(Usuario u: usuario){
          System.out.println(u);
      }

        System.out.println(usuario.contains(new Usuario("Roberto")));



    }
}
