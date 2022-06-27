public class FuncionarioVendedor extends Funcionario{
    public FuncionarioVendedor(Funcionario funcionarioProximaEtapa) {
        listaEtapas.add("Etapa realizando compra");
        setFuncionarioProximaEtapa(funcionarioProximaEtapa);
    }

    @Override
    public String getDescricaoCargo() {
        return "Vendedor";
    }
}
