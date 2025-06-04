package cenario10;

// Um troll vive nas colinas próximas. Em geral, ele ataca com as próprias mãos e é relativamente fácil de enfrentar. No entanto, em certas ocasiões, esse mesmo troll aparece empunhando um porrete, tornando-se muito mais perigoso. Ainda assim, trata-se do mesmo troll — ele não se transforma em outro tipo de criatura, apenas ganha uma nova habilidade temporária.
// Esse comportamento pode se repetir com outras melhorias: o troll pode usar armaduras, escudos ou até mesmo encantamentos. O que todos esses casos têm em comum é que não é necessário criar um novo troll para cada variação. Em vez disso, o comportamento do troll é modificado dinamicamente, ganhando novas capacidades sem alterar sua essência.
// Se você fosse desenvolver um sistema para simular esse comportamento de forma flexível — permitindo que o mesmo troll ganhe ou perca habilidades de forma dinâmica, sem criar novas subclasses para cada variação —, qual padrão de projeto seria o mais adequado? 

//"o comportamento do troll é modificado dinamicamente, ganhando novas capacidades sem alterar sua essência."

// Decorator


public interface Troll {
    String atacar();
}

public class TrollBasico implements Troll {

    @Override
    public String atacar(){
        return "Ataca com as prórias mãos";
    }
}

public class TrollDecorator implements Troll {
    private Troll umTroll;

    public TrollDecorator(Troll umTroll){
        this.umTroll = umTroll;
    }

    @Override
    public String atacar(){
        return umTroll.atacar();
    }
}

public class Porrete extends TrollDecorator {

    public Porrete(Troll umTroll){
        super(umTroll);
    }

    @Override
    public String atacar(){
        return super.atacar() + " e com um Porrete.";
    }
}
