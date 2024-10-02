import java.util.Scanner;

public class LoopComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;

        do{
            System.out.println("Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
        } while( numero < 1 || numero > 10 );

        System.out.println("O numero digitado e válido foi: " + numero);
        scanner.close();
    }
    
}
