# Java Hello World

## Roteiro de Atividades

- **Nome:** Gian Li Zhang
- **Data:** 06/08/2026

## Atividade 1: Explorar IntelliJ

**a.** Papel do debug é pegar o passo a passo do código e verificar se a sintaxe está correta.

**b.** O `values.length` pedido no passo 12 serve para pegar o tamanho de um array em Java, ele é necessário para limitar o tamanho do array que o exercício pediu ou para algum caso específico.

**c.** A

## Atividade 2: Escrever o programa Hello World

**a.** Tive nenhuma dificuldade em realizar a atividade.

**b.** Utilizei a versão JDK java `version "25.0.1"`.

## Atividade 3.3: Explorando os tipos primitivos e mensagens de erro

### 1. Declaração dos tipos primitivos

Foram declaradas variáveis utilizando os oito tipos primitivos da linguagem Java:

- `int idade = 18;`
- `float altura = 1.75f;`
- `double salario = 2500.50;`
- `char inicial = 'G';`
- `boolean gostaDeMinecraft = true;`
- `long populacao = 8000000000L;`
- `byte nivel = 10;`
- `short ano = 2026;`

### 2. Operadores aritméticos e lógicos

Foram utilizados os operadores aritméticos `+`, `-`, `*` e `/`:

```java
int a = 20;
int b = 5;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
```

### 3. Causando erros propositais e analisando as mensagens

**Erro 1:** Tentei armazenar um texto em uma variável do tipo `int`.

```java
int numero = "dez";
```

### 4. Responda

**a) Qual a utilidade do tipo primitivo boolean?**

O tipo primitivo `boolean` é utilizado para armazenar valores lógicos. Ele pode assumir apenas dois valores: `true` (verdadeiro) ou `false` (falso). É utilizado principalmente para representar condições e tomar decisões dentro de um programa.

**b) Quais foram os erros que você produziu? As mensagens de erro identificaram os problemas corretamente? Eram claras?**

Os erros produzidos foram: tentar armazenar um texto em uma variável do tipo `int`, tentar armazenar um número decimal em uma variável do tipo `int` e utilizar uma variável que não havia sido declarada.

As mensagens de erro identificaram os problemas corretamente e foram claras, pois indicaram o local do erro e ajudaram a entender o motivo do problema e como ele poderia ser corrigido.