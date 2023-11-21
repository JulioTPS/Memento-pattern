public class SaveComando {
    private Jogo jogo;
    private JogoSalvo backup;

    public SaveComando(Jogo jogo) {
        this.jogo = jogo;
    }

    public void salvar() {
        backup = jogo.criarSnapshot();
    }

    public void carregar() {
        if (backup != null) {
            backup.restaurar();
        }
    }
}
