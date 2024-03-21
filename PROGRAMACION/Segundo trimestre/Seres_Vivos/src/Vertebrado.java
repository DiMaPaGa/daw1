public abstract class Vertebrado extends Animal{

    protected int vertebras;


    public Vertebrado(float alto, float ancho, float largo, int celulas, int vertebras) {
        super(alto, ancho, largo, celulas);
        setVertebras(vertebras);
    }

    public int getVertebras() {
        return vertebras;
    }

    public void setVertebras(int vertebras) {
        if (vertebras>0) {
            this.vertebras = vertebras;
        }
    }
}
