import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        System.out.print("Digite 1 para Primavera, 2 para Verão, 3 para Outono, 4 para Inverno.");
        escolha = input.nextInt();

        if (escolha == 1){
            System.out.println("A primavera é linda e cheia de flores.");
        }else if (escolha == 2){
            System.out.println("O verão é uma estação bem quente! Beba água");
        }else if (escolha == 3){
            System.out.println("O outono é um pouco frio, mas nem tanto, perfeito para quem gosta de um friozinho!");
        }else if (escolha == 4){
            System.out.println("O inverno é muito frio, enão se agasalhe para não ficar doente!");
        }else {
            System.out.println("Escolha um opção válida!");
        }
        input.close();
    }
}