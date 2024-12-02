package br.com.alura.desafioconversordemoedas.classes;

import br.com.alura.desafioconversordemoedas.records.Moedas;
import br.com.alura.desafioconversordemoedas.records.RespostaAPI;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public Moedas buscaCotacao(String sMoedaConsulta) {
        var sKey = "4782363513c55663b3cb552a";
        var sEnderecoFixo = "https://v6.exchangerate-api.com/v6/";
        var sEndereco = "";

        sEndereco = sEnderecoFixo + sKey + "/latest/" + sMoedaConsulta;
        //System.out.println(sEndereco);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(sEndereco)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            RespostaAPI clResposta = new Gson().fromJson(response.body(), RespostaAPI.class);
            return clResposta.converteValores();

        } catch (Exception e) {
            System.out.println("Não consegui obter a cotação dessa moeda [" + sMoedaConsulta + "].");
            throw new RuntimeException(e);
        }
    }
}
