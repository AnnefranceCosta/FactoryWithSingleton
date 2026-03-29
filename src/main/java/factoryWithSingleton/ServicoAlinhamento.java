package factoryWithSingleton;

public class ServicoAlinhamento implements IServico {

    private static ServicoAlinhamento instance = new ServicoAlinhamento();

    private ServicoAlinhamento() {}

    public static ServicoAlinhamento getInstance() {
        return instance;
    }

    public String executar() {
        return "Alinhamento efetivado";
    }

    public String cancelar() {
        return "Alinhamento cancelado";
    }
}
