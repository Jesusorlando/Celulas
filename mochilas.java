public class mochilas {

    public int getGeneracion() {
        return generacion;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public int generacion;
    public double peso;
    public double calorias;

    public mochilas(int generacion, double peso, double calorias) {
        this.generacion = generacion;
        this.peso = peso;
        this.calorias = calorias;
    }
    

}
