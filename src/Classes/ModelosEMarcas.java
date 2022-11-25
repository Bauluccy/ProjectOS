package Classes;

public class ModelosEMarcas {
    
    int ID_Modelo;
    String marca;
    String modelo;
    int ativo;

    public ModelosEMarcas() {
    }

    public ModelosEMarcas(int ID_Modelo, String marca, String modelo, int ativo) {
        this.ID_Modelo = ID_Modelo;
        this.marca = marca;
        this.modelo = modelo;
        this.ativo = ativo;
    }

    public int getID_Modelo() {
        return ID_Modelo;
    }

    public void setID_Modelo(int ID_Modelo) {
        this.ID_Modelo = ID_Modelo;
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

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
    
    
}
