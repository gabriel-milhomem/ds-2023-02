import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class NewtonTest {
  @Test
  public void testeCalcularRaizQuadrada() {
    double numero = 488;
    double erro = 1e-2;
    double esperado = 22.09;

    double resultado = Newton.calcularRaizQuadrada(numero, erro);

    assertEquals(resultado, esperado, erro);
  }

  @Test
  public void testeCalcularRaizComQuadradoPerfeito() {
    double numero = 256.0;
    double erro = 1e-4;
    double esperado = 16.0;

    double resultado = Newton.calcularRaizQuadrada(numero, erro);

    assertEquals(resultado, esperado, erro);
  }

  @Test
  public void testeNumeroNegativo() {
    double numero = -4.0;
    double erro = 1e-4;

    assertThrows(IllegalArgumentException.class, () -> {
        Newton.calcularRaizQuadrada(numero, erro);
    });
  }
}
