/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipamento.smartphone;

/**
 *
 * @author Paulo
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA VIA REPRODUTOR MUSICAL DO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA VIA REPRODUTOR MUSICAL DO IPHONE");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA VIA REPRODUTOR MUSICAL DO IPHONE");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("FAZENDO UMA LIGAÇÃO VIA APARELHO TELEFÔNICO DO IPHONE");
    }

    @Override
    public void atender() {
      System.out.println("ATENDENDO UMA LIGAÇÃO VIA APARELHO TELEFÔNICO DO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA APARELHO TELEFÔNICO DO IPHONE");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA VIA NAVEGADOR DO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA NAVEGADOR DO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA VIA NAVEGADOR DO IPHONE");
    }
    
}
