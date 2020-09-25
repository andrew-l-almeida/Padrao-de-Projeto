# Composite Pattern

O tipo de padrão Composite Patten, é um padrão de projeto utilizado para componentes em que a superclasse possui subclasses, ele armazena componentes das subclasses e implementa operações relacionadas a filhos e definidas na interface Componente.

# Intenção

A intenção do composite é "compor" objetos em estruturas de árvore para representar hierarquias parte-todo. 



## Motivação

O Composite pattern é uma interface que permite tratar objetos complexos e primitivos de maneira uniforme. Na POO, um composto é um objeto projetado como uma composição de um ou mais objetos semelhantes, todos exibindo funcionalidade semelhante. O conceito principal é que você pode manipular uma única instância do objeto da mesma forma que manipularia um grupo deles.

# Aplicabildade

Implementar o padrão composite permite que os clientes tratem objetos individuais e composições uniformemente.


## Estrutura
Dentro da estrutura do Composite, atua 3 participantes:

O Componente: é a interface que define métodos comuns às classes dentro da composição e, opcionalmente, define uma interface para acessar o objeto “pai” de um componente.

A Folha: é um componente que, como o nome indica, não possui filhos (está nas extremidades da árvore).

O Composto: é um componente que, como o nome indica, é composto de outros componentes, que podem ser folhas ou outros compostos.


## Exemplos

COnforme mostrado pelo Professor, um otimo exemplo seria o ministrado em aula. Exercicio se encontra na pasta Composite.


