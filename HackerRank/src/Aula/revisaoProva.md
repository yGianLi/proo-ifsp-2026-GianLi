Construtor: 

- Método especial
- Não tem tipo de retorno
- Mesmo nome da classe

Pode definir espaço do objeto/inicializar atributos

Pessoa p = new Pessoa(); --> _Pessoa() é o Construtor_

Dois tipos de Construtor: Padrão e Parametrizado

_Pessoa() é o Construtor_ --> s/ parâmetros (padrão)

_Pessoa("Ana") é o Construtor_ --> c/ parâmetro (parametrizado)
"A quantidade de parâmetros pode ter quantos quiser"

UML: 
É uma linguaguem de modelagem
*diagrama de classes

|NomeClasse|
|Atributos|
|Métodos|

Visibilidade:
-> Controla acesso
-> Implementar o encapsulamento
-> 

o default é chamado também como default(package-private)

Relacionamento:
- associação;
- agregação
- composição
- herança
- implementação/interface

Tipos:
-: private (privado)
+: public (público)
#: protected (protegido)
~: default

Exemplos:

| Pessoa          |
|-----------------|
| -nome: String   |
| - int idade     |
| --------------- |
| +void m1()      |
| +m2: int        |










