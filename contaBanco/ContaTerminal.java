import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("olaa");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        Conta conta = new Conta(numeroConta, agencia, nomeCliente, 100.00);

        System.out.println(
                "Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é " +
                conta.getAgencia()+", conta "+ conta.getNumero()+" e seu saldo R$"+conta.getSaldo()+" já está disponível para saque.\n"
        );

    }
}
