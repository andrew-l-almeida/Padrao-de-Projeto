package Factory_Method.Exemplo;
public abstract class MaquinaBebida {
    public abstract Bebida entregaBebiba();
  
    public String exibeMensagem() {
      return "Bem-vindo à máquina de bebidas";
    }
  }