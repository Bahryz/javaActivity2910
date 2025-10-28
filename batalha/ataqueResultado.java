import java.util.List;

import efeitos.efeitoStatus;

public class ataqueResultado {
    private final int dano;
    private final List<efeitoStatus> efeitos;
    private final String mensagem;

    public ataqueResultado(int dano, List<efeitoStatus> efeitos, String mensagem) {
        this.dano = dano;
        this.efeitos = efeitos;
        this.mensagem = mensagem;
    }
    public int getDano() { return dano; }
    public List<efeitoStatus> getEfeitos() { return efeitos; }
    public String getMensagem() { return mensagem; }
}
