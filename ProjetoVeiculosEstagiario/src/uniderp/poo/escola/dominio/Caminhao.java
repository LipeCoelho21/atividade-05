package uniderp.poo.escola.dominio;

public class Caminhao extends BaseVeiculo {
    
    private int rodas;
    private int eixos;
    private double pesoLiquido;
    private double pesoTotal;
    private String codigoRenavam;
    
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    
    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, int eixos, double pesoLiquido,
            double pesoTotal, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.rodas = rodas;
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.codigoRenavam = codigoRenavam;
    }
}
