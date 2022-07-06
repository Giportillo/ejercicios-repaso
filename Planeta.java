package ar.com.ada.oop.domain;

public class Planeta {

    private static final int UA = 149597870;
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMedia;
    private String tipoPlaneta;
    private boolean esObserbable;

    public Planeta() {

    }

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMedia, String tipoPlaneta, boolean esObserbable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMedia = distanciaMedia;
        this.tipoPlaneta = tipoPlaneta;
        this.esObserbable = esObserbable;

    }

    public double calcularDensidad(){
        return masa/volumen;
    }
    public boolean esExterior(){
        boolean esExterior = false;
        double uaPlaneta = distanciaMedia / UA;
        if (uaPlaneta > 3.4){
            esExterior = true;
        }
        return esExterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(int distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public String getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta(String tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }

    public boolean isEsObserbable() {
        return esObserbable;
    }

    public void setEsObserbable(boolean esObserbable) {
        this.esObserbable = esObserbable;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaMedia=" + distanciaMedia +
                ", tipoPlaneta='" + tipoPlaneta + '\'' +
                ", esObserbable=" + esObserbable +
                '}';
    }
}
