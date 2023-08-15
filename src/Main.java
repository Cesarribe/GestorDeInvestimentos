import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Investimentos> investimentos = new ArrayList<>();
        InvestimentosManager manager = new InvestimentosManager();


        Map<Integer, Runnable> actions = new HashMap<>();
        actions.put(1, () -> manager.cadastrarInvestimento(investimentos, scan));
        actions.put(2, () -> manager.visualizarInvestimentos(investimentos));
        actions.put(3, () -> System.out.println("Encerrando o programa..."));

        int opcao;
        do {
            System.out.println("Bem vindos ao seu gestor pessoal de investimentos");
            System.out.println("Qual opção você deseja?");
            System.out.println("1 - Cadastrar investimentos; \n2 - Visualizar investimentos; \n3 - Sair");
            opcao = scan.nextInt();
            scan.nextLine();

            Runnable action = actions.get(opcao);
            if (action != null) {
                action.run();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }




}