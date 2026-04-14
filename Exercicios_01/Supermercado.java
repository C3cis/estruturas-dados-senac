package Exercicios_01;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        double[] faturamentos = new double[5];
        leituradosFaturamentos(faturamentos);   
        calculosdosIndices(faturamentos);    
    }

    public static void leituradosFaturamentos(double[] faturamentos) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < faturamentos.length; i++) {  
            System.out.print("Faturamento do caixa " + (i + 1) + ": R$"); 
            faturamentos[i] = scan.nextDouble();
        }
    }
    public static void calculosdosIndices(double[] faturamentos) {
        double soma       = 0;
        double maiorValor = faturamentos[0]; 
        double menorValor = faturamentos[0];
        int    indiceMaior = 0;
        int    indiceMenor = 0;

        for (int i = 0; i < faturamentos.length; i++) {
            soma += faturamentos[i];

            if (faturamentos[i] > maiorValor) {  
                maiorValor = faturamentos[i];
                indiceMaior = i;
            }
            if (faturamentos[i] < menorValor) {
                menorValor = faturamentos[i];
                indiceMenor = i;
            }
        }

        System.out.println("Total do dia: R$" + soma);
        System.out.println("Media por caixa: R$" +  (soma / 5));
        System.out.printf("Maior venda: Caixa %d com R$%.2f%n", (indiceMaior + 1), maiorValor);
        System.out.printf("Menor venda: Caixa %d com R$20%.2f%n", (indiceMenor + 1), menorValor);
    }
}
