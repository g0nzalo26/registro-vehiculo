package models;

public class Vehiculo {
private String patente;
private String marca; 
private String modelo;
private int anio;
private String combustible;

    public Vehiculo(String patente, String marca, String modelo, int anio, String combustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String infoVehiculo(){
    return "*** Info Vehiculo *** \n"
           +"\t Patente: "+this.getPatente()+"\n"
           +"\t Marca: "+this.getMarca()+"\n"
           +"\t Modelo: "+this.getModelo()+"\n"
           +"\t Año: "+this.getAnio()+"\n"
           +"\t Combustible: "+this.getCombustible()+"\n"
           +"*** Fin Info Vehiculo ***";
            
    }



}
