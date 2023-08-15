import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class InvestimentosManager {
    private List<Investimentos> investimentos;

    public InvestimentosManager() {
        investimentos = new ArrayList<>();
    }

    public void cadastrarInvestimento(List<Investimentos> investimentos, Scanner scan) {
            System.out.println("Digite o nome do ativo:");
            String nome = scan.nextLine();

            System.out.println("Digite o valor aportado:");
            double valorAportado = scan.nextDouble();
            scan.nextLine(); // Consumir a quebra de linha pendente

            System.out.println("Digite a quantidade de ativos:");
            int quantidadeAtivos = scan.nextInt();
            scan.nextLine(); // Consumir a quebra de linha pendente

            Date data = new Date(); // Use a data atual como exemplo

            Investimentos ativo = new Fii(nome, valorAportado, data, quantidadeAtivos);
            investimentos.add(ativo);

            System.out.println("Ativo cadastrado com sucesso!");
        }

          public void visualizarInvestimentos (List < Investimentos > investimentos) {
                System.out.println("Lista de investimentos:");

                for (Investimentos investimento : investimentos) {
                    System.out.println("Nome: " + investimento.getNome());
                    System.out.println("Valor Aportado: " + investimento.getValorAportado());
                    System.out.println("Data: " + investimento.getData());
                    System.out.println("Quantidade de Ativos: " + investimento.getQuantidadeAtivos());
                    System.out.println("-----------------------------");
                }
            }
        }

