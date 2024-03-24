import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Não é possível dividir um número por 0!");
        } else {
            double calculo;
            calculo = num1 / num2;  
            System.out.println("O resultado do cálculo é: " + calculo);      
        }
        input.close();
    }
}