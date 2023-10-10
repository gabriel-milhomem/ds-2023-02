import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EnderecoTest {
  @Test
  public void testEnderecoBuilder() {
    Endereco endereco = Endereco.builder()
      .rua("Rua A")
      .setor("Setor 1")
      .cep("12345-678")
      .numero("42")
      .cidade("Cidade X")
      .estado("Estado Y")
      .bloco("Bloco Z")
      .quadra("Quadra 10")
      .build();

    assertEquals("Rua A", endereco.getRua());
    assertEquals("Setor 1", endereco.getSetor());
    assertEquals("12345-678", endereco.getCep());
    assertEquals("42", endereco.getNumero());
    assertEquals("Cidade X", endereco.getCidade());
    assertEquals("Estado Y", endereco.getEstado());
    assertEquals("Bloco Z", endereco.getBloco());
    assertEquals("Quadra 10", endereco.getQuadra());
  }

  @Test
  public void testEnderecoBuilderTresAtributos() {
    Endereco endereco = Endereco.builder()
      .rua("Rua A")
      .setor("Setor 1")
      .cep("12345-678")
      .build();

    assertEquals("Rua A", endereco.getRua());
    assertEquals("Setor 1", endereco.getSetor());
    assertEquals("12345-678", endereco.getCep());
    assertEquals(null, endereco.getNumero());
    assertEquals(null, endereco.getCidade());
    assertEquals(null, endereco.getEstado());
    assertEquals(null, endereco.getBloco());
    assertEquals(null, endereco.getQuadra());
  }
}