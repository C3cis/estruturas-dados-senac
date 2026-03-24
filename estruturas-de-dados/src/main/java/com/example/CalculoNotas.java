package com.example;
       
public class CalculoNotas {

    public static void main(String[] args) {

    String [] alunos = {"Dani","Carlos","Teo","Bia","Cris","Huri","Pou","Hugo","Tina","Lia","Rio","Juno","Yuri","Kiko","Mia"};
    double [] N_ativ1 =  {7.5, 8.2, 5.0, 9.1, 6.4, 10.0, 4.8, 7.2, 8.5, 3.5, 6.0, 9.5, 7.8, 5.5, 8.0};
    double [] N_ativ_2 = {6.7, 4.2, 8.9, 5.5, 7.3, 9.8, 3.1, 6.5, 8.1, 7.0, 5.9, 10.0, 4.5, 9.2, 6.8};
    double [] N_ativ_3 = {3.8, 7.4, 6.1, 9.3, 5.2, 8.7, 4.9, 10.0, 7.6, 2.5, 6.9, 8.3, 5.7, 9.0, 4.1};
    double [] N_ativ_4 = {5.8, 8.4, 3.9, 9.7, 6.2, 4.4, 7.1, 8.8, 2.9, 5.3, 10.0, 6.6, 7.9, 4.7, 8.1};

    double [] N_aval_1 = {4.3, 7.7, 6.4, 9.1, 5.0, 8.2, 3.6, 10.0, 7.3, 6.5, 4.8, 8.6, 5.4, 9.9, 7.2};
    double [] N_aval_2 = {6.3, 8.5, 4.0, 9.4, 5.7, 7.9, 3.2, 10.0, 6.8, 8.1, 4.6, 7.5, 9.6, 5.1, 8.8};

   // int notas = 0;
   // int numero_media = 0;
    double[] media =  new double[15];

        for (int i = 0; i< alunos.length; i++){
            double soma = N_ativ1[i] + N_ativ_2[i] + N_ativ_3[i] + N_ativ_4[i] + N_aval_1[i] + N_aval_2[i];
            media[i] = soma / 6.0;
        }  
        exibir(alunos, media);
    }
    
    public static void exibir(String[] nomes, double[] media) {
        for (int i = 0; i < media.length; i++) {
            
            System.out.println(nomes[i]+ "---" + media[i]);
        }
    }
}


