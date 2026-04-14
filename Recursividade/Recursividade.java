public class Recursividade {
    public static int somaRecursiva(int n){
        if (n <= 0) { //condicional para parar a recursividade
            return 0;
        }
        return n + somaRecursiva(n-1);
    }

    public static int somaInterativa(int n){ //acumulador sem recursividade
        int soma = 0;
        for (int i= 1; i<=n; i++ ){
            soma += i;
        }
        return soma;
    }
    public static void main(String[] args) {
        somaRecursiva(10);
        System.out.println(somaRecursiva(10));

        somaInterativa(10);
        System.out.println(somaInterativa(10));


    }
}
