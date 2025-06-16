import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
     Scanner scanner =  new Scanner(System.in);

     double saldo = 980.23;

     System.out.println("Por favor, digite o número da Conta:");
     int numero = scanner.nextInt();

     scanner.nextLine();

     System.out.println("Por favor, digite o número da Agência:");
     String agencia = scanner.nextLine();

     System.out.println("Por favor, digite o nome do Cliente:");
     String nomeCliente = scanner.nextLine();

     System.out.println("Seu saldo em Conta é R$" + saldo);
     System.out.println("Digite o valor para depósito:");
     double deposito = scanner.nextDouble();

     saldo += deposito;

     System.out.println(" Olá " + nomeCliente + ", obrigado por ser nosso Cliente, sua Agência é " + agencia + " Conta " + numero + " seu saldo atual é R$" + saldo + " já está disponivel para saque");

     scanner.close();
    }
}
