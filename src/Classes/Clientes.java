package Classes;

import java.util.Date;

public class Clientes {
    
    int ID_Cliente;
    String nome;
    Date data_Nasc;
    long CPF;
    String email;
    long fone;
    int ativo;

    public Clientes() {
    }

    public Clientes(int ID_Cliente, String nome, Date data_Nasc, long CPF, String email, long fone, int ativo) {
        this.ID_Cliente = ID_Cliente;
        this.nome = nome;
        this.data_Nasc = data_Nasc;
        this.CPF = CPF;
        this.email = email;
        this.fone = fone;
        this.ativo = ativo;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(Date data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getFone() {
        return fone;
    }

    public void setFone(long fone) {
        this.fone = fone;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
