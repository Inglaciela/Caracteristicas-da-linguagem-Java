package one.innovation.digital.caracteristicasdalinguagem.interfaces;

public class Veiculo {

    public interface Veiculo {

        String registro();
    
        default void ligar() {
    
            System.out.println("Ligando o veículo!");
        }
    
        //void desligar();
    
        /*default void desligar() {
            System.out.println("Desligando o veículo!");
        }*/
    }