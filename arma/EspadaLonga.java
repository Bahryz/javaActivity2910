package arma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import batalha.AtaqueResultado;
import personagem.Personagem;
import efeitos.EfeitoStatus;
import efeitos.Sangramento;

public class EspadaLonga implements IArma {
    private Random rng = new Random();

    public String getNome() { return "Espada Longa"; }
    public int getDanoBase() { return 15; }
    public int getCustoMana() { return 0; }
    
    public boolean podeEquipar(Personagem personagem) { 
        return personagem.getForca() >= 10; 
    }

    public AtaqueResultado atacar(Personagem atacante, Personagem alvo) {
        boolean sangra = rng.nextInt(100) < 30; // 30% de chance
        List<EfeitoStatus> efeitos = new ArrayList<>();
        String msg = atacante.getNome() + " ataca " + alvo.getNome() + " com um corte simples.";

        if (sangra) {
            efeitos.add(new Sangramento());
            msg = atacante.getNome() + " usa Corte Profundo em " + alvo.getNome() + "! Causando Sangramento!";
        }
        
        return new AtaqueResultado(getDanoBase(), efeitos, msg);
    }
}


