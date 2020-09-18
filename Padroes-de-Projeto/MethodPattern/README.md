# Method Pattern

O Method Pattern Define o esqueleto de um algoritmo na superclasse e permite que as subclasses façam alterações do mesmo sem alterar a sua estrutura.


## Onde utilizar e quando utilizar??

O Method pode ser aplicável em casos que se tem uma hierarquia de classes se tem um algoritmo que deve ser dividido em etapas "Um método na superclasse, chamado template method, invoca os demais métodos que podem ser abstratos". Deve usar quando a Aplicação possuir estrutura hierárquica e um algoritmo que pode ser dividido em etapas. Da pra usar tambem quando dois ou mais componetes diferentes implementam esse algoritmo, possuindo várias semelhanças mas algumas diferenças na implementação de algumas etapas do algoritmo etc...


Um exemplo da utilização desse metodo é um exercicio proposto pelo professor sobre o Personal Trainer.
