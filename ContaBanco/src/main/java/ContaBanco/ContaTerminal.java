/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ContaBanco;

import java.util.Scanner;

/**
 *
 * @author rafin
 */
public class ContaTerminal {

    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Agência: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldoInicial);
    }
      
      // Exibir as mensagens para o nosso usuário 
      
      // Obter pelo scanner os valores digitados no terminal
      
      // Exibir a mensagem conta criada
    }
}
