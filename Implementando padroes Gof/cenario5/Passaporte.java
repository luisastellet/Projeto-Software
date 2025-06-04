package cenario5;

// Em um sistema de emissão de passaportes, cada cidadão de um país pode possuir apenas um passaporte válido por vez. O órgão responsável garante que não sejam emitidos passaportes duplicados para a mesma pessoa. Sempre que um cidadão precisa viajar, ele deve utilizar esse único passaporte, que serve como um identificador exclusivo e oficialmente reconhecido. Esse controle centralizado e a garantia de que exista apenas uma instância válida de passaporte por cidadão são essenciais para a organização e segurança do sistema. Considerando esse cenário, qual padrão de projeto seria mais adequado para garantir esse comportamento no sistema? 

// Singleton

public class Passaporte {
    private static Passaporte instance;
    private String cpf;

    private Passaporte(String cpf){
        this.cpf = cpf;
    }

    public static Passaporte getInstance(String cpf){
        if(instance == null){
            instance = new Passaporte(cpf);
        }
        return instance;
    }
}
