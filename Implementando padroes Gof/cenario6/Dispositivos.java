package cenario6;

// Você está desenvolvendo um software que deve trabalhar com diferentes tipos de dispositivos de armazenamento, como discos rígidos, unidades USB e cartões de memória, cada um com uma interface própria. Para que o sistema possa acessar todos esses dispositivos de forma uniforme, é necessário criar um componente intermediário que "traduza" as chamadas do sistema para as interfaces específicas de cada dispositivo, permitindo assim que o software funcione corretamente independentemente do tipo de armazenamento conectado. 

// Adapter

public interface Dispositivos{
    void conectar();
}

public class AdapterUSB implements Dispositivos{
    private USB usb;

    public AdapterUSB(USB usb){
        this.usb = usb;
    }

    public void conectar(){
        usb.conectarUSB();
    }
}

public class AdapterDiscoRigido implements Dispositivos{
    private DiscoRigido discoRigido;

    public AdapterDiscoRigido(DiscoRigido discoRigido){
        this.discoRigido = discoRigido;
    }

    public void conectar(){
        discoRigido.conectarDiscoRigido();
    }
}

public class USB{
    public void conectarUSB() {
        System.out.println("Conectando dispositivo USB...");
    }
}

public class DiscoRigido{
    public void conectarDiscoRigido() {
        System.out.println("Conectando disco rígido...");
    }
}

