package cenario12;

// Derrotar dragões é uma tarefa perigosa, mas com o tempo e a experiência, os caçadores aprendem que não existe uma única forma eficaz de vencer todos os tipos de dragão. Dragões vermelhos, verdes e negros possuem comportamentos distintos e demandam estratégias de combate diferentes.
// Um caçador experiente escolhe sua abordagem com base no inimigo: pode enfrentar o dragão corpo a corpo com uma espada lendária, usar uma besta mágica à distância, ou conjurar feitiços de destruição. O segredo é que o caçador não muda quem ele é — ele apenas adapta sua estratégia de ataque, conforme o tipo de dragão que surge no caminho.
// Seu desafio é desenvolver um sistema que permita ao caçador alternar dinamicamente entre diferentes formas de atacar, sem precisar reescrever ou duplicar o código do caçador toda vez que uma nova estratégia for criada.
// Se você precisasse implementar esse sistema de combate, de forma que o caçador possa alternar entre estratégias como usar espada, besta ou magia, qual padrão de projeto seria o mais adequado para estruturar essa lógica? 

// Strategy


public interface Estrategia {
    void atacar();
} 

public class DerrotarDragoes{
    private Estrategia estrategia;

    public DerrotarDragoes(Estrategia estrategia){
        this.estrategia = estrategia;
    }

    public void comecarAtaque(){
        estrategia.atacar();
    }
}

public class Espada implements Estrategia{
    public void atacar(){
        System.out.println("Atacando com uma Espada.");
    }
}

public class Besta implements Estrategia{
    public void atacar(){
        System.out.println("Atacando com uma Besta.");
    }
}

public class Magia implements Estrategia{
    public void atacar(){
        System.out.println("Atacando com Magia.");
    }
}