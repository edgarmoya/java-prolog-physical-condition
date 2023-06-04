package physical_condition;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class ResultModel {

    private String points;
    private String message;
    private List<String> suggestions;
    private String status;

    public ResultModel() {
    }

    public ResultModel(String points, String message, List<String> suggestions, String status) {
        this.points = points;
        this.message = message;
        this.suggestions = suggestions;
        this.status = status;
    }

    public String decode(String text) {
        byte[] bytes = text.getBytes(StandardCharsets.ISO_8859_1);
        return new String(bytes, StandardCharsets.UTF_8);        
    }
    
    public String inside(String text){
        if (text.charAt(0) == '\''){
            return text.substring(1, text.length() - 1);
        }
        return text;
    } 

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultModel{" + "points=" + points + ", message=" + message + ", suggestions=" + suggestions + ", status=" + status + '}';
    }

}
