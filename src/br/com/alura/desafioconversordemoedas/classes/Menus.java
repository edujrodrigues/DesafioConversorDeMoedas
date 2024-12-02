package br.com.alura.desafioconversordemoedas.classes;

import br.com.alura.desafioconversordemoedas.records.Moedas;
import br.com.alura.desafioconversordemoedas.records.ResultadoConversao;

public class Menus {
    public static void menuPrincipal() {
        System.out.println("***********************************");
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =)\n" +
                "\n" +
                "1) Dólar =>> Peso argentino\n" +
                "2) Peso argentido =>> Dólar\n" +
                "3) Dólar =>> Real brasileiro\n" +
                "4) Real brasileiro =>> Dólar\n" +
                "5) Dólar =>> Peso colombiano\n" +
                "6) Peso colombiano =>> Dólar\n" +
                "7) Sair\n" +
                "Escolha um opção válida:");
        System.out.println("***********************************");
    }

    public static int validaMenu(int iOpcao){
        if (iOpcao < 1 || iOpcao > 7){
            return -1;
        } else {
            return 0;
        }
    }

    public static void menuValor(){
        System.out.println("Digite o valor que deseja converter: ");
    }

    public static ResultadoConversao calculaValor(int iiOpcao, double idbValor){
        String sMoedaOrigem = "";
        String sMoedaDestino = "";
        double dbResultado = 0;
        ConsultaMoeda clConsulta = new ConsultaMoeda();

        if (iiOpcao == 1){
            sMoedaOrigem = "USD";
            sMoedaDestino = "ARS";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);
            dbResultado = idbValor * clMoedas.ARS();

        } else if (iiOpcao == 2) {
            sMoedaOrigem = "ARS";
            sMoedaDestino = "USD";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);

            dbResultado = idbValor * clMoedas.USD();
        } else if (iiOpcao == 3) {
            sMoedaOrigem = "USD";
            sMoedaDestino = "BRL";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);

            dbResultado = idbValor * clMoedas.BRL();
        } else if (iiOpcao == 4) {
            sMoedaOrigem = "BRL";
            sMoedaDestino = "USD";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);

            dbResultado = idbValor * clMoedas.USD();
        } else if (iiOpcao == 5) {
            sMoedaOrigem = "USD";
            sMoedaDestino = "COP";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);

            dbResultado = idbValor * clMoedas.COP();
        } else if (iiOpcao == 6) {
            sMoedaOrigem = "COP";
            sMoedaDestino = "USD";

            Moedas clMoedas = clConsulta.buscaCotacao(sMoedaOrigem);

            dbResultado = idbValor * clMoedas.USD();
        } //if
        return new ResultadoConversao(dbResultado, sMoedaOrigem, sMoedaDestino);
    } // public
} //menu
