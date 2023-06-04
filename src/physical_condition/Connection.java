package physical_condition;

import java.util.Map;
import javax.swing.JOptionPane;
import org.jpl7.Query;
import org.jpl7.Term;
import java.util.ArrayList;
import java.util.List;

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
    public ResultModel condition(int edad, double peso, double altura, String coord, String flex, int fortaleza, int resistencia) {
        ResultModel resultModel = new ResultModel();
        consult = "prueba(" + edad + "," + peso + "," + altura + ",'" + coord + "','" + flex + "'," + fortaleza + "," + resistencia + ", Puntos, Pautas, Msj).";
        query = new Query(consult);

        if (!query.hasSolution()) {
            resultModel.setStatus("No se encontró respuesta");
        } else {
            //ciclo para concatenar todas las soluciones de la consulta
            while (query.hasMoreSolutions()) {              
                solution = query.nextSolution();
                
                // Obtiene la lista de resultados
                Term results = solution.get("Pautas");
                // Convierte la lista de resultados a una lista de Java
                List<String> listPautas = new ArrayList<>();
                for (Term result : results.listToTermArray()) {
                    String t = resultModel.decode(result.toString());
                    listPautas.add(resultModel.inside(t));
                }
                               
                String puntos = solution.get("Puntos").toString();
                String msj = solution.get("Msj").toString();

                resultModel.setPoints(puntos);
                resultModel.setMessage(resultModel.decode(msj));
                resultModel.setSuggestions(listPautas);
                resultModel.setStatus("Se encontró respuesta");
            }
        }
        return resultModel;
    }
}
