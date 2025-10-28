package efeitos;

public class efeitoAtordoamento implements efeitoStatus {
    private final int duracao;
    public Atordoamento() { this(1); }
    public Atordoamento(int duracao) { this.duracao = duracao; }
    public String getNome() { return "Atordoado"; }
    public int getDuracao() { return duracao; }
    public void aplicarEfeito(Personagem alvo) {
        System.out.println(alvo.getNome() + " está atordoado!");
    }
}
