package SingletonPattern.Exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public final class SingleObject{
    private static volatile SingleObject instace = null;

    private SingleObject(){};

    //Lazy
    public static SingleObject getInstance(){
        if (instace == null){

            synchronized(SingleObject.class){

                if(instace == null){
                    instace = new SingleObject();
                }
            }
        }
        return instace;
    }

    public void writeMessage(final String Message){
        try{
        final FileWriter arq = new FileWriter("C:\\Programacoes\\Java\\arquivo.txt");
        final PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.println("Teste");
        gravarArq.println("=================");

        gravarArq.println(Message);

        gravarArq.println("=======  End  ==========");
        
        arq.close();
        System.out.println("Arquivo Gravado com Sucesso.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    };

}