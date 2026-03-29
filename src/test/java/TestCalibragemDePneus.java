import factoryWithSingleton.IServico;
import factoryWithSingleton.ServicoCalibragemDePneus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalibragemDePneus {
    @Test
    void deveExecutarCalibragemDePneus() {
        IServico servico = ServicoCalibragemDePneus.getInstance();
        assertEquals("Calibragem de pneus efetivada", servico.executar());
    }

    @Test
    void deveCancelarCalibragemDePneus() {
        IServico servico = ServicoCalibragemDePneus.getInstance();
        assertEquals("Calibragem de pneus cancelada", servico.cancelar());
    }
}
