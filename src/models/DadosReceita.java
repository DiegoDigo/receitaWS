package models;

import java.util.ArrayList;

/**
 * Created by diego.delmiro on 03/05/2017.
 */
public class DadosReceita {
    private String status;
    private String message;
    private String cnpj;
    private String tipo;
    private String abertura;
    private String nome;
    private String fantasia;
    private ArrayList<AtividadePrincipal> atividade_principal;
    private ArrayList<AtividadeSecundaria> atividades_secundarias;
    private String natureza_juridica;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String municipio;
    private String uf;
    private String email;
    private String telefone;
    private String efr;
    private String situacao;
    private String data_situacao;
    private String motivo_situacao;
    private String situacao_especial;
    private String data_situacao_especial;
    private String capital_social;
    private ArrayList<QuadroSocioAdm> qsa;
    private Extra extra;

    public DadosReceita() {

    }

    public DadosReceita(String status, String message, String cnpj,
                        String tipo, String abertura, String nome, String fantasia,
                        ArrayList<AtividadePrincipal> atividade_principal,
                        ArrayList<AtividadeSecundaria> atividades_secundarias,
                        String natureza_juridica, String logradouro, String numero, String complemento,
                        String cep, String bairro, String municipio, String uf, String email, String telefone,
                        String efr, String situacao, String data_situacao, String motivo_situacao,
                        String situacao_especial, String data_situacao_especial, String capital_social,
                        ArrayList<QuadroSocioAdm> qsa, Extra extra) {

        this.status = status;
        this.message = message;
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.abertura = abertura;
        this.nome = nome;
        this.fantasia = fantasia;
        this.atividade_principal = atividade_principal;
        this.atividades_secundarias = atividades_secundarias;
        this.natureza_juridica = natureza_juridica;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.municipio = municipio;
        this.uf = uf;
        this.email = email;
        this.telefone = telefone;
        this.efr = efr;
        this.situacao = situacao;
        this.data_situacao = data_situacao;
        this.motivo_situacao = motivo_situacao;
        this.situacao_especial = situacao_especial;
        this.data_situacao_especial = data_situacao_especial;
        this.capital_social = capital_social;
        this.qsa = qsa;
        this.extra = extra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public ArrayList<AtividadePrincipal> getAtividade_principal() {
        return atividade_principal;
    }

    public void setAtividade_principal(ArrayList<AtividadePrincipal> atividade_principal) {
        this.atividade_principal = atividade_principal;
    }

    public ArrayList<AtividadeSecundaria> getAtividades_secundarias() {
        return atividades_secundarias;
    }

    public void setAtividades_secundarias(ArrayList<AtividadeSecundaria> atividades_secundarias) {
        this.atividades_secundarias = atividades_secundarias;
    }

    public String getNatureza_juridica() {
        return natureza_juridica;
    }

    public void setNatureza_juridica(String natureza_juridica) {
        this.natureza_juridica = natureza_juridica;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEfr() {
        return efr;
    }

    public void setEfr(String efr) {
        this.efr = efr;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getData_situacao() {
        return data_situacao;
    }

    public void setData_situacao(String data_situacao) {
        this.data_situacao = data_situacao;
    }

    public String getMotivo_situacao() {
        return motivo_situacao;
    }

    public void setMotivo_situacao(String motivo_situacao) {
        this.motivo_situacao = motivo_situacao;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public String getData_situacao_especial() {
        return data_situacao_especial;
    }

    public void setData_situacao_especial(String data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public String getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(String capital_social) {
        this.capital_social = capital_social;
    }

    public ArrayList<QuadroSocioAdm> getQsa() {
        return qsa;
    }

    public void setQsa(ArrayList<QuadroSocioAdm> qsa) {
        this.qsa = qsa;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }
}
