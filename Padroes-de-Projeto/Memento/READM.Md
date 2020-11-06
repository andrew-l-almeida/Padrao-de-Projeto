# Memento

O Memento é um padrão comportamental. Ele permite capturar e externalizar um estado interno de um objeto, de maneiras que o objeto possa ser restaurado para esse estado mais tarde

# Intenção

Quando houver necessidade de registrar o estado interno de um objeto para implementação de mecanismos de checkpoints e para desfazer operações no caso de erros.

# Motivação

A principal motivação por trás do Padrão Memento é se houver a necessidade de se criar pontos de restauração de estados de objetos

# Aplicabildade

O Memento pode ser usado em sistemas onde os usuários fazem simulações e são necessários salvar ou desfazer essas configurações em tempo de execução.

## Participante

![alt text](https://padroesdeprojetoifc.files.wordpress.com/2016/11/slide_6.jpg?w=616)

Memento é a classe que representa um snapshot, contendo o estado de um objeto a ser restaurado em um Originador. Possui métodos para obter e definir o estado que um Memento encapsula dentro.

Originador: é a classe na qual o estado atual é mantido. Define Método que permite criar um Memento com o estado atual do Originador armazenado no Memento retornado.

Caretaker: Classe auxiliar responsavel por armazenar e restaurar o estado do Originador por meio do Objeto Memento.

## Estrutura


![alt text](https://padroesdeprojetoifc.files.wordpress.com/2016/11/slide_6.jpg?w=616)


# Exemplo:

Um exemplo a ser mostrado é um criado pelo professor. Se encontra na pasta Memento/Exemplos.



