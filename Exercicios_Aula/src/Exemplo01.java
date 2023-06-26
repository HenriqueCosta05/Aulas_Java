import java.text.NumberFormat;

public class Exemplo01 {
    public static void main(String[] args) {
        try {
            Number valor = Double.valueOf("a1.75"); // 'a' é um caractere indevido no número.
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (Exception exceptionExemplo) {
            System.out.println("Digite um número válido.");
        }

    }
}
