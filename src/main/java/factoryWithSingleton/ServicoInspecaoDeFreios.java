package factoryWithSingleton;

public class ServicoInspecaoDeFreios implements IServico {

    private static ServicoInspecaoDeFreios instance = new ServicoInspecaoDeFreios();

    private ServicoInspecaoDeFreios() {}

    public static ServicoInspecaoDeFreios getInstance() {
        return instance;
    }

    public String executar() {
        return "Inspeção de freios efetivada";
    }

    public String cancelar() {
        return "Inspeção de freios cancelada";
    }
}
