package Iphone;

public interface NavegadorInternet {

    /**
     * Carrega e exibe o conteúdo de uma página web.
     * @param url O endereço da página a ser exibida.
     */
    void exibirPagina(String url);

    /**
     * Abre uma nova aba no navegador.
     */
    void adicionarNovaAba();

    /**
     * Recarrega a página atual para obter o conteúdo mais recente.
     */
    void atualizarPagina();
}
