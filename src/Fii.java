import java.util.Date;
import java.util.List;

public class Fii implements Investimentos {
    private String nome;
    private double valorAportado;
    private Date data;
    private int quantidadeAtivos;

    public Fii(String nome, double valorAportado, Date data, int quantidadeAtivos) {
        this.nome = nome;
        this.valorAportado = valorAportado;
        this.data = data;
        this.quantidadeAtivos = quantidadeAtivos;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValorAportado() {
        return valorAportado;
    }

    @Override
    public Date getData() {
        return data;
    }

    @Override
    public int getQuantidadeAtivos() {
        return quantidadeAtivos;
    }

    @Override
    public void visualizarInvestimentos(List<Investimentos> investimentos) {

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