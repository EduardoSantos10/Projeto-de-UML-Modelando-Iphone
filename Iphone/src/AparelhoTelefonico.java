public class AparelhoTelefonico {
    public static void main(String[] args) {
        ReprodutorMusical rep = new ReprodutorMusical();
        rep.tocar();
        rep.pausar();
        rep.selecionarMusica();

        NavegadorIntenet nav = new NavegadorIntenet();
        nav.exibirPagina();
        nav.adicionarPagina();
        nav.atualizarPagina();

        Telefone tel = new Telefone();
        tel.ligar();
        tel.atender();
        tel.iniciarCorreioVoz();
    }
}
