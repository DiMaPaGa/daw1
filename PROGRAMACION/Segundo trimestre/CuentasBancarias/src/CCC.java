import java.util.concurrent.ThreadLocalRandom;

public class CCC {

    //atributos=propiedades

    private double saldoDeCuenta;

    private String nombreDelTitular;

    private long numeroDeCuenta;




    //constructores


    public CCC(){ //quitaría lo de dentro

    }
    public CCC (String nombreDelTitular, double saldoDeCuenta){
        //this();
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta= ThreadLocalRandom.current().nextLong(10000000000000000L,99999999999999999L+1L);
            //(long)(Math.random()+9_999_999 + 999_999 + 1);

    }

    public double getSaldoDeCuenta() {

        return saldoDeCuenta;
    }

    public String getDatosGenerales() {
        return "CCC{" +
                "saldoDeCuenta=" + this.saldoDeCuenta +
                ", nombreDelTitular='" + this.nombreDelTitular + '\'' +
                ", numeroDeCuenta=" + this.numeroDeCuenta +
                '}';
    }

    public void setIngresos(float ingresos) {

        this.saldoDeCuenta += ingresos;
    }

    public void setReintegros(float reintegros) {
        if (this.saldoDeCuenta>reintegros){
        this.saldoDeCuenta -= reintegros;
        }else {
            System.out.println("No tiene saldo suficiente para realizar la operación");
        }
    }

    public void realizarTrasferenciasEntreCuentas (float reintegros, CCC cuentaReceptora){

        this.setReintegros(reintegros);
        cuentaReceptora.setIngresos(reintegros);

    }




}
