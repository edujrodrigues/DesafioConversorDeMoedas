import br.com.alura.desafioconversordemoedas.records.ResultadoConversao;

import java.util.Scanner;

import static br.com.alura.desafioconversordemoedas.classes.Menus.*;

public class Principal {
    public static void main(String[] args) {
        var iLeitura = 0;
        var iOpcaoOK = 0;
        var sMoedaOrigem = "USD";
        var sMoedaDestino = "USD";
        double dbValor;
        double dbResultado;
        Scanner scanLeitura = new Scanner(System.in);

        while (true){
            try {
                menuPrincipal();
                iLeitura = scanLeitura.nextInt();
                iOpcaoOK = validaMenu(iLeitura);

                if (iOpcaoOK == -1) {
                    System.out.println("\nOpção inválida! Tente novamente.\n");
                } else {
                    if (iLeitura == 7) {
                        break;
                    }
                    menuValor();
                    dbValor = scanLeitura.nextDouble();

                    ResultadoConversao clResultado = new ResultadoConversao(0, "", "");
                    clResultado = calculaValor(iLeitura, dbValor);
                    dbResultado = clResultado.valorConvertido();
                    sMoedaOrigem = clResultado.moedaOrigem();
                    sMoedaDestino = clResultado.moedaDestino();

                    System.out.println("Valor " + String.valueOf(dbValor).replace(".", ",") + " [" + sMoedaOrigem + "]" + " corresponde ao valor final =>>> "
                                                +  String.valueOf(dbResultado).replace(".", ",") + " [" + sMoedaDestino + "]");
                }
            } catch (Exception e) {
                System.out.println("Não é permitido digitar letras. Programa será finalizado.");
                break;
            }
        }
        System.out.println("Programa finalizado! Obrigado!");
    }
}
