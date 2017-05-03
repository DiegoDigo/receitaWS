package models;

/**
 * Created by diego.delmiro on 03/05/2017.
 */
public class AtividadeSecundaria {

    private String code ;

    private String text;

    public AtividadeSecundaria() {
    }

    public AtividadeSecundaria(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
