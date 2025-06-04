package cenario8;

// Em um sistema bancário, existe um componente responsável por gerenciar as conexões com o banco de dados. Para evitar problemas como conflitos e desperdício de recursos, é necessário garantir que apenas uma única instância desse gerenciador de conexão exista durante toda a execução do sistema. Essa instância única será usada por todos os módulos que precisarem acessar o banco de dados, garantindo controle centralizado e consistente das conexões. Considerando esse cenário, qual padrão de projeto seria mais indicado para garantir que apenas uma instância desse componente seja criada? 

//Singleton

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
}
