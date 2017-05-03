import com.google.gson.Gson;
import models.DadosReceita;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by diego.delmiro on 03/05/2017.
 */



public class ClientRest {

    private static final String URL_SEFAZ = "http://www.receitaws.com.br/v1/cnpj/27865757000102";

    public static void main(String[] args){

//        if(args.length > 0){
            try {
                URL url = new URL(URL_SEFAZ);
                HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
                conexao.setRequestMethod("GET");
                String conteudo = converterInputStreamParaString(conexao.getInputStream());
                converterEmObjeto(conteudo, "27865757000102");
                conexao.disconnect();

            } catch (Exception e) {
                e.printStackTrace();
            }
//        }else{
//            System.out.printf("Por Favor passe o numero do cnpj a pesquisar");
//        }
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
        if(!conteudo.equals("") ||!conteudo.isEmpty()){
            Gson gson = new Gson();
            DadosReceita dados = gson.fromJson(conteudo,DadosReceita.class);
            gravarArquivoTexto(dados, cnpj);
        }else{
            System.out.printf("Não existe dados para o cnpj informado");
        }
    }


    private static void gravarArquivoTexto(DadosReceita dados, String cnpj) throws IOException {

        final String caminho = "c:\\" + cnpj +".txt";

        FileWriter arq = new FileWriter(caminho);
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+%n");

        gravarArq.println(dados.getAbertura());

        arq.close();


    }

}





