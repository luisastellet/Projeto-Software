package cenario7;

// Uma empresa de logística precisa realizar entregas de diferentes tipos de pacotes: padrão, expresso e de grande porte. A empresa possui um sistema central que processa as solicitações de entrega, mas que não conhece os detalhes específicos de como cada tipo de pacote deve ser tratado. Para lidar com essa situação, foi definida uma solução na qual existe uma classe central responsável por processar os pedidos de entrega, delegando a criação dos pacotes a outras classes especializadas. Cada tipo de entrega — padrão, expresso e de grande porte — possui sua própria lógica de criação e processamento, encapsulada em classes distintas. Essa abordagem permite que o sistema central trate todos os pedidos de forma genérica, sem precisar conhecer os detalhes da criação e do tratamento de cada tipo de pacote, o que garante maior flexibilidade e facilita a manutenção do sistema. 

// Fabric Method

public interface Creator {
    Pacote criar();
}

public class CreatorPadrao implements Creator {

    public Pacote criar(){
        return new PacotePadrao();
    }
}


public class CreatorExpresso implements Creator {

    public Pacote criar(){
        return new PacoteExpresso();
    }
}

public class CreatorGrandePorte implements Creator {

    public Pacote criar(){
        return new PacoteGrandePorte();
    }
}

public interface Pacote {
    void processamento();
}

public class PacotePadrao implements Pacote {
    public void processamento(){
        System.out.println("Processamento X");
    }
}
 
public class PacoteExpresso implements Pacote {
    public void processamento(){
        System.out.println("Processamento Y");
    }
}

public class PacoteGrandePorte implements Pacote {
    public void processamento(){
        System.out.println("Processamento Z");
    }
}