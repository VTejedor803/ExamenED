package ed.examen.tri02;

//Enlace gitHub: https://github.com/VTejedor803/ExamenED

/**
 * Una clase para determinar el valor máximo de un array de enteros
 * @author Victor Tejedor Rivas
 */
public class ExamenEDTri02
{
    /**
     * El tamaño máximo del array permitido por el método
     */
    public static int TAMAÑOMAXIMO = 100;

    /** 
     * Crea una fecha a partir del día, mes y año.
     * @param listaEnteros Un array de enteros 
     * @return devuelve el mayor valor de un array de enteros.
     */
    public static int elMayorDe (int[] listaEnteros) throws Exception {
        if (listaEnteros == null) {
            throw new Exception ("Lista de números vacía, no se puede calcular el máximo");
        }
        if (listaEnteros.length > TAMAÑOMAXIMO) {

        throw new Exception ("Lista de números demasido grande, no se puede calcular el máximo");
        }

        int mayor = listaEnteros[0];

        for (int i = 1; i< listaEnteros.length; i++) {

            if (mayor < listaEnteros[i]) {
            mayor = listaEnteros[i];
            }

        }
        return mayor;
        }
}
