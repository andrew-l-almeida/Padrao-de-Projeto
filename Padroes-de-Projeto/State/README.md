# State

O State é um padrão comportamental que permite que o objeto altere o seu comportamento quando o seu estado interno muda.


# Intenção

A intenção é permitir que o objeto altere o seu comportamento quando o seu estado interno mudar.

# Motivação

Permitir ao objeto possuir diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com base nesse estado

# Aplicabildade

Usamos o State quando se tem que gerenciar comportamentos diferentes dependendo de um número de estado diferentes.


## Participante

![alt text](https://howtodoinjava.com/wp-content/uploads/2019/01/State-design-pattern.png)

Context: define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do projeto.

State: Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto.

ConcreteState: Um ou mais estados concretos que implementam a interface estado.

## Estrutura

![alt text](https://howtodoinjava.com/wp-content/uploads/2019/01/State-design-pattern.png)


# Exemplo:

Um exemplo a ser mostrado é um criado pelo professor. Se encontra na pasta State/Exemplo.




# Exemplo:

Um exemplo do Singleton é o exercicio proposto pelo professor sobre criar um aplicativo java que escreve em um arquivo. Esse exercicio foi criado por mim.

O exercicio se Encontra na pasta SingletonPattern/Exercicios.

