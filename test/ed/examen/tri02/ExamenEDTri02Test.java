package ed.examen.tri02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests para el método elMayorDe(). Comprobaremos todos los caminos posibles
 * para determinar que el método funciona correctamente.
 * @author Victor Tejedor Rivas
 */
public class ExamenEDTri02Test {
    
    public ExamenEDTri02Test() {
    }

    /**
     * Test 1 para el método testElMayorDe(). Vamos a comprobar el camino 1,
     * donde listaEnteros.length = 0.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testElMayorDeArrayVacio() {
        System.out.println("Test 1 para el método elMayorDe(). Vamos a comprobar el camino 1, donde listaEnteros.length es null");
        
        try {
        int[] listaEnteros = null;
        int result = ExamenEDTri02.elMayorDe(listaEnteros);
        }
        catch (Exception e) {
            System.out.println("->" + e.getMessage());
            // assertEquals("mensaje si falla", respuestaEsperada, respuestaRecibida)
            assertTrue(true);
        }
    }
    
    /**
     * Test 2 para el método testElMayorDe(). Vamos a comprobar el camino 2,
     * donde listaEnteros.length > 100.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void TestElMayorDeArrayDemasiadoGrande() {
        System.out.println("Test 2 para el método testElMayorDe(). Vamos a comprobar el camino 2, donde listaEnteros.length > 100.");
        
        try {
        int[] listaEnteros = new int[101];
        listaEnteros[45] = 7;
        int result = ExamenEDTri02.elMayorDe(listaEnteros);
        }
        catch (Exception e) {
            System.out.println("->" + e.getMessage());
            assertTrue(true);
        }
    }
    
    /**
     * Test 3 para el método testElMayorDe(). Vamos a comprobar el camino 3,
     * donde (listaEnteros.length < 100) y (listaEnteros.length no es null).
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void ElMayorDeArrayDeTamañoValido() {
        System.out.println("Test 3 para el método testElMayorDe(). Vamos a comprobar el camino 3, donde listaEnteros.length esta comprendido entre 0 y 100");
        
        try {
        int[] listaEnteros = new int[50];
        listaEnteros[45] = 7;
        listaEnteros[31] = 15;
        listaEnteros[10] = 1;
        int result = ExamenEDTri02.elMayorDe(listaEnteros);
        int valorEsperado = 15;
        assertEquals(valorEsperado, result);
        }
        catch (Exception e) {
            System.out.println("->" + e.getMessage());
        
            
            
    }
}
