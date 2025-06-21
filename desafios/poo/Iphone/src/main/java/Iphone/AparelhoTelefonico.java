package Iphone;

public interface AparelhoTelefonico {

    /**
     * Realiza uma chamada para o número especificado.
     * @param numero O número de telefone para o qual ligar.
     */
    void ligar(String numero);

    /**
     * Atende a uma chamada recebida.
     */
    void atender();

    /**
     * Inicia o correio de voz para ouvir as mensagens.
     */
    void iniciarCorreioVoz();
}
