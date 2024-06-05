/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package equipamento.smartphone;

/**
 *
 * @author Paulo
 */
public class Smartphone {

    public static void main(String[] args) {
        Iphone ip = new Iphone();
        
        ReprodutorMusical reprodutor = ip;
        AparelhoTelefonico telefone = ip;
        NavegadorInternet navegador = ip;
        
        reprodutor.selecionarMusica("musica");
        reprodutor.pausar();
        reprodutor.tocar();
        
        telefone.ligar("numero");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        navegador.exibirPagina("url");
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();
    }
}
