public class FuncionarioTecnico extends Funcionario{
    public FuncionarioTecnico(Funcionario funcionarioProximaEtapa) {
        listaEtapas.add("Etapa de instalação");
        setFuncionarioProximaEtapa(funcionarioProximaEtapa);
    }

    @Override
    public String getDescricaoCargo() {
        return "Técnico";
    }
}
