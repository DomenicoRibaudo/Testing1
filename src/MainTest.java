import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testSommaConParametriNonNull() {
        // Configurazione del test con parametri non nulli
        Integer a = 3;
        Integer b = 5;

        // Esecuzione del metodo e verifica del risultato
        int risultato = Main.eseguiSomma(a, b);
        assertEquals(8, risultato);
    }

    @Test()
    public void testSommaConUnParametroNull() {
        // Configurazione del test con uno dei parametri nulli
        Integer a = 3;
        Integer b = null;

        // Esecuzione del metodo dovrebbe generare una NullPointerException
        Main.eseguiSomma(a, b);
    }
}