package br.edu.ifpb.stateless;

import br.edu.ifpb.shared.Calculadora;
import br.edu.ifpb.shared.ServiceLocator;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/12/2017, 07:47:42
 */
public class Main {

    public static void main(String[] args) {
        Calculadora c = (Calculadora) new ServiceLocator()
                .lookup("java:global/core/CalculadoraSimples");
        System.out.println(c.somar(3, 49));
    }

//    private static Calculadora lookup(String name) {
//        try {
//            Properties properties = new Properties();
//            properties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
//                    "com.sun.enterprise.naming.SerialInitContextFactory");
//            
//            Context context = new InitialContext(properties);
//            return (Calculadora) context.lookup(name);
//        } catch (NamingException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}
