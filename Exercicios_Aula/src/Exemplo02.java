public class Exemplo02 {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (Exemplo02Exception e) {
            System.out.println("O CEP não corresponde com as regras de negócio.");
        }

    }

    static String formatarCep(String cep) throws Exemplo02Exception {
        if (cep.length() != 8)
            throw new Exemplo02Exception();
        // Simulando um cep formatado.
        return "23.765-064";
    }
}
