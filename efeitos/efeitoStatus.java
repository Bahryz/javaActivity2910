package efeitos;

public interface efeitoStatus {
    String getNome();
    int getDuracao();
    void aplicarEfeito(Personagem alvo);
}