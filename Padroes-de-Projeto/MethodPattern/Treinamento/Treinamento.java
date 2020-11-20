package MethodPattern.Treinamento;

public abstract class Treinamento {
    Treinamento(){

    }
    public void iniciarTreinamento(){

        

        Aquecimento();
        System.out.println();
        Fundamentos();
        System.out.println();
        Hidratacao();
        System.out.println();
        Atividade_Areobica();
        System.out.println();
        Hidratacao();
        System.out.println();

        Recreacao();
        System.out.println();
        System.out.println(Atividade());

    }
    protected abstract String Atividade();

    protected void Aquecimento(){
        System.out.println("Antes do Seu Treino, Você deve fazer um aquecimento primeiro!!! :)");
    }
    protected void Fundamentos(){
        System.out.println("Agora Você deve treinar os fundamentos do seu Treino....");
    }
    protected void Hidratacao(){
        System.out.println("Beba Muita Agua para ficar Hidratado hehehe....");
    }
    protected void Atividade_Areobica(){
        System.out.println("Faça agora uma atividade aerobica....");
    }
    protected void Recreacao(){
        System.out.println("E por fim mas não menos importante... Faça a recreação....");
    }
}
