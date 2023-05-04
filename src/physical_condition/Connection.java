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

    // consultar condición física
    public String condition() {
        String res = "";
        consult = "condicion('Sultan', X).";
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
}
