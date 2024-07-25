package je02_Aritimetico;

import java.util.Scanner;
public class aritimetico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1°número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o 2°número: ");
        sc = new Scanner(System.in);
        int numero2 = sc.nextInt();

        System.out.println("Digite o 3°número: ");
        sc = new Scanner(System.in);
        int numero3 = sc.nextInt();

        System.out.println("Digite o 4°número: ");
        sc = new Scanner(System.in);
        int numero4 = sc.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4;
        int subtracao = numero1 - numero2 - numero3 - numero4;
        int multiplicacao = numero1 * numero2 * numero3 * numero4;
        double divisao = (double) numero1 / numero2 / numero3 / numero4;

        /*System.out.println("soma é: " +soma+ "\nsubtracao: " +subtracao+ "\nmultiplicacao: "+multiplicacao+
                "\nDivisão: "+divisao);*/
        System.out.printf("Soma: %d + %d + %d + %d = %d%n", numero1, numero2, numero3, numero4, soma);
        System.out.printf("Subtração: %d - %d - %d - %d = %d%n", numero1, numero2, numero3, numero4, subtracao);
        System.out.printf("Multiplicação: %d * %d * %d * %d = %d%n", numero1, numero2, numero3, numero4, multiplicacao);
        System.out.printf("Divisão: %d / %d / %d / %d = %.2f%n", numero1, numero2, numero3, numero4, divisao);


    }
}
