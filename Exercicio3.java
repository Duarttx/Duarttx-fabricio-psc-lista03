import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total, brancos, nulos, validos, porcBrancos, porcNulos, porcValidos;

        System.out.print("Digite o número de votos totais: ");
        total = input.nextDouble();

        System.out.print("Digite o número de votos brancos: ");
        brancos = input.nextDouble();

        System.out.print("Digite o número de votos nulos: ");
        nulos = input.nextDouble();

        System.out.print("Digite o número de votos válidos: ");
        validos = input.nextDouble();

        porcBrancos = (brancos / total) * 100;

        porcNulos = (nulos / total) * 100;

        porcValidos = (validos / total) * 100;

        System.out.println("O Valor percentual de cada código é: " + "\n" + "O percentual de votos brancos é: " + porcBrancos + "%" + "\n" + "O percentual de votos nulos é: " + porcNulos + "%" + "\n" + "O percentual de votos válidos é: " + porcValidos + "%");
        input.close();
    }
}