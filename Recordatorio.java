package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha =  new Fecha(fecha);
        this.horario = new Horario(horario.hora(),horario.minutos());
    }

    public Horario horario() {
        return new Horario(this.horario.hora(),this.horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje + " @ " + this.fecha + " " + this.horario ;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro == null);
        boolean claseDistinta = otro.getClass() != this.getClass();
        if (otroEsNull || claseDistinta){
        return false;
        }
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return fecha.equals(otroRecordatorio.fecha) && horario.equals(otroRecordatorio.horario) && mensaje.equals(otroRecordatorio.mensaje);
       

}
}