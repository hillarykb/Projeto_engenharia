package com.example.jeniffer.projeto_eng;


import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexao {

    public static String postDados (String urlUsuario, String parametrosUsuario){
        URL url;
        HttpURLConnection connection = null;

        try{

            url = new URL(urlUsuario);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Lenght", "" + Integer.toString(parametrosUsuario.getBytes().length));
            connection.setRequestProperty("Content-language", "pt-BR");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            /*
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.writeBytes(parametrosUsuario);
            dataOutputStream.flush();
            dataOutputStream.close();*/

            OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            OutputStreamWriter.write(parametrosUsuario);
            OutputStreamWriter.flush();

            InputStream inputStream = connection.getInputStream();
            BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String linha;
            StringBuffer resposta = new StringBuffer();

             while ((linha = BufferedReader.readLine()) != null){
                resposta.append(linha);
                 resposta.append('\r');
             }
             BufferedReader.close();
             return resposta.toString();

        }catch (Exception erro){
            return null;
        }finally {

            if(connection != null){
                connection.disconnect();
            }
        }
    }
}
