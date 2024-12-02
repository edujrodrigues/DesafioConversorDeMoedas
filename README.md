
# Conversor de Moedas

Este é um projeto em Java que permite converter valores entre diferentes moedas usando cotações em tempo real, obtidas de exchangerate-api.com. O objetivo é fornecer uma aplicação simples para realizar conversões rápidas entre algumas moedas selecionadas como Dólar (USD), Real Brasileiro (BRL), Peso Argentino (ARS), e Peso Colombiano (COP).

---

## 📋 Funcionalidades

- Conversão entre moedas:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileiro (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Interface de menu simples via terminal.
- Integração com a [ExchangeRate-API](https://www.exchangerate-api.com/) para obter cotações atualizadas.

---

## 🛠️ Estrutura do Projeto

- **Principal**: Classe principal que contém o loop de execução e gerencia o fluxo do programa.
- **Menus**: Classe responsável pelos menus e pela lógica de conversão.
- **ConsultaMoeda**: Classe que faz requisições HTTP para buscar as taxas de câmbio.
- **Records**:
  - `Moedas`: Representa as taxas de câmbio recebidas da API.
  - `RespostaAPI`: Representa a estrutura do JSON retornado pela API.
  - `ResultadoConversao`: Armazena os detalhes de uma conversão (valor convertido, moeda origem e destino).

---

## 🧑‍💻 Exemplo de Uso

1. O programa exibirá o menu principal:
   ```
   ***********************************
   Seja bem-vindo/a ao Conversor de Moeda =)

   1) Dólar =>> Peso argentino
   2) Peso argentino =>> Dólar
   3) Dólar =>> Real brasileiro
   4) Real brasileiro =>> Dólar
   5) Dólar =>> Peso colombiano
   6) Peso colombiano =>> Dólar
   7) Sair
   Escolha um opção válida:
   ***********************************
   ```

2. Escolha uma opção de conversão (exemplo: `1` para converter USD para ARS).

3. Insira o valor a ser convertido.

4. Veja o resultado:
   ```
   Valor 100,0 [USD] corresponde ao valor final =>>> 101175,0 [ARS]
   ```

---

## 📚 Dependências

- [Gson](https://github.com/google/gson): Biblioteca para manipular JSON.
- Java 17.

---

## ⚙️ Configuração da API

O projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para buscar as cotações das moedas. 

### Como configurar:
1. Crie uma conta na [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Obtenha sua chave de API.
3. Substitua a variável `sKey` na classe `ConsultaMoeda` pela sua chave:
   ```java
   var sKey = "SUA_CHAVE_AQUI";
   ```

---
