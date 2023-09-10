package application;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar a qubra de linha de entrada

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibir
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        //System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " disponível para saque.");
        System.out.printf("Sua agência é %s, conta %d e seu saldo é R$%.2f já está disponível para saque.%n", agencia, numero, saldo);

        scanner.close();
    }
}
