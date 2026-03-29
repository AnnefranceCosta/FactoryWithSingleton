import factoryWithSingleton.IServico;
import factoryWithSingleton.ServicoAlinhamento;
import factoryWithSingleton.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestAlinhamento {
    @Test
    void deveExecutarAlinhamento() {
        IServico servico = ServicoAlinhamento.getInstance();
        assertEquals("Alinhamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarInspecaoDeFreios() {
        IServico servico = ServicoAlinhamento.getInstance();
        assertEquals("Alinhamento cancelado", servico.cancelar());
    }
}
