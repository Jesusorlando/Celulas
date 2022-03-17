public class productos{

    
    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calorias;
    public double peso;

    public productos(double calorias, double peso) {
        this.calorias = calorias;
        this.peso = peso;
    }


}
