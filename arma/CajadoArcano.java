package arma;

import personagem.Personagem;
import batalha.AtaqueResultado;
import efeitos.EfeitoStatus;
import efeitos.Queimadura;
import java.util.List;
import java.util.ArrayList;

public class CajadoArcano implements IArma {
    
    public String getNome() { return "Cajado Arcano"; }
    public int getDanoBase() { return 8; }
    public int getCustoMana() { return 25; }

    public boolean podeEquipar(Personagem personagem) { 
        return personagem.getInteligencia() >= 12; 
    }

    public AtaqueResultado atacar(Personagem atacante, Personagem alvo) {
        String msg = atacante.getNome() + " lança uma Bola de Fogo em " + alvo.getNome() + "!";
        List<EfeitoStatus> efeitos = new ArrayList<>();
        efeitos.add(new Queimadura());
        
        return new AtaqueResultado(getDanoBase(), efeitos, msg);
    }
}