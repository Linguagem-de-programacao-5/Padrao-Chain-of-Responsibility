public class FuncionarioAnaliseTecnico extends Funcionario{
    public FuncionarioAnaliseTecnico(Funcionario funcionarioProximaEtapa) {
        listaEtapas.add("Etapa análise técnica");
        setFuncionarioProximaEtapa(funcionarioProximaEtapa);
    }

    @Override
    public String getDescricaoCargo() {
        return "Analista Técnico";
    }
}
