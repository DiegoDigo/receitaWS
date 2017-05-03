import com.google.gson.Gson;
import models.AtividadePrincipal;
import models.AtividadeSecundaria;
import models.DadosReceita;
import models.QuadroSocioAdm;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by diego.delmiro on 03/05/2017.
 */



public class ClientRest {

    private static final String URL_SEFAZ = "http://www.receitaws.com.br/v1/cnpj/";
    private static String cnpj ="";
    private static String caminho = "";
    private static String caminhoFinal = "";

    public static void main(String[] args){

        if (args.length > 0){
            cnpj  = String.valueOf(args[0]);
            caminho = String.valueOf(args[1]);
        }

        if(!cnpj.isEmpty() || !cnpj.equals("") && !caminho.isEmpty() || !caminho.equals("")){
            try {
                URL url = new URL(URL_SEFAZ + cnpj);
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                String conteudo = converterInputStreamParaString(conexao.getInputStream());
                converterEmObjeto(conteudo, cnpj);
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.printf("Por Favor passe o numero do cnpj a pesquisar");
        }
    }

    public static String converterInputStreamParaString(InputStream is) throws IOException {
        if (is != null) {
            Writer writer = new StringWriter();

            char[] buffer = new char[1024];
            try {
                Reader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                int n;
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
            } finally {
                is.close();
            }
            return writer.toString();
        } else {
            return "";
        }
    }

    private static void converterEmObjeto(String conteudo, String cnpj) throws IOException {
        if(conteudo.equals("") ||conteudo.isEmpty() || conteudo.contains("ERROR")){
            System.out.printf("Não existe dados para o cnpj informado");
        }else{
            Gson gson = new Gson();
            DadosReceita dados = gson.fromJson(conteudo, DadosReceita.class);
            gravarArquivoTexto(dados, cnpj);
        }
    }


    private static void gravarArquivoTexto(DadosReceita dados, String cnpj) throws IOException {

        if(caminho.endsWith("\\")){
            caminhoFinal  = caminho + cnpj +".txt";
        }else{
            caminhoFinal = caminho +"\\"+ cnpj +".txt";
        }

        FileWriter arq = new FileWriter(caminhoFinal);
        PrintWriter gravarArq = new PrintWriter(arq);
        moverDadosParaArquivo(gravarArq,dados);
        arq.close();


    }

    private static void moverDadosParaArquivo(PrintWriter gravarArq, DadosReceita dados){
        gravarArq.printf(dados.getStatus());
        gravarArq.printf(";");
        gravarArq.printf(dados.getMessage() == null ? "" : dados.getMessage());
        gravarArq.printf(";");
        gravarArq.printf(dados.getCnpj());
        gravarArq.printf(";");
        gravarArq.printf(dados.getTipo());
        gravarArq.printf(";");
        gravarArq.printf(dados.getAbertura());
        gravarArq.printf(";");
        gravarArq.printf(dados.getNome());
        gravarArq.printf(";");
        gravarArq.printf(dados.getFantasia());
        gravarArq.printf(";");
        for (AtividadePrincipal atividade : dados.getAtividade_principal()) {
            gravarArq.printf(atividade.getCode());
            gravarArq.printf(";");
            gravarArq.printf(atividade.getText());
            gravarArq.printf(";");
        }
        for (AtividadeSecundaria atividade : dados.getAtividades_secundarias()) {
            gravarArq.printf(atividade.getCode());
            gravarArq.printf(";");
            gravarArq.printf(atividade.getText());
            gravarArq.printf(";");
        }
        gravarArq.printf(dados.getNatureza_juridica());
        gravarArq.printf(";");
        gravarArq.printf(dados.getLogradouro());
        gravarArq.printf(";");
        gravarArq.printf(dados.getNumero());
        gravarArq.printf(";");
        gravarArq.printf(dados.getComplemento());
        gravarArq.printf(";");
        gravarArq.printf(dados.getCep());
        gravarArq.printf(";");
        gravarArq.printf(dados.getBairro());
        gravarArq.printf(";");
        gravarArq.printf(dados.getMunicipio());
        gravarArq.printf(";");
        gravarArq.printf(dados.getUf());
        gravarArq.printf(";");
        gravarArq.printf(dados.getEmail());
        gravarArq.printf(";");
        gravarArq.printf(dados.getTelefone());
        gravarArq.printf(";");
        gravarArq.printf(dados.getEfr());
        gravarArq.printf(";");
        gravarArq.printf(dados.getSituacao());
        gravarArq.printf(";");
        gravarArq.printf(dados.getData_situacao());
        gravarArq.printf(";");
        gravarArq.printf(dados.getMotivo_situacao());
        gravarArq.printf(";");
        gravarArq.printf(dados.getSituacao_especial());
        gravarArq.printf(";");
        gravarArq.printf(dados.getData_situacao_especial());
        gravarArq.printf(";");
        gravarArq.printf(dados.getCapital_social());
        gravarArq.printf(";");
        for (QuadroSocioAdm qsa : dados.getQsa()) {
            gravarArq.printf(qsa.getNome());
            gravarArq.printf(";");
            gravarArq.printf(qsa.getQual());
            gravarArq.printf(";");
            gravarArq.printf(qsa.getPais_origim() == null ? "" : qsa.getPais_origim());
            gravarArq.printf(";");
            gravarArq.printf(qsa.getNome_rep_legal() == null ? "" : qsa.getNome_rep_legal());
            gravarArq.printf(";");
            gravarArq.printf(qsa.getQual_rep_legal() == null ? "" : qsa.getQual_rep_legal());
        }
    }

}





