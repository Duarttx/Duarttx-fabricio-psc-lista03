import java.util.Scanner;

public class Exercicio4 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = input.nextDouble();
      

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        else if(salario <= 2000) {
            salario *= taxaAumento2;
        }

        else if(salario <= 3000) {
            salario *= taxaAumento1;
        }

        else {
            salario = (salario * taxaAumento1) + 200;
        }
       
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);
      
        input.close();
    }
}