# Adapter   

O Adapter é um padrão estrutal que permite isolar parte do Software. 

# Intenção

A intenção é fazer uma integracao simples de dois codigos diferentes em uma unica aplicação.

## Motivação

Muitas vezes uma classe que poderia ser reaproveitada não é reutilizada justamente pelo fato de sua interface não corresponder à interface específica de um domínio requerida por uma aplicação.

# Aplicabildade

* O padrão Adapter pode ser utilizado quando:

* O desenvolvedor deseja utilizar uma classe existente, porém sua interface não corresponde à interface que se precisa;

* O desenvolvedor quiser criar classes reaproveitavel, que coopere com classes não-relacionadas, ou seja, classes que não possuem necessariamente interfaces compatíveis;

## Estrutura
![alt text](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoAdapter_Java/PadraoAdapter_Java1.jpg)

No diagrama de classe acima tem-se o Client, que é quem acessa a interface do Adaptador e a partir desta interface ele fará uma solicitação ao adaptador. O Adaptador, por sua vez, implementa a interface alvo (Target) e comunica-se com o Adaptado (Adaptee). O Adaptado é a nova biblioteca do fornecedor que está sendo inserida no sistema.

## Exemplos

COnforme mostrado pelo Professor, um otimo exemplo seria o ministrado em aula. Exercicio se encontra na pasta Adapter/Exercicios.


