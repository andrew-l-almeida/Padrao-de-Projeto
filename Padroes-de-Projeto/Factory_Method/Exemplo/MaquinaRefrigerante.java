package Factory_Method.Exemplo;

public class MaquinaRefrigerante extends MaquinaBebida {
    public Bebida entregaBebiba() {
      return new Refrigerante();
    }
  }