/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Iphone;

/**
 *
 * @author rafin
 */
public interface ReprodutorMusical {

    /**
     * Inicia a reprodução da música selecionada.
     */
    void tocar();

    /**
     * Pausa a reprodução da música atual.
     */
    void pausar();

    /**
     * Escolhe uma música da biblioteca para tocar.
     * @param musica O nome da música a ser selecionada.
     */
    void selecionarMusica(String musica);
}

