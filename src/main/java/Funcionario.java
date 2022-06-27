import java.util.ArrayList;

public abstract  class Funcionario {
    protected ArrayList listaEtapas = new ArrayList();
    private Funcionario funcionarioProximaEtapa;

    public Funcionario getFuncionarioProximaEtapa() {
        return funcionarioProximaEtapa;
    }

    public void setFuncionarioProximaEtapa(Funcionario funcionarioProximaEtapa) {
        this.funcionarioProximaEtapa = funcionarioProximaEtapa;
    }

    public abstract String getDescricaoCargo();

    public String atenderEtapaVenda(Venda venda) {
        if (listaEtapas.contains(venda.getEtapaVenda())) {
            return getDescricaoCargo();
        }
        else {
            if(venda.getEtapaVenda().equals("Preenchimento dos dados")){
                return "Cliente preenchedo os dados";
            }
            if (funcionarioProximaEtapa != null) {
                return funcionarioProximaEtapa.atenderEtapaVenda(venda);
            }
            else
            {
                return "Venda e instalação concluídas!";
            }
        }
    }
}
