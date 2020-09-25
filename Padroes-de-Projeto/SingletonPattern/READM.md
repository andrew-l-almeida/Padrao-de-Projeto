# Singleton Pattern

O Singleton Pattern é um padrão que garante a existencia de apenas uma instância da classe.


# Intenção

A intenção é definir um ponto de criação de objetos que necessitem ser instanciado somente uma vez durante todo o ciclo de execução da solução e oferecer um ponto único de acesso para essa referencia.

# Motivação

A motivação é quando necessite que uma classe tenha apenas uma instancia para o projeto todo. Por exemplo num banco de dados rodando em modo embarcado.

# Aplicabildade

Nós aplicamos o Singleton quando a gente quer resolver problemas como:

    - Como posso assegurar que uma classe tenha apenas uma instancia?
    - Como a unica instancia de uma classe pode ser acessada globalmente?


## Estrutura

A classe Singleton declara o método estático getInstance que retorna a mesma instância de sua própria classe.

O construtor da singleton deve ser escondido do código cliente. Chamando o método getInstance deve ser o único modo de obter o objeto singleton.


# Exemplo:

Um exemplo do Singleton é o exercicio proposto pelo professor sobre criar um aplicativo java que escreve em um arquivo. Esse exercicio foi criado por mim.

O exercicio se Encontra na pasta SingletonPattern/Exercicios.

