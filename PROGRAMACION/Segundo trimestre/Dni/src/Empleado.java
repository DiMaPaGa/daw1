public class Empleado {
    private String nombre;
    private String apellido;

    private Nif nif;
    private float sueldoBase;
    private int horasExtras;

    private boolean estaCasado;

    private int hijos;

    private static float importeHora;

    public Empleado(){//porque en el indicador dice que se podrán crear por defecto
        this.nombre="Miguel";
        this.apellido="Sánchez";
        this.nif=new Nif (14635273);
        this.estaCasado=false;
        this.sueldoBase=1;
        this.horasExtras=0;


    }
    public Empleado(Nif nif){
        this();
        this.nif= nif;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre!=null && nombre.length()>0)
        {this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido!=null && apellido.length()>0){
        this.apellido = apellido;}
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        if (nif!=null && String.valueOf(nif).length()==8)
        {this.nif = nif;}
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        if (sueldoBase!=0){
        this.sueldoBase = sueldoBase;}

    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        if (horasExtras>=0){
        this.horasExtras = horasExtras;}
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        if (hijos>=0){
        this.hijos = hijos;}
    }

    public static float getImporteHora() {
        return importeHora;
    }

    public static void setImporteHora(float importeHora) {
        Empleado.importeHora = importeHora;
    }

    public float calcularSueldoBruto(){

       return this.sueldoBase+(this.horasExtras*Empleado.importeHora);
    }

    @Override
    public String toString() {


        return nif +" "+ nombre+" "+apellido+"\n"+"Sueldo base: "+sueldoBase+"\nHoras extras: "+horasExtras+"\nCasado: "+estaCasado+"\nNumero de hijos: "+hijos;

    }
}
