package cenario1;

// Em um determinado tipo de leilão, cada participante do leilão é identificado por uma placa contendo um número. Quando o participante levanta a placa, ele indica ao leiloeiro que aceita o lance atual. Neste momento o leiloeiro informa aos outros participantes que a proposta atual foi aceita por um dos participantes e indica qual é o novo lance. Caso você tenha que implementar um sistema para a simulação deste tipo de leilão onde os participantes não têm informação direta sobre os demais participantes, mas somente informação vinda do leiloeiro. 

// Resposta: Observer

public class Participante {
    
    public void update(String message){
        System.out.println(message);
    }
}
