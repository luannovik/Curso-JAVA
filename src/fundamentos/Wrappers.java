package fundamentos;


import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Tipos Primitivos
        int a = 3;

        // Tipos wrappres: Versão objeto dos tipos primitivos

        Byte By = 123;
        Short Sh = 12345;
        Integer In = Integer.parseInt("123456"); //Passando uma String
        Long Lo = 12345678L; // Conversão obrigatoria
        Boolean Bo = new Boolean(true); // Instanciando
        Float Fl = 12345678.910F; // Conversão também obrigatória
        System.out.println("Informe um número real");
        Double Do = Double.parseDouble(entrada.nextLine());
        Character Ch = 'A';

        double booo = Double.parseDouble("True");

        // Manipulando os wrappers
        System.out.println("Valor do Wrapper by: " + By.byteValue()); // Exibindo valor do wrapper By
        byte b = By.byteValue();
        System.out.println("Valor de b: " + b);
        String valorIn = Integer.toString(In); // Passando o wrapper In como parametro para o toString
        System.out.println("Valor da String é: " + valorIn);


        // Atribuindo vários comportamentos ao wrapper
        System.out.println(In.toString().toUpperCase().concat("!!"));

        // Transformando um wrapper em um objeto atraves da concatenação com uma string vazia
        System.out.println((Bo + "!!").toUpperCase());


    }
}
