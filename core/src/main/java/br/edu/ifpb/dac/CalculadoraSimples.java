package br.edu.ifpb.dac;

import br.edu.ifpb.shared.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/12/2017, 07:27:28
 */
@Stateless
@Remote(Calculadora.class)
public class CalculadoraSimples implements Calculadora {

    @Override
    public int somar(int a, int b) {
        return a * b;
    }

    @Override
    public int subtrair(int a, int b) {
        return a - b;
    }

}
