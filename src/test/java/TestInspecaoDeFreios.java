import factoryWithSingleton.IServico;
import factoryWithSingleton.ServicoInspecaoDeFreios;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInspecaoDeFreios {
    @Test
    void deveExecutarCalibragemDePneus() {
        IServico servico = ServicoInspecaoDeFreios.getInstance();
        assertEquals("Inspeção de freios efetivada", servico.executar());
    }

    @Test
    void deveCancelarCalibragemDePneus() {
        IServico servico = ServicoInspecaoDeFreios.getInstance();
        assertEquals("Inspeção de freios cancelada", servico.cancelar());
    }
}
