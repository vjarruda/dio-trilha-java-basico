import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Insira sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Insira sua altura");
            double altura = scanner.nextDouble();

            scanner.close();

            System.out.println("\n");
            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
        }
        catch(InputMismatchException e){
            System.out.println("\n" + "Os campos idade e altura precisam ser númericos");
        }
}
}