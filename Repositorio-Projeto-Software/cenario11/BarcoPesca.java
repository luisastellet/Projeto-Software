package cenario11;

// Um capitão inexperiente está tentando sobreviver em alto-mar. Ele sabe apenas como operar barcos a remo — puxando os remos com força para se mover. No entanto, ele não tem nenhuma experiência com barcos a vela e não sabe como fazer um deles se mover.
// Certo dia, ao avistar piratas se aproximando, o capitão precisa escapar rapidamente. O problema? O único barco disponível naquele momento é um barco de pesca movido à vela. Se tentar usá-lo do jeito que está, o capitão não conseguirá se mover.
// Para escapar a tempo, alguém propõe uma solução engenhosa: adaptar o barco de pesca para que ele possa ser usado como se fosse um barco a remo — ou seja, sem precisar que o capitão aprenda uma nova forma de navegação.
// Nesse contexto, o desafio é fazer com que um objeto com uma interface incompatível (o barco de pesca) possa ser utilizado como se fosse outro tipo (um barco a remo), permitindo que o capitão continue usando o que já sabe, mesmo operando uma embarcação diferente.

// Adapter 

public interface BarcoRemo {
    void operarBarco();
}

public class BarcoPesca {
    public void operarBarcoPesca(){
        System.out.println("Operando um barco a Pesca.");
    }
}

public class AdapterBarcoPesca implements BarcoRemo{
    private BarcoPesca barcoPesca;

    public AdapterBarcoPesca(BarcoPesca barcoPesca){
        this.barcoPesca = barcoPesca;
    }

    @Override
    public void operarBarco(){
        barcoPesca.operarBarcoPesca();
    }
}
