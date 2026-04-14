package Exercicios_01;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        
    double[] faturamentos = new double[5];
    int valor = 0;

    leitura(faturamentos, valor);
}
public static double leitura(double[] faturamentos, int valor){
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i <= faturamentos.length; i++){
        System.out.print("Coloque o faturamento do dia");
        faturamentos[i] = scan.nextDouble(); 
        valor++;
        System.out.println("faturamentos " + faturamentos[i] );
    } return valor;
}
    public static int parametros(int valor)
    int soma = 0;
    int maiorValor = 0;
    int menorValor = 0;
    int indiceMaior = 0;
    int indiceMenor = 0;
    if(maiorValor > faturamento.length){
    return maiorValor;
}if (menorValor < faturamentos.length){
    return menorValor;
}if 
}
