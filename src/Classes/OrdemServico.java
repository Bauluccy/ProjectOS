package Classes;

import java.util.Date;

public class OrdemServico {
    Date entrada;
    long num_OS;
    int ID_Cliente;
    String nomeCliente;
    String Equipamento;
    long numSerie;
    int ID_MMs;
    String marca;
    String modelo;
    String defeito;
    double valor;
    int ativo;

    public OrdemServico() {
    }

    public OrdemServico(Date entrada, long num_OS, int ID_Cliente, String nomeCliente, String Equipamento, long numSerie, int ID_MMs, String marca, String modelo, String defeito, double valor, int ativo) {
        this.entrada = entrada;
        this.num_OS = num_OS;
        this.ID_Cliente = ID_Cliente;
        this.nomeCliente = nomeCliente;
        this.Equipamento = Equipamento;
        this.numSerie = numSerie;
        this.ID_MMs = ID_MMs;
        this.marca = marca;
        this.modelo = modelo;
        this.defeito = defeito;
        this.valor = valor;
        this.ativo = ativo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public long getNum_OS() {
        return num_OS;
    }

    public void setNum_OS(long num_OS) {
        this.num_OS = num_OS;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEquipamento() {
        return Equipamento;
    }

    public void setEquipamento(String Equipamento) {
        this.Equipamento = Equipamento;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }

    public int getID_MMs() {
        return ID_MMs;
    }

    public void setID_MMs(int ID_MMs) {
        this.ID_MMs = ID_MMs;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
}
