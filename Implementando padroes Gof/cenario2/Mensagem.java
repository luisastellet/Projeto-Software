package cenario2;

// Em uma padaria, há vários tipos de bolos disponíveis para venda. Os clientes podem escolher bolos simples ou bolos com coberturas adicionais, como chocolate, morango, creme e assim por diante. Cada cobertura tem um custo adicional. Além disso, os clientes podem escolher adicionar uma mensagem personalizada ao bolo por uma taxa extra. O sistema deve ser flexível para permitir que novas coberturas sejam adicionadas no futuro

// Resposta: Decorator

public class Mensagem extends BoloDecorator{

    public Mensagem (Bolo bolo){
        super(bolo);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " com mensagem personalizada.";
    }

    @Override
    public double getPreco(){
        return super.getPreco() + 10.0;
    }
}