package factoryWithSingleton;

public class ServicoFalso {
    private static ServicoFalso instance = new ServicoFalso();

    private ServicoFalso() {
    }

    public static ServicoFalso getInstance() {
        return instance;
    }
}
