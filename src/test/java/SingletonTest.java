import factoryWithSingleton.IServico;
import factoryWithSingleton.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
    @Test
    void deveRetornarMesmaInstanciaParaServicoAlinhamento() {
        IServico servico1 = ServicoFactory.obterServico("ServicoAlinhamento");
        IServico servico2 = ServicoFactory.obterServico("ServicoAlinhamento");

        assertSame(servico1, servico2);
    }

    @Test
    void deveRetornarMesmaInstanciaParaServicoCalibragemDePneus() {
        IServico servico1 = ServicoFactory.obterServico("ServicoCalibragemDePneus");
        IServico servico2 = ServicoFactory.obterServico("ServicoCalibragemDePneus");

        assertSame(servico1, servico2);
    }

    @Test
    void deveRetornarMesmaInstanciaParaServicoInspecaoDeFreios() {
        IServico servico1 = ServicoFactory.obterServico("ServicoInspecaoDeFreios");
        IServico servico2 = ServicoFactory.obterServico("ServicoInspecaoDeFreios");

        assertSame(servico1, servico2);
    }

    @Test
    void deveRetornarMesmaInstanciaParaServicoTrocaDeOleo() {
        IServico servico1 = ServicoFactory.obterServico("ServicoTrocaDeOleo");
        IServico servico2 = ServicoFactory.obterServico("ServicoTrocaDeOleo");

        assertSame(servico1, servico2);
    }
}
