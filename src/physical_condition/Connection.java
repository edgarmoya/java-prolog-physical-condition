package physical_condition;

import java.util.Map;
import javax.swing.JOptionPane;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 * Se encarga de gestionar la consulta de las bases de conocimiento.
 */
public class Connection {

    private String consult;
    private Query query;
    private Map<String, Term> solution;

    public Connection(String[] name) {
        for (String f : name) {
            consult = "consult('" + f + "')";
            query = new Query(consult);
            if (!query.hasSolution()) {
                JOptionPane.showMessageDialog(null, "No encuentra la base de conocimiento:" + f, "ERROR", JOptionPane.ERROR);
            }
        }
    }

    // sintomas que presenta 'Sultán'
    public String sintomas() {
        String res = "";
        consult = "sintoma('Sultan', X).";
        query = new Query(consult);

        if (!query.hasSolution()) {
            res += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();
                res += solution.get("X") + "\n";
            }
        }
        return res;
    }

    //Parejas que no tienen hijos
    public String[] consulta2() {
        consult = "no_hijos(N1,A1,N2,A2).";
        query = new Query(consult);

        String resultado[] = new String[2];

        resultado[0] = "Consulta\n\n?- " + consult;
        resultado[1] = "Parejas que no tienen hijos\n\n";

        if (!query.hasSolution()) {
            resultado[1] += "No se encontraron\n";
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {
                solution = query.nextSolution();
                resultado[1] += solution.get("N1") + " " + solution.get("A1") + "\n";
                resultado[1] += solution.get("N2") + " " + solution.get("A2") + "\n";
            }
        }
        return resultado;
    }
}
