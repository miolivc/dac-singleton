package br.edu.ifpb.dac;

import br.edu.ifpb.shared.Calculadora;
import br.edu.ifpb.shared.ServiceLocator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/calculadora"})
public class CalculadoraServlet extends HttpServlet {

//    @Inject
//    @EJB
    //java:global/core/CalculadoraSimples
    private Calculadora calculadora
            = new ServiceLocator()
                    .lookup("java:global/core/CalculadoraSimples");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int resultado = calculadora.somar(a, b);

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado:" + resultado + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
