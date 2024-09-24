//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            System.out.println("Esse é o screen Match");
            System.out.println("Filme: top Gun: Maverick");

            int anodelancamento = 2022;
                    System.out.println("Ano de lancaamento: " + anodelancamento);
            boolean incluindonoplano = true;
            double metadefilme = 8.1;
            double media =(9.8 + 6.3 +8.0) / 3;
            System.out.println(media);
            String sinopse;
            sinopse = """
                    Filme Top gun
                    Filme de aventura com galã dos anos 80
                    Muito bom!
                    Ano de lançamento
                    """ + anodelancamento;
            System.out.println(sinopse);

            int classificacao;
            classificacao = (int) (media /2);
            System.out.println(classificacao);
        }
}
