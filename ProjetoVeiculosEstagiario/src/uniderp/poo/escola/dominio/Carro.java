package uniderp.poo.escola.dominio;

public class Carro extends BaseVeiculo {
    
    private int portas;
    private int assentos;
    private String codigoRenavam;
    
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    
    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int portas, int assentos, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);

        this.portas = portas;
        this.assentos = assentos;
        this.codigoRenavam = codigoRenavam;
    }
}
