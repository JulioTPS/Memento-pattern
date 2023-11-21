class Jogo {
    private int nivel;
    private int progresso;

    public Jogo(int nivel, int progresso) {
        this.nivel = nivel;
        this.progresso = progresso;
    }

    public void exibirStatus() {
        System.out.printf("Nível: %d, Experiência: %d\n", nivel, progresso);
    }

    public JogoSalvo criarSnapshot() {
        return new JogoSalvo(this, nivel, progresso);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

}