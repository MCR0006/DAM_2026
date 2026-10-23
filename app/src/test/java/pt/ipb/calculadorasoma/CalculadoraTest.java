package pt.ipb.calculadorasoma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    @Test public void somaNumerosDecimais() {
        assertEquals(3.75, Calculadora.somar("2.5", "1.25"), 0.0001);
    }
    @Test public void aceitaVirgulaDecimal() {
        assertEquals(3.75, Calculadora.somar("2,5", "1,25"), 0.0001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void rejeitaCampoVazio() { Calculadora.somar("", "2"); }
    @Test(expected = IllegalArgumentException.class)
    public void rejeitaTextoNaoNumerico() { Calculadora.somar("abc", "2"); }
}
