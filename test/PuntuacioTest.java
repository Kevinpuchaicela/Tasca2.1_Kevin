package test;

import com.jaume.penjat.Puntuacio;
import com.jaume.penjat.Tauler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PuntuacioTest {
    private Puntuacio puntuacio;
    private Tauler tauler;

    @BeforeEach
    void reiniciar() {
        this.puntuacio = new Puntuacio();
        this.tauler = new Tauler();
        this.tauler.inicialitzarPartida("dinosaurio", 3);
    }

    @Test
    void verificarParaulaSecretaDificultat1() {
        String[] paraules1 = {"cargol", "porc", "aranya", "patates", "farina", "nabiu", "elefant"};
        String paraulaSecreta = this.puntuacio.getParaulaSecretaDificultat(1);
        String paraulaEsperada = "";
        for (String str : paraules1) {
            if (str.equals(paraulaSecreta)) {
                paraulaEsperada = str;
            }
        }
        assertEquals(paraulaEsperada, paraulaSecreta, "Error en método getParaulaSecretaDificultat()");
    }

    @Test
    void verificarParaulaSecretaDificultat2() {
        String[] paraules2 = {"periquito", "peix espasa", "nectarina", "peix daurat", "xinxilla", "armadillo", "llenties"};
        String paraulaSecreta = this.puntuacio.getParaulaSecretaDificultat(2);
        String paraulaEsperada = "";
        for (String str : paraules2) {
            if (str.equals(paraulaSecreta)) {
                paraulaEsperada = str;
            }
        }
        assertEquals(paraulaEsperada, paraulaSecreta, "Error en método getParaulaSecretaDificultat()");
    }

    @Test
    void verificarParaulaSecretaDificultat3() {
        String[] paraules3 = {"escombraries", "escopinyes", "engronxador", "desnonament", "malhauradament", "malbaratament",};
        String paraulaSecreta = this.puntuacio.getParaulaSecretaDificultat(3);
        String paraulaEsperada = "";
        for (String str : paraules3) {
            if (str.equals(paraulaSecreta)) {
                paraulaEsperada = str;
            }
        }
        assertEquals(paraulaEsperada, paraulaSecreta, "Error en método getParaulaSecretaDificultat()");
    }

    @Test
    void verificarCalcularPuntuacio() {
        String[] palabra = new String[]{"p", "e", "r", "i", "q", "u", "i", "t", "o"};
        float p = puntuacio.calcularPuntuacio(palabra, 2);
        assertEquals(0.0, p, "Error en calcular la puntuación");


    }

    @Test
    void verificarGetIntents() {
        this.puntuacio.getParaulaSecretaDificultat(3);
        assertEquals(3, this.puntuacio.getIntents(), "Error en obtener los intentos.");
    }

    @Test
    void verificarGetTemps() {
        String[] palabra = new String[]{"p", "e", "r", "i", "q", "u", "i", "t", "o"};
        float p = puntuacio.calcularPuntuacio(palabra, 2);
        //El tiempo varia por lo que no se como hacer que el tiempo para el test sea estico o otra forma de hacerlo.
        assertEquals(1, this.puntuacio.getTemps(), "Error en obtener el tiempo.");
    }


}
