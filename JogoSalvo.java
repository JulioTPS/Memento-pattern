public class JogoSalvo {
    private Jogo jogo;
    private int nivel;
    private int progresso;

    public JogoSalvo(Jogo jogo, int nivel, int progresso) {
        this.jogo = jogo;
        this.nivel = nivel;
        this.progresso = progresso;
    }

    public void restaurar() {
        jogo.setNivel(nivel);
        jogo.setProgresso(progresso);
    }
}
