public abstract class Pluricelular extends SerVivo {

        protected int celulas;

    public Pluricelular(float alto, float ancho, float largo,int celulas) {
        super(alto, ancho, largo);
        setCelulas(celulas);

    }

    public int getCelulas() {
        return celulas;
    }

    public void setCelulas(int celulas) {
        if (celulas>0) {
            this.celulas = celulas;
        }
    }
}
