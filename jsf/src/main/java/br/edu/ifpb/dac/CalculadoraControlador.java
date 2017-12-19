package br.edu.ifpb.dac;

import br.edu.ifpb.shared.Calculadora;
import br.edu.ifpb.shared.ServiceLocator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 12/12/2017, 08:53:37
 */
@Named
@RequestScoped
public class CalculadoraControlador {

    private Calculadora calculadora;

    @PostConstruct
    public void init() {
        calculadora = (Calculadora) new ServiceLocator().lookup("java:global/core/CalculadoraSimples");
    }

    private int a;
    private int b;
    private int soma;

    public String somar() {
        this.soma = calculadora.somar(a, b);
        return null;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

}
