public class FuncionarioAnaliseFinanceira extends Funcionario{

    public FuncionarioAnaliseFinanceira(Funcionario funcionarioProximaEtapa) {
        listaEtapas.add("Etapa análise financeira");
        setFuncionarioProximaEtapa(funcionarioProximaEtapa);
    }

    @Override
    public String getDescricaoCargo() {
        return "Analista Financeiro";
    }
}
