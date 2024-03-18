public class Alumno extends Persona{

    private int curso;
    private String nivelAcademico;

    public Alumno(String n, int e, int c, String nivel){
        super(n, e);
        curso=c;
        nivelAcademico=nivel;

    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", curso=" + curso +
                ", nivelAcademico='" + nivelAcademico;
    }
}
