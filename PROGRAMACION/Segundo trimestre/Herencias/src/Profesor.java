import java.util.Objects;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor(String n, int e, String a){
        super(n,e);
        asignatura=a;
    }

    @Override
    public String toString() {
        return super.toString() +
                " asignatura='" + asignatura;
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(asignatura, profesor.asignatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asignatura);
    }
}
