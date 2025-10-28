package efeitos;

public class efeitoQueimadura implements efeitoStatus {
    private final int duracao;
    private final int danoPorTurno;
    public Queimadura() { this(2, 10); }
    public Queimadura(int duracao, int danoPorTurno) {
        this.duracao = duracao;
        this.danoPorTurno = danoPorTurno;
    }
    public String getNome() { return "Queimadura"; }
    public int getDuracao() { return duracao; }
    public void aplicarEfeito(Personagem alvo) {
        System.out.println(alvo.getNome() + " sofre queimadura!");
    }
}
