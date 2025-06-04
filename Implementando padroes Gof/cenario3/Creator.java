package cenario3;

// Uma confeitaria está buscando diversificar sua oferta de doces, planejando introduzir bolos, cupcakes, tortas e pudins. Cada tipo de doce tem um conjunto único de ingredientes e um processo de preparação específico. Esperando adicionar mais variedades no futuro, a confeitaria quer uma solução que permita criar novos doces sem precisar modificar o código existente.Dado o cenário, qual padrão de projeto seria mais adequado para facilitar a criação dos diferentes tipos de doces? Justifique. Represente sua solução com um diagrama de classes ou forneça o código.

// Factory Method

public abstract class Creator {
    public abstract Doce criar();
}

public class CreatorCupcake extends Creator {

    @Override
    public Doce criar(){
        return new Cupcake();
    }
}

public interface Doce {
    void getIngredientes();
    void getModoPreparo();
}

public class Cupcake implements Doce{
    @Override
    public void getIngredientes() {
        System.out.println("Ingredientes do Cupcake: Farinha, Açúcar, Ovos, Manteiga, Fermento, Essência de Baunilha.");
    }

    @Override
    public void getModoPreparo() {
        System.out.println("Modo de Preparo do Cupcake: Misture os ingredientes secos, adicione os ovos e a manteiga, misture bem, coloque em forminhas e asse por 20 minutos a 180 graus.");
    }
}
