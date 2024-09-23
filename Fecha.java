package aed;

public class Fecha {
    private int _dia;
    private int _mes;

    public Fecha(int dia, int mes) {
        _dia = dia;
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        _dia = fecha.dia();
        _mes = fecha.mes();
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        return _dia + "/" + _mes;
    }

    @Override
    public boolean equals(Object otra) {
        boolean otraEsNull = (otra == null);
        boolean claseDistinta = otra.getClass() != this.getClass();
        if (otraEsNull || claseDistinta){
        return false;
    }
    Fecha otraFecha = (Fecha) otra;
    return _dia == otraFecha.dia() && _mes == otraFecha.mes();
    }

    public void incrementarDia() {
        if (_dia == diasEnMes(_mes))
        {
            _mes +=1;
            _dia = 1;
        }
        else
        _dia += 1;
            if ( _mes == 13)
                _mes = 1;
    }
    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
