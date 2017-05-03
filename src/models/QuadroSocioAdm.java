package models;



/**
 * Created by diego.delmiro on 03/05/2017.
 */
public class QuadroSocioAdm {
    private String nome;
    private String qual;
    private String pais_origim;
    private String nome_rep_legal;
    private String qual_rep_legal;

    public QuadroSocioAdm() {
    }

    public QuadroSocioAdm(String nome, String qual,
                          String pais_origim, String nome_rep_legal, String qual_rep_legal) {
        this.nome = nome;
        this.qual = qual;
        this.pais_origim = pais_origim;
        this.nome_rep_legal = nome_rep_legal;
        this.qual_rep_legal = qual_rep_legal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getPais_origim() {
        return pais_origim;
    }

    public void setPais_origim(String pais_origim) {
        this.pais_origim = pais_origim;
    }

    public String getNome_rep_legal() {
        return nome_rep_legal;
    }

    public void setNome_rep_legal(String nome_rep_legal) {
        this.nome_rep_legal = nome_rep_legal;
    }

    public String getQual_rep_legal() {
        return qual_rep_legal;
    }

    public void setQual_rep_legal(String qual_rep_legal) {
        this.qual_rep_legal = qual_rep_legal;
    }
}
