import factoryWithSingleton.IServico;
import factoryWithSingleton.ServicoTrocaDeOleo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTrocaDeOleo {
    @Test
    void deveExecutarTrocaDeOleo() {
        IServico servico = ServicoTrocaDeOleo.getInstance();
        assertEquals("Troca de óleo efetivada", servico.executar());
    }

    @Test
    void deveCancelarCalibragemDePneus() {
        IServico servico = ServicoTrocaDeOleo.getInstance();
        assertEquals("Troca de óleo cancelada", servico.cancelar());
    }
}
