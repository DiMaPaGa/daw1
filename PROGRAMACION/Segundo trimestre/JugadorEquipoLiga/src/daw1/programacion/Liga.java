package daw1.programacion;

import java.util.Arrays;

public class Liga {

    private Equipo[] equipos;
    private String nacionalidad;
    private int anyo;

    private Liga(){
        Equipo[] equipos=null;
    }

    public Liga(String nacionalidad, int anyo){
        this();
        this.nacionalidad=nacionalidad;
        this.anyo=anyo;

    }

    public Equipo[] getEquipo() {
        return equipos;
    }

    public void setEquipo(Equipo[] equipo) {
        this.equipos = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "equipo=" + Arrays.toString(equipos) +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", anyo=" + anyo +
                '}';
    }

    public void imprimirClasificacion(){

        Arrays.sort(equipos);
        for (Equipo elemento:equipos) {
            System.out.println(elemento.getNombreEquipo()+" "+elemento.getPuntuacion());

        }
    }


    public boolean participa(Equipo equipo){
        boolean participa=false;
        for (int i = 0; i < equipos.length; i++) {
            if (equipo.equals(equipos[i])){
                participa=true;
            }
        }
        return participa;
    }

    public boolean anadirEquipo(Equipo equipo){
        boolean add=false;
        if(equipos==null){
            equipos=new Equipo[1];
            equipos[0]=equipo;
            add=true;
        } else {
            boolean posicion = this.participa(equipo);
            if (posicion) {
                System.out.println("El equipo indicado ya se encuentra en la liga");
            } else {
                Equipo[] antiguaLista = equipos;
                equipos = new Equipo[antiguaLista.length + 1];
                for (int i = 0; i < equipos.length; i++) {
                    if (i == equipos.length - 1) {
                        equipos[i] = equipo;
                        add= true;
                    } else {
                        equipos[i] = antiguaLista[i];
                    }

                }
            }
        }
        return add;
    }


}
