
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o que vc quer escrever: ");

        String Mensagem = ler.nextLine();

        
        System.out.println(object == object2);

        object.writeMessage(Mensagem);

        ler.close();

      }
}
