## Revisão:

- Conceitos 0.0:

**Classe**  
é um tipo abstrato de dados

tem propriedades ( atributos e dados ) + métodos ( funções )

Exemplo( são tipos de dados abstratos ) :

_String_ nome;    
_Scanner_ teclado;

(propriedades(dados) da classe "Carro")

Carro: 
-cor:
-motor;
-tamanho;
-modelo;
-torque;
-preço;

+acelerar();
+virar();
+ligar();
+desligar();
+frear();

Objeto é uma INSTÂNCIA da classe

Carro _fusca_ = new Carro();  aqui "fusca" é um objeto

Carro _porshe_ = new Carro(); aqui "porshe" é um objeto

ex: Médico -> Classe
Cirurgia -> Classe

+realizarCirurgia();

Medica m1 = new Medico();
Cirurgia c1 = new Cirurgia();

m1.realizarCirurgia(c1); -> aqui é um método

## Relacionamento de Classes:

- **UML** (Linguaguem Modelagem Unificada)

Diagrama de classes:

é representada por retângulos e dentro dela tem: 
- Nome da Classe
- Atributos
- Métodos

Quando a informação é apresentada com (-) significa que o valor é privado e quando a informação é apresentada com (+) significa que o valor é público;

### Ex:
--------------------------

- Nome da Classe: Cirurgia
- Atributos: -duração, -risco, -paciente.
- Métodos: +agendar(), +executar();

--------------------------

- Nome da Classe: Medico
- Atributos: -nome, -especialidade.
- Métodos: +realizar();

--------------------------

Cirurgia ----realizar----> Medico

### Tipos de relacionamentos

- Associação
- Agregação
- Composiçao
- Herança
- Interfaces/Implementação




