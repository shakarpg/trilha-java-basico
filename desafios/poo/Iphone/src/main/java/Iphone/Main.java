package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.selecionarMusica("U2 - Vertigo");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("99999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}