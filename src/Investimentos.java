import java.util.Date;
import java.util.List;

public interface Investimentos {
    String getNome();
    double getValorAportado();
    Date getData();
    int getQuantidadeAtivos();

    public void  visualizarInvestimentos(List<Investimentos> investimentos);
}