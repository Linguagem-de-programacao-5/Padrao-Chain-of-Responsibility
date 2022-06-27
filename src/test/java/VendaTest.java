import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    FuncionarioAnaliseFinanceira analistaFinanceiro;
    FuncionarioAnaliseTecnico analistaTecnico;
    FuncionarioVendedor vendedor;
    FuncionarioTecnico tecnico;
    Venda venda;

    @BeforeEach
    void setUp(){
        tecnico = new FuncionarioTecnico(null);
        vendedor = new FuncionarioVendedor(tecnico);
        analistaTecnico = new FuncionarioAnaliseTecnico(vendedor);
        analistaFinanceiro = new FuncionarioAnaliseFinanceira(analistaTecnico);
        venda = new Venda();
    }

    @Test
    void deveRetornarAnalistaFinanceiraParaEtapaAnaliseFinanceira() {
        venda.setEtapaVenda("Etapa análise financeira");
        assertEquals("Analista Financeiro", analistaFinanceiro.atenderEtapaVenda(venda));
    }
    
    @Test
    void deveRetornarAnalistaTecnicoParaEtapaAnaliseTecnica() {
        venda.setEtapaVenda("Etapa análise técnica");
        assertEquals("Analista Técnico", analistaFinanceiro.atenderEtapaVenda(venda));
    }


    @Test
    void deveRetornarVendedorParaEtapaRealizandoCompra() {
        venda.setEtapaVenda("Etapa realizando compra");
        assertEquals("Vendedor", analistaFinanceiro.atenderEtapaVenda(venda));
    }

    @Test
    void deveRetornarTecnicoParaEtapaInstalacao() {
        venda.setEtapaVenda("Etapa de instalação");
        assertEquals("Técnico", analistaFinanceiro.atenderEtapaVenda(venda));
    }

    @Test
    void deveRetornarVendaConcluidaParaEtapaEtapaConcluida() {
        venda.setEtapaVenda("Concluída");
        assertEquals("Venda e instalação concluídas!", analistaFinanceiro.atenderEtapaVenda(venda));
    }

    @Test
    void deveRetornarClientePreenchendoDadosParaVendaInstanciada() {
        assertEquals("Cliente preenchedo os dados", analistaFinanceiro.atenderEtapaVenda(venda));
    }
}