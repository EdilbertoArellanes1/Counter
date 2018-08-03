package com.juangabrielgomila.counter; /** Se define el paquete donde estara la clase */

import org.junit.Test; /** Se importa la clase  */

import static org.junit.Assert.*; /** se importa la clase */

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {  /**  Se inicia la instancia de la clase que sirve de prueba */
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}