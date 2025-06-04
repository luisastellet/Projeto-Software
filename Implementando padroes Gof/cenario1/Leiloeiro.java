package cenario1;
import java.util.ArrayList;
import java.util.List;

// Em um determinado tipo de leilão, cada participante do leilão é identificado por uma placa contendo um número. Quando o participante levanta a placa, ele indica ao leiloeiro que aceita o lance atual. Neste momento o leiloeiro informa aos outros participantes que a proposta atual foi aceita por um dos participantes e indica qual é o novo lance. Caso você tenha que implementar um sistema para a simulação deste tipo de leilão onde os participantes não têm informação direta sobre os demais participantes, mas somente informação vinda do leiloeiro. 

// Resposta: Observer

public class Leiloeiro {
    List <Participante> lista_participantes = new ArrayList<Participante>();

    public void subscribe(Participante participante){
        lista_participantes.add(participante);
    }

    public void unsubscribe(Participante participante){
        lista_participantes.remove(participante);
    }

    public void notify(String message){
        for (Participante participante : lista_participantes){
            participante.update(message);
        }
    }

}
