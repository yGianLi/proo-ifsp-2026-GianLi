Roteiro Aula 3 - Programação Ordenada:
Atividade 3.1:

2) Valores x1 e x2 = 100 | Valores y1 e y2 = 200.
    Par dentro da faixa (== ): true
   Par dentro da faixa (.equals()): true
   Par fora da faixa (== ): false
   Par fora da faixa (.equals()): true

3) Valores x1 e x2 = 127 | Valores y1 e y2 = 128.
   Par dentro da faixa (== ): true
   Par dentro da faixa (.equals()): true
   Par fora da faixa (== ): false
   Par fora da faixa (.equals()): true
   4)-a) O resultado do == é diferente pois o == não compara os valores, mas sim os seus endereços para tipos não primitivos.
   b) Já é uma consequência prevista, pois o seu limite numérico é maior que 127 ou menor que -128). A evidência que complementa a minha resposta
   é que no tópico 3, apliquei o valor 128, "Par fora da faixa (== ): false", pois ultrapassa o seu limite.
   c) Prompt: Explique o mecanismo de cache de Integer (também chamado de "Integer pool") na especificação da linguagem Java. Explique de forma resumida.
   Resposta gerada pela IA:

O Integer Pool é um mecanismo de reutilização de objetos Integer. No autoboxing, por exemplo Integer x = 10, o Java pode reutilizar um objeto já existente.
A especificação garante essa reutilização para int entre -128 e 127.

Por isso:
Integer a = 100;
Integer b = 100;

a == b; // true

Já para valores fora dessa faixa, como 1000, a identidade não é garantida:


Integer a = 1000;
Integer b = 1000;

a == b; // pode ser false

Em uma frase: o Integer Pool economiza memória reutilizando instâncias de Integer, mas == compara referências, não valores.


A explicação de IA ficou bem clara e explicativa, além de ser consistente com o que foi aplicado anteriormente.

Atividade 3.2: