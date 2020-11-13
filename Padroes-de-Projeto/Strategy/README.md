# Strategy

O Padrão Strategy é um padrao comportamental tambem chamado de policy. Ele delega responsabilidades, aumenta a coesão e aprimora a comunicação entre objetos


# Intenção

A Intenção é permitir definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Facilita a escolha dos algoritmos criados para uma determinada função

# Motivação

A motivação é quando se tem muitas classes  que se relaciona e que  diferem no modo de atuação

# Aplicabildade

Quando há necessidade de variar o algoritmo de acordo com as condições da chamada.


## Participante

![alt text](https://robsoncastilho.files.wordpress.com/2011/04/strategy.gif)

Context: define e mantem a referencia para uma classe Strategy especifica

Strategy: Interface (ou classe abstrata) comum a todos os algoritmos suportados.

ConcreteState: um ou mais algoritmo fornecido para a aplicação 

## Estrutura

![alt text](https://robsoncastilho.files.wordpress.com/2011/04/strategy.gif)


# Exemplo:

Um exemplo a ser mostrado é um criado pelo professor. Se encontra na pasta Strategy/Exemplo.


