package arma;

import personagem.Personagem;
import batalha.AtaqueResultado;
import java.util.Collections;

public class ArcoElfico implements IArma {
    
    public String getNome() { return "Arco Élfico"; }
    public int getDanoBase() { return 12; }
    public int getCustoMana() { return 15; }

    public boolean podeEquipar(Personagem personagem) { 
        return personagem.getDestreza() >= 8; 
    }

    public AtaqueResultado atacar(Personagem atacante, Personagem alvo) {
        // A lógica de "Ataque em Área" é tratada na classe Batalha,
        // que verifica o resultado.
        String msg = atacante.getNome() + " usa Chuva de Flechas!";
        
        // Retorna true no "isAtaqueEmArea"
        return new AtaqueResultado(getDanoBase(), Collections.emptyList(), msg, true);
    }
}