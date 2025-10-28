package arma;

import personagem.Personagem;
import batalha.AtaqueResultado;
import java.util.Collections;

public class AdagaSombria implements IArma {
    
    public String getNome() { return "Adaga Sombria"; }
    public int getDanoBase() { return 10; }
    public int getCustoMana() { return 10; }

    public boolean podeEquipar(Personagem personagem) { 
        return personagem.getDestreza() >= 12; 
    }

    public AtaqueResultado atacar(Personagem atacante, Personagem alvo) {
        int danoFinal = getDanoBase();
        String msg;

        // Verifica se o alvo está "desprevenido" (ex: primeiro turno ou atordoado)
        if (alvo.isDesprevenido()) {
            danoFinal *= 3;
            msg = atacante.getNome() + " usa Ataque Furtivo nas costas de " + alvo.getNome() + " causando dano triplo!";
        } else {
            msg = atacante.getNome() + " ataca " + alvo.getNome() + " com a adaga.";
        }
        
        return new AtaqueResultado(danoFinal, Collections.emptyList(), msg);
    }
}