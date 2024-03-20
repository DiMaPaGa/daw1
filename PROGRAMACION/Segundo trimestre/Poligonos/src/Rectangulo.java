public class Rectangulo extends Poligono {

    public float base;
    public float altura;


    public Rectangulo(float base, float altura){
        vertices=4;
        this.base=base;
        this.altura=altura;


    }
    public Rectangulo(float base){
        vertices=4;
        this.base=base;
        this.altura=base;


    }




    @Override
    public float calcularArea() {
        return base*altura;
    }
}
