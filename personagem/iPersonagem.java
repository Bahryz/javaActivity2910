package personagem;

public interface  iPersonagem {
    default void atacar() {
        System.out.println("Personagem atacando!");
    }
}
