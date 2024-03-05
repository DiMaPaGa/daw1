public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String apellido;

    private Nif nif;
    private float sueldoBase;
    private int horasExtras;

    private boolean estaCasado;

    private int hijos;

    private static float importeHora;

    private Empleado(){//porque en el indicador dice que se podrán crear por defecto
        this.nombre="";
        this.apellido="";
        this.nif=new Nif(30229753);
        this.estaCasado=false;
        this.sueldoBase=1196;
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
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
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
        this.hijos = hijos;
    }

    public static float getImporteHora() {
        return importeHora;
    }

    public static void setImporteHora(float importeHora) {
        Empleado.importeHora = importeHora;
    }

    public float calcularSueldoBruto(){
        float sueldoBruto= this.sueldoBase+(this.horasExtras*importeHora);
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return nif +" "+ nombre+" "+apellido+"\n"+"Sueldo base: "+sueldoBase+"\nHoras extras: "+horasExtras+"\nCasado: "+estaCasado+"\nNumero de hijos: "+hijos;

    }

    @Override
    public int compareTo(Empleado otroEmpleado) {
        return (int) (otroEmpleado.calcularSueldoBruto()-this.calcularSueldoBruto());
    }
}
