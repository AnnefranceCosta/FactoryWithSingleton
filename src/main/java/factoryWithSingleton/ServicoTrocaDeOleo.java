package factoryWithSingleton;

public class ServicoTrocaDeOleo implements IServico{
    private static ServicoTrocaDeOleo instance = new ServicoTrocaDeOleo();

    private ServicoTrocaDeOleo() {}

    public static ServicoTrocaDeOleo getInstance() {
        return instance;
    }

    public String executar() {
        return "Troca de óleo efetivada";
    }

    public String cancelar() {
        return "Troca de óleo cancelada";
    }
}
