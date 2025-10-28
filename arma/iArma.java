package arma;

public interface iArma {
    String getNome();
    int getDanoBase();
    int getCustoMana();
    boolean podeEquipar(Personagem personagem);
    AtaqueResultado atacar(Personagem atacante, Personagem alvo);
}
