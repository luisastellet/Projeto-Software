package cenario4;

// A confeitaria agora está experimentando novas maneiras de preparar bolos para atender a diferentes demandas de clientes. Os clientes têm requisitado bolos que se adequem a diversas ocasiões e preferências, desde texturas mais densas até mais leves e aéreas. Para atender a essa demanda, a confeitaria quer implementar diferentes técnicas de preparação que possam ser selecionadas e aplicadas conforme a necessidade. Por exemplo, para um bolo que necessite de uma textura mais densa, uma técnica específica de batimento e ingredientes pode ser empregada. Por outro lado, para um bolo mais leve e fofo, uma técnica completamente diferente de incorporação de ar e ingredientes específicos pode ser a escolha ideal. A confeitaria busca uma solução que permita selecionar e aplicar essas diferentes técnicas de preparação sem ter que reescrever ou modificar o processo geral de fazer um bolo.

// Resposta: Strategy


public class BoloLeve implements Bolo{
    
    @Override 
    public void baterBolo(){
        System.out.println("Batendo um bolo leve");
    }
}
