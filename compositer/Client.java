package compositer;

import compositer.issues.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompositeIssue grupoTarefas = new CompositeIssue("ISSUES\n");

        while (true) {
            System.out.println("|--------------------------------------|");
            System.out.println("|  1 - Adicionar Simple Issue          |\n");
            System.out.println("|  2 - Criar Issue Group               |\n");
            System.out.println("|  3 - Exibir Issues                   |\n");
            System.out.println("|  4 - Sair                            |\n");
            System.out.println("|  Escolha uma opção                   |\n");
            System.out.println("|--------------------------------------|\n");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o título da issue: ");
                String title = scanner.nextLine();

                System.out.print("Digite a descrição da issue: ");
                String description = scanner.nextLine();

                System.out.print("Digite o prazo (ex: dd/mm/aaaa hh:mm): ");
                String deadline = scanner.nextLine();

                grupoTarefas.add(new SimpleIssue(title, description, deadline));

            } else if (opcao == 2) {
                System.out.print("Digite o título da issue composta: ");
                String title = scanner.nextLine();

                CompositeIssue tarefaComposta = new CompositeIssue(title);
                grupoTarefas.add(tarefaComposta);

                System.out.println("Issue composta criada! Agora, adicione subtarefas a ela.");

                while (true) {
                    System.out.println("\n1 - Adicionar Simple Issue");
                    System.out.println("2 - Adicionar Outra Issue Composta");
                    System.out.println("3 - Voltar");
                    System.out.print("Escolha uma opção: ");
                    int subOpcao = scanner.nextInt();
                    scanner.nextLine();

                    if (subOpcao == 1) {
                        System.out.print("Digite o título da issue: ");
                        String subTitle = scanner.nextLine();

                        System.out.print("Digite a descrição da issue: ");
                        String subDescription = scanner.nextLine();

                        System.out.print("Digite o prazo (ex: dd/mm/aaaa hh:mm): ");
                        String subDeadline = scanner.nextLine();

                        tarefaComposta.add(new SimpleIssue(subTitle, subDescription, subDeadline));

                    } else if (subOpcao == 2) {
                        System.out.print("Digite o título da nova issue composta: ");
                        String subTitle = scanner.nextLine();

                        CompositeIssue subTarefaComposta = new CompositeIssue(subTitle);
                        tarefaComposta.add(subTarefaComposta);
                        System.out.println("Nova issue composta adicionada!");

                    } else if (subOpcao == 3) {
                        break;
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\nISSUES");
                grupoTarefas.print("");

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            }
        }
        scanner.close();
    }
}
