package aed;

public class Agenda {
    private Fecha fecha;
    private ArregloRedimensionableDeRecordatorios arreglo;

    public Agenda(Fecha fechaActual) {
        fecha = new Fecha (fechaActual);
        arreglo = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        arreglo.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String age = fecha.toString() + "\n=====\n";
        for (int i = 0; i < arreglo.longitud(); i++){
            if(arreglo.obtener(i).fecha().equals(fecha)){
                age += arreglo.obtener(i).toString() + "\n";
            }    
        }    

        return age;
    
    }

    public void incrementarDia() {
        fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        return fecha ;
    }

}