import uniderp.poo.escola.dominio.BaseVeiculo;
import uniderp.poo.escola.dominio.Caminhao;

public class App {
    public static void main(String[] args) {
        
        BaseVeiculo caminhao1 = new Caminhao (1, "sapão", "Mercedes Benz AMG 608", "vermelho", "chassi123", 
        "ABC1D234", 2005, 2004, "Mercedes", "640cv", "Diesel", "João", "MS", 
        "Campo Grande", "caminhão de carga", 16, 4, 5.500, 7.000, "renavam123");
   
        String nome = caminhao1.getNome();
        System.out.println("Nome: " + nome);
    }

}
