# Observer

O Obsever é um padrão comportamental. Ele basicamente define uma forma de comunicação entre classes.    

# Intenção

A intenção do Observer Pattern é definir uma dependência um-para-muitos entre objetos. Quando um objeto muda de estado, todos os seus dependentes é notificados e atualizado automaticamente.

# Motivação

A principal motivação por trás do Padrão Observer é o desejo de manter a consistência entre os objetos relacionados sem torná-los acoplados

# Aplicabildade

O padrão do observer é usado quando:
- a mudança de estado em um objeto deve ser refletida em outro objeto, sem manter os objetos fortemente acoplados.
- a estrutura que estamos escrevendo precisa ser aprimorada no futuro com novos observadores com mudanças mínimas.


## Participante

![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/500px-Observer_w_update.svg.png)

Subject: é a classe possui a informação o estado que se deseja observar.

Observer: Interface que define os métodos de notificação de interesse dos observadores.

ConcreteObserverA, ConcreteObserverB: Classes concretas que observam a classe Subject.

## Estrutura

![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/500px-Observer_w_update.svg.png)


# Exemplo:

Um exemplo a ser mostrado é um criado pelo professor. Se encontra na pasta Observer/Exemplo.



