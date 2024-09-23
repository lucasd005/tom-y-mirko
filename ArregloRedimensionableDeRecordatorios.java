package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio [] arreglo;

    public ArregloRedimensionableDeRecordatorios() {
        arreglo = new Recordatorio [0];
    }

    public int longitud() {
        return (this.arreglo).length;
    }

    public void agregarAtras(Recordatorio i) {
        this.arreglo = this.agregar(this.arreglo,i);
    }
        
    private Recordatorio [] agregar(Recordatorio [] arreglo, Recordatorio i){     
        Recordatorio [] arreglo_nuevo = new Recordatorio[arreglo.length + 1];
        for( int x = 0; x < arreglo.length; x++){
            arreglo_nuevo [x] = arreglo [x];
    }
        arreglo_nuevo [arreglo_nuevo.length - 1] = i;
        return arreglo_nuevo;
    }

    public Recordatorio obtener(int i) {
        return this.arreglo[i];
    }

    public void quitarAtras() {
        this.arreglo = this.quitar(this.arreglo);
        
    }
    private Recordatorio[] quitar(Recordatorio [] arreglo){
        Recordatorio [] arreglo_nuevo = new Recordatorio [arreglo.length -1];
        for (int x = 0; x < arreglo.length - 1; x ++){
            arreglo_nuevo [x] = arreglo[x];
        }
        return  arreglo_nuevo;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.arreglo = modifica(this.arreglo, indice, valor);
    }
    private Recordatorio [] modifica (Recordatorio [] areglo, int indice, Recordatorio valor){
        int i = 0;
        while (i < this.arreglo.length){
            if (i == indice) {
                this.arreglo [indice] = valor;
                i += 1;
            }
                else
                    i += 1;
        }
        return this.arreglo;
    }


    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        Recordatorio [] copia = new Recordatorio [vector.longitud()];
        for(int i = 0 ; i < vector.longitud(); i++ ){
            Recordatorio n = new Recordatorio(vector.obtener(i).mensaje(),vector.obtener(i).fecha(),vector.obtener(i).horario());    
            copia[i] = n;
        }
        this.arreglo = copia;
    
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios copia = new ArregloRedimensionableDeRecordatorios();
        for(int i = 0 ; i < (this.arreglo).length; i++ ){
            Recordatorio real = this.arreglo[i];
            Recordatorio copiar = new Recordatorio(real.mensaje(),real.fecha(),real.horario());
            copia.agregarAtras(real);

        }
        
        return copia;
    }
}
