public abstract class SerVivo {

    protected float alto;
    protected float ancho;
    protected float largo;

    public SerVivo(float alto, float ancho, float largo){
        this.alto= alto;
        this.ancho= ancho;
        this.largo=largo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        if (alto>0) {
            this.alto = alto;
        }
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        if (ancho>0) {
            this.ancho = ancho;
        }
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        if (largo>0) {
            this.largo = largo;
        }
    }

    public void interactuar(){
        System.out.println("Está interactuando");
    }

    public void nutrirse(){
        System.out.println("Está comiendo");
    }

    public void reproducirse(){
        System.out.println("Acaba de tener un hijo");
    }

}
