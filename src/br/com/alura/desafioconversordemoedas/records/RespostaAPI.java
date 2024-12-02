package br.com.alura.desafioconversordemoedas.records;

public class RespostaAPI {
    private Moedas conversion_rates; // Nome deve ser igual ao do JSON

    public Moedas converteValores() {
        return conversion_rates;
    }
}
