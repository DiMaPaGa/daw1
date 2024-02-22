public class Contador {
    private int cont;

    public Contador(){
    this.cont=0;

    }

    public Contador(int cont){
        this();
        setCont(cont);

    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont>0) {
            this.cont = cont;
        }
    }

    public void incrementar (){
        this.cont++;
    }

    public void decrementar (){
        this.cont--;
        if (this.cont<0){
            this.cont=0;
        }
    }


}

