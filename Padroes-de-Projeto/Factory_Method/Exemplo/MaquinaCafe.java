package Factory_Method.Exemplo;

public class MaquinaCafe extends MaquinaBebida {
    public Bebida entregaBebiba() {
      return new Cafe();
    }
  }
