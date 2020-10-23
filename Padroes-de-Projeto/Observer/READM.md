# Observer

O Obsever é um padrão comportamental. Ele basicamente define uma forma de comunicação entre classes.    


# Intenção


A intenção do Observer Pattern é definir uma dependência um-para-muitos entre objetos. Quando um objeto muda de estado, todos os seus dependentes é notificados e atualizado automaticamente.

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

