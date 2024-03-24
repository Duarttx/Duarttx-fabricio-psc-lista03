import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a nota do primeira semestre: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a nota do segundo semestre: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a nota do terceiro semestre: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media < 7) {
            System.out.println("O aluno foi reprovado!");
        } else {
            System.out.println("O aluno foi aprovado!");
        }
        System.out.println("A média foi: " + media);
        input.close();
    }
}