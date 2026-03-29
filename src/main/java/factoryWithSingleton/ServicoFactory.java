package factoryWithSingleton;

import java.lang.reflect.Method;

public class ServicoFactory {
    public static IServico obterServico(String servico) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("factoryWithSingleton." + servico);

            Method metodo = classe.getMethod("getInstance");
            objeto = metodo.invoke(null);

        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }

        return (IServico) objeto;
    }
}
