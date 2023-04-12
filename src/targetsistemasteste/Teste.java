package targetsistemasteste;

/**
 *
 * @author Kayky Ribeiro Lima
 */
public class Teste {

    public static void main(String[] args) {
        /* Exercício 2: identificar se dado número faz parte da Sequência de Fibonacci */
        
        int n = 6765;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        
        //Laço que passa pela sequência fibonacci
        while (n > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        //Valida se o número faz parte da sequência fibonacci
        if (n == 0 || n == n3) {
            System.out.println("Este numero faz parte da sequencia de fibonacci\n");
        }else {
            System.out.println("Este numero nao faz parte da sequencia de fibonacci\n");
        }

        /* Exercício 3: calcular e retornar o menor e maior faturamento ocorrido em um dia do mês 
        e o número de dias no mês que o faturamento diário foi superior à média mensal */
        
        int diasAcimaMedia = 0;
        double menor = 0;
        double maior = 0;
        double somaFaturamento = 0;
        double media;
        double faturamento[] = {
            22174.1664,
            24537.6698,
            26139.6134,
            0.0,
            0.0,
            26742.6612,
            0.0,
            42889.2258,
            46251.174,
            11191.4722,
            0.0,
            0.0,
            3847.4823,
            373.7838,
            2659.7563,
            48924.2448,
            18419.2614,
            0.0,
            0.0,
            35240.1826,
            43829.1667,
            18235.6852,
            4355.0662,
            13327.1025,
            0.0,
            0.0,
            25681.8318,
            1718.1221,
            13220.495,
            8414.61
        };

        // Laço que encontra o menor e maior valor, e faz a soma de todos os valores
        for (int i = 0; i < faturamento.length; i++) {
            menor = faturamento[0];
            if (faturamento[i] < menor) {
                menor = faturamento[i];
            }
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
            somaFaturamento += faturamento[i];
        }
        // Cálculo da media
        media = somaFaturamento / 21;
        
        // Laço que encontra os dias que o faturamento diario foi maior que a media mensal
        for (int i = 0; i < faturamento.length; i++) {
            if (media < faturamento[i]) {
                diasAcimaMedia++;
            }
        }
        
        System.out.println("O menor valor de faturamento ocorrido em um dia do mes foi de R$" + menor);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mes foi de R$" + maior);
        System.out.println("O faturamento diario foi maior que a media mensal em " + diasAcimaMedia + " dias\n");

        /* Exercicio 4: calcular o percentual de representação que cada estado teve de faturamento mensal
        do valor total mensal de uma distribuidora*/
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19848.53;
        double somaEstados = sp + rj + mg + es + outros;

        //Calcula e imprime o percentual de representação de cada estado
        System.out.printf("SP =  %.2f\n", sp * 100 / somaEstados);
        System.out.printf("RJ =  %.2f\n", rj * 100 / somaEstados);
        System.out.printf("MG =  %.2f\n", mg * 100 / somaEstados);
        System.out.printf("ES =  %.2f\n", es * 100 / somaEstados);
        System.out.printf("Outros =  %.2f\n\n", outros * 100 / somaEstados);

        /* Exercício 5: inverter os caracteres de um string */
        
        String palavra = "Maravilhoso";
        
        //Laço para inverter a string
        for (int icaracter = palavra.length(); icaracter > 0; icaracter--) {
            System.out.println(palavra.charAt(icaracter - 1));
        }
    }

}
