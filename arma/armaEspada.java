package arma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class armaEspada implements iArma {
    public String getNome() { return "Espada Longa"; }
    public int getDanoBase() { return 15; }
    public int getCustoMana() { return 0; }
    public boolean podeEquipar(Personagem personagem) { return personagem.getForca() >= 10; }
    public ataqueResultado atacar(Personagem atacante, Personagem alvo) {
        Random rng = new Random();
        boolean sangra = rng.nextInt(100) < 30;
        List<StatusEffect> efeitos = new ArrayList<>();
        String msg = "Corte simples.";
        if (sangra) {
            efeitos.add(new Sangramento());
            msg = "Corte profundo! Sangramento!";
        }
        return new AtaqueResultado(getDanoBase(), efeitos, msg);
    }
}