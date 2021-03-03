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
        String[] paraules3 = {"escombraries", "escopinyes", "engronxador", "desnonament", "malhauradament", "malbaratament",};
        String paraulaSecreta = this.puntuacio.getParaulaSecretaDificultat(3);
        String[] paraulaEsperada = new String[paraulaSecreta.length()];

        for (int i = 0; i < paraulaEsperada.length; i++) {
            paraulaEsperada[i] = Character.toString(paraulaSecreta.charAt(i));
        }
        // posiblemente cambie el puntuaje debido a que he podido controlar el tiempo dinamico. Seria de volver a iniciar este test.
        float p = puntuacio.calcularPuntuacio(paraulaEsperada, 2);
        assertEquals(610, p, "Error en calcular la puntuación");


    }


}
