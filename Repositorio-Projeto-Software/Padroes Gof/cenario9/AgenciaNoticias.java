package cenario9;
import java.util.List;

// Considere um sistema de uma agência de notícias que publica artigos e informações em tempo real. Diversos veículos de comunicação — como sites, emissoras de TV e jornais — estão inscritos para receber atualizações sempre que uma nova notícia é publicada. Assim que a agência disponibiliza uma nova matéria, todos os veículos inscritos são automaticamente notificados e podem atualizar suas plataformas com o conteúdo mais recente. A agência não precisa conhecer os detalhes de como cada veículo realiza suas atualizações; ela apenas envia a notificação para todos os interessados. Esse modelo garante que todos os assinantes recebam as informações mais recentes de forma eficiente, além de permitir maior flexibilidade e modularidade no sistema. Com base nesse cenário, qual padrão de projeto seria mais adequado? Justifique sua escolha e, se possível, represente sua solução com um diagrama de classes ou um exemplo de código.

// Observer

public class AgenciaNoticias {
    private List<VeiculoComunicacao> lista = new ArrayList<>();

    public void inscrever(VeiculoComunicacao veiculocomunicacao){
        lista.add(veiculocomunicacao);
    }

    public void desinscrever(VeiculoComunicacao veiculocomunicacao){
        lista.remove(veiculocomunicacao);
    }

    public void notify(String message){
        for (VeiculoComunicacao veiculo : lista){
            veiculo.update(message);
        }
    }
}

public interface VeiculoComunicacao {
    void update(String message);
}

public class Site implements VeiculoComunicacao{

    public void update(String message){
        System.out.println("Noticia do site:" + message);
    }
}

public class EmissoraTV implements VeiculoComunicacao{

    public void update(String message){
        System.out.println("Noticia da emissora de TV:" + message);
    }
}