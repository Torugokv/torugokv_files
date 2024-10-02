import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite uma opção do menu: ");
            System.out.println("1. Sanduiche");
            System.out.println("2. Pizza");
            System.out.println("3. Sorvete");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if(opcao == 0){
                System.out.println("Você saiu do sistema.");
            }else if(opcao == 1){
                System.out.println("Você escolheu um Sanduíche.");
            }else if(opcao == 2){
                System.out.println("Você escolheu uma pizza.");
            }else {
                System.out.println("Você escolheu um sorvete.");
            }

        } while(opcao != 0);

        scanner.close();
    }
}
