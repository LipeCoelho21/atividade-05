package uniderp.poo.escola.dominio;

public class Aviao extends BaseVeiculo {
    
    private int rodas;
    private int eixos;
    private int assentos;
    private int qtdeOcupantes;
    private int qtdeMotores;
    private String rab;
    
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
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public String getRab() {
        return rab;
    }
    public void setRab(String rab) {
        this.rab = rab;
    }
    
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, int eixos, int assentos, int qtdeOcupantes,
            int qtdeMotores, String rab) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.rodas = rodas;
        this.eixos = eixos;
        this.assentos = assentos;
        this.qtdeOcupantes = qtdeOcupantes;
        this.qtdeMotores = qtdeMotores;
        this.rab = rab;
    }
}


