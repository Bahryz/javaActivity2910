package efeitos;

public class efeitoSangramento implements efeitoStatus {
    private final int duracao;
    private final int danoPorTurno;
    public Sangramento() { this(3, 5); }
    public Sangramento(int duracao, int danoPorTurno) {
        this.duracao = duracao;
        this.danoPorTurno = danoPorTurno;
    }
    public String getNome() { return "Sangramento"; }
    public int getDuracao() { return duracao; }
    public void aplicarEfeito(Personagem alvo) {
        System.out.println(alvo.getNome() + " sofre sangramento!");
    }
}
