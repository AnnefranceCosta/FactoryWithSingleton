package factoryWithSingleton;

public class ServicoCalibragemDePneus implements IServico {

    private static ServicoCalibragemDePneus instance = new ServicoCalibragemDePneus();

    private ServicoCalibragemDePneus() {}

    public static ServicoCalibragemDePneus getInstance() {
        return instance;
    }

    public String executar() {
        return "Calibragem de pneus efetivada";
    }

    public String cancelar() {
        return "Calibragem de pneus cancelada";
    }
}
