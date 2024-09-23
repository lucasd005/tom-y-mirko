package aed;

class Funciones {
    int cuadrado(int x) {
        int res;
        res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res;{
            res = x * x + y * y;

        return Math.sqrt(res);
    }}

    boolean esPar(int n) {
        if ((n % 2) == 0)
        return true;
        else
             return false ;
    }

    boolean esBisiesto(int n) {
        if ((n % 4 == 0) &&(n % 100 != 0 || n % 400 == 0))
            return true;
        else 
            return  false;
    }

    int factorialIterativo(int n) {
        int i = n;
        int res = 1;
        while (i!=0){
            res *=i;
            i -= 1;
        }

        return res ;
    }

    int factorialRecursivo(int n) {
        int res = 1;
        if (n == 0){
            return 1; 
        }
        else 
            return n * factorialRecursivo(n-1);
    }

    boolean esPrimo(int n) {
        int i = 2;
        if (n == 0 || n == 1)
            return false;
        while(i < n)
            if(n % i == 0){
                return false;
            }
            else
                i += 1;
        return true ;
    }

    int sumatoria(int[] numeros) {
        int i = 0;
        int longitud = numeros.length;
        int res = 0;
        if (longitud == 0)
            return 0;
        while (longitud-1 >= 0){
            res += numeros [longitud-1];
            longitud -=1 ;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int i = 0;
        int longitud = numeros.length;
        int res = 0;
        while (i< longitud)
            if (numeros[i] == buscado)
                return i;
            else 
                i+=1;
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        int longitud = numeros.length -1 ;
        if (longitud == -1)
            return false;
        while (longitud >= 0){
            if (esPrimo(numeros [longitud]) == true)
                return  true;
            else
                longitud -= 1;
        }

        return false;
    }

    boolean todosPares(int[] numeros) {
        int longitud = numeros.length -1 ;
        if (longitud == -1)
            return  false;
        while (longitud >= 0){
            if (esPar(numeros [longitud]) == false)
                return  false;
            else
                longitud -= 1;
        }

        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        int i = 0;
        int p1 = s1.length();
        int p2 = s2.length();
        if (p1 > p2)
            return false;
        else{
            while( i < p1 )
                if(s1.charAt(i) == s2.charAt(i))
                    i += 1;
                else
                    return false;
        } 

        return true;
    }

    boolean esSufijo(String s1, String s2) {
        int i = s1.length()-1;
        int j = s2.length()-1;
        int p1 = s1.length();
        int p2 = s2.length();
        if (p1 > p2)
            return false;
        else{    
            while(i >= 0){
                if(s1.charAt(i) == s2.charAt(j)){
                    i -= 1;
                    j -= 1;}
                else
                    return false; }

        return true;
        }
    }
}

