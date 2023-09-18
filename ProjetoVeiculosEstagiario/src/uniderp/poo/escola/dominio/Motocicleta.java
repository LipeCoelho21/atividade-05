package uniderp.poo.escola.dominio;

public class Motocicleta extends BaseVeiculo {
    private String codigoRenavam;

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa,
            int anoModelo, int anoFabricacao, String fabricante, String potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.codigoRenavam = codigoRenavam;
    }

    
}
