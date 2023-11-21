public class MementoExemplo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo(1, 0);
        jogo.exibirStatus();

        SaveComando saveComando = new SaveComando(jogo);
        saveComando.salvar();

        jogo.setNivel(5);
        jogo.setProgresso(50);
        jogo.exibirStatus();


        saveComando.carregar();
        jogo.exibirStatus();
    }
}
