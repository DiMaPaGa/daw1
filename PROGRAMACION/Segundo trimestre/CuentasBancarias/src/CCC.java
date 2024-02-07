public class CCC {

    //atributos=propiedades

    private double saldoDeCuenta;

    private String nombreDelTitular;

    private long numeroDeCuenta= (long) Math.random()*(99999999-10000000+1)+10000000;

    private double ingresos;

    private double reintegros;



    //constructorer


    public CCC(){
        this.saldoDeCuenta=0;
        this.nombreDelTitular=" ";
        this.numeroDeCuenta=0;
    }
    public CCC (String nombreDelTitular, double saldoDeCuenta){
        this();
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;


    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getNombreDelTitular() {
        return nombreDelTitular;
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public void setReintegros(double reintegros) {
        this.reintegros = reintegros;
    }

    public void realizarTrasferenciasEntreCuentas (double reintegros, Object cuentaOrigen, Object cuentafinal){

        saldoDeCuentaOrigen(cuentaOrigen);
        saldoDeCuentaFinal(cuentafinal);

    }

    private double saldoDeCuentaOrigen(Object cuentaOrigen) {

        this.saldoDeCuenta-=reintegros;

        return saldoDeCuenta;
    }

    private double saldoDeCuentaFinal(Object cuentaFinal) {

        this.saldoDeCuenta+=reintegros;

        return saldoDeCuenta;
    }

    @Override
    public String toString() {
        return "CCC{" +
                "saldoDeCuenta=" + saldoDeCuenta +
                ", nombreDelTitular='" + nombreDelTitular + '\'' +
                ", numeroDeCuenta=" + numeroDeCuenta +
                ", ingresos=" + ingresos +
                ", reintegros=" + reintegros +
                '}';
    }
}
