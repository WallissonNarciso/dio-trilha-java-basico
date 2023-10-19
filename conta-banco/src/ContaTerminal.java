import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o número da agência com o dígito: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Qual o valor que deseja depositar? ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá "+ nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco. Sua agência é "+ agencia +", conta " + numero + " e seu saldo R$ "+ saldo +" já está disponível para saque");

    }
}
