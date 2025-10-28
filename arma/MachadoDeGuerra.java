package arma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import personagem.Personagem;
import batalha.AtaqueResultado;
import efeitos.EfeitoStatus;
import efeitos.Atordoamento;

public class MachadoDeGuerra implements IArma {
    private Random rng = new Random();

    public String getNome() { return "Machado de Guerra"; }
    public int getDanoBase() { return 18; }
    public int getCustoMana() { return 5; }

    public boolean podeEquipar(Personagem personagem) { 
        return personagem.getForca() >= 15; 
    }

    public AtaqueResultado atacar(Personagem atacante, Personagem alvo) {
        boolean atordoa = rng.nextInt(100) < 25; // 25% de chance
        List<EfeitoStatus> efeitos = new ArrayList<>();
        String msg = atacante.getNome() + " ataca " + alvo.getNome() + " com um golpe pesado.";

        if (atordoa) {
            efeitos.add(new Atordoamento());
            msg = atacante.getNome() + " usa Golpe Esmagador em " + alvo.getNome() + "! Alvo Atordoado!";
        }
        
        return new AtaqueResultado(getDanoBase(), efeitos, msg);
    }
}