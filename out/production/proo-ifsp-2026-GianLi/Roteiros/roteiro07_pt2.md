# Exercícios de Revisão — Parte II

## Atividade 1: Validando um cadastro com String

**1.** O método `trim()` retorna uma variável nova. No código, fiz dois prints: um sem o método `trim()` e outro com. No primeiro print, o resultado saiu com todos os espaços; no segundo, saiu apenas o conteúdo, sem os espaços.

**2.** Porque, mesmo havendo espaços dentro da `String`, eles ainda contam como caracteres, e o `isEmpty()` não consegue identificar se há ou não conteúdo relevante. Já se a checagem for feita depois do `trim()`, os espaços são removidos e, se a `String` ficar vazia, o `isEmpty()` consegue identificar corretamente que não há conteúdo.

**3. Apoio da IA**

> **Prompt:** por que uma String é uma classe imutável em Java e o que isso implica para métodos como trim(), toUpperCase() e replace().

**Resposta da IA:** Uma `String` em Java é imutável porque, internamente, o valor dela é armazenado em um array de caracteres (`char[]`, ou `byte[]` a partir do Java 9 com o Compact Strings) que é `final` e nunca é alterado depois que o objeto é criado. Uma vez que uma `String` existe na memória, seu conteúdo não pode ser modificado — nenhum método da classe muda os bytes/caracteres internos daquele objeto.

**Minha resposta:** Uma `String` em Java é imutável porque, depois que é criada, seu conteúdo não pode ser alterado. Quando tentamos modificar uma `String`, na verdade um novo objeto é criado com o novo valor. Isso ajuda a evitar alterações inesperadas e permite que o Java reutilize `String`s com segurança na memória.

---

## Atividade 2: Extraindo dados de um e-mail

**1.** O que `indexOf('@')` retorna se `@` não existir?

Retorna `-1`. É o valor sentinela que o Java usa para indicar "não encontrado" em métodos de busca como `indexOf`.

**2.** Diferença entre `substring(indice)` e `substring(0, indice)`:

- `substring(0, indice)` — recebe dois argumentos: início (inclusive) e fim (exclusive). Extrai do começo da string até antes de `indice`. É o que usamos para pegar o usuário (tudo antes do `@`).
- `substring(indice)` — recebe um único argumento, apenas o índice de início. Extrai daquele ponto até o final da string automaticamente. É o que usamos para pegar o domínio (tudo depois do `@`, usando `posicaoArroba + 1` como início).

Resumindo: a versão com dois parâmetros define um "recorte" com começo e fim específicos; a versão com um parâmetro só define onde começar, e vai até o fim naturalmente.

**3. Apoio da IA**

> **Prompt:** Quais exceções o método substring pode lançar em Java? Em quais condições cada uma ocorre? Me dê um exemplo de código com um índice inválido.

**Resposta da IA:**

Exceção lançada: `StringIndexOutOfBoundsException` (unchecked, subclasse de `RuntimeException`).

| Situação | Exemplo |
|---|---|
| Índice inicial negativo | `"Java".substring(-1)` |
| Índice inicial maior que o tamanho da string | `"Java".substring(10)` |
| Índice final maior que o tamanho da string | `"Java".substring(0, 10)` |
| Índice inicial maior que o final | `"Java".substring(3, 1)` |

Exemplo prático ligado ao exercício do e-mail:

```java
String email = "usuariosemarroba.com";
int posicaoArroba = email.indexOf('@'); // retorna -1
email.substring(0, posicaoArroba); // substring(0, -1) → exceção!
```

Como evitar — validar o índice antes de usar o `substring`:

```java
if (posicaoArroba != -1) {
    // extrair normalmente
} else {
    System.out.println("E-mail inválido: não contém @");
}
```

**Minha resposta:** O método `substring` pode lançar a exceção `StringIndexOutOfBoundsException` quando os índices informados estão fora dos limites da `String`. Isso pode acontecer quando o índice é negativo, maior que o tamanho da `String` ou, no caso de `substring(início, fim)`, quando o índice inicial é maior que o final. Por exemplo, se `indexOf('@')` retornar `-1` porque o `@` não existe, usar esse valor no `substring` causará a exceção. Por isso, é importante verificar se os índices são válidos antes de usar o método.

---

## Atividade 3: Comparando e quebrando uma linha de dados (CSV)

**1.** `equals` vs `equalsIgnoreCase`

- `linha.equals(outraLinha)` → `false`
- `linha.equalsIgnoreCase(outraLinha)` → `true`

Diferença: `equals()` compara caractere por caractere considerando maiúsculas/minúsculas; `equalsIgnoreCase()` ignora essa diferença de caixa antes de comparar.

**2.** Comparando com `==`

- `linha == outraLinha` → `false`

Motivo: `==` em objetos compara referência de memória, não conteúdo. Como são objetos distintos, o resultado é `false`. Por isso, para comparar o conteúdo de `String`s, deve-se sempre usar `equals()`, nunca `==`.

---

## Atividade 4: Classe Produto e ArrayList de produtos

**1.** Por que `ArrayList<Produto>` e não `ArrayList<String>`/`ArrayList<Object>`?

- Com `ArrayList<Produto>`, o compilador sabe que todo elemento é um `Produto`, permitindo chamar `getPreco()` diretamente, sem cast.
- `ArrayList<String>` nem aceitaria guardar objetos `Produto`.
- `ArrayList<Object>` aceitaria, mas exigiria cast manual (`(Produto) o`) para acessar métodos como `getPreco()`, com risco de erro em tempo de execução (`ClassCastException`).
- Generics garantem segurança de tipos em tempo de compilação.

**2.** `ListaDeCompras` faria sentido sem `Produto`?

Não. O código nem compilaria, já que `ListaDeCompras` depende diretamente do tipo `Produto` (no atributo, no método `adicionar` e nas chamadas de getters). Isso mostra uma relação de dependência de mão única: `ListaDeCompras` depende de `Produto`, mas `Produto` é autossuficiente e funcionaria sozinho, sem `ListaDeCompras`.

---

## Atividade 5: Classe Aluno e estatísticas com ArrayList

**1.** `calcularMedia()` em turma vazia

Resultado: `0.0` (graças à verificação `if (alunos.isEmpty()) return 0;`).

Sem essa verificação, ocorreria `0 / 0`, que em `double` não lança exceção, mas gera `NaN` — um valor "contagioso" que propaga erro por cálculos futuros. Por isso é importante tratar o caso vazio explicitamente.

**2.** Por que guardar o "melhor aluno" e não só a maior nota

- O método precisa retornar um `Aluno` completo, não apenas um número.
- Guardando só a nota, você saberia o valor máximo, mas perderia a referência a quem tem essa nota (nome, etc.).
- Guardando a referência ao objeto (`Aluno melhor = ...`), você mantém acesso a todos os dados daquele aluno, permitindo retorná-lo corretamente ao final do laço.

**3. Apoio da IA**

> **Prompt:** como o método encontrarMelhorAluno() poderia ser reescrito usando Streams do Java (ex: stream(), max()), e compare com a versão feita usando for.

**Resposta da IA:**

```java
public Aluno encontrarMelhorAluno() {
    return alunos.stream()
            .max(Comparator.comparingDouble(Aluno::getNota))
            .orElse(null);
}
```

O `stream()` transforma a lista em uma sequência de elementos processável de forma funcional. `Comparator.comparingDouble(Aluno::getNota)` cria um comparador baseado na nota de cada aluno, usando `Aluno::getNota` como forma abreviada de `aluno -> aluno.getNota()`. O método `.max()` percorre a stream inteira e retorna o elemento com maior valor segundo esse comparador, mas o resultado vem embrulhado num `Optional<Aluno>` — um "envelope" que pode ou não conter um valor, usado para representar com segurança o caso de lista vazia. Por fim, `.orElse(null)` extrai o `Aluno` de dentro do `Optional`, retornando `null` se a stream estiver vazia, preservando o mesmo comportamento da versão original.

Comparando com a versão feita usando `for`: a versão com laço é mais explícita e passo a passo, deixando claro "como" a comparação acontece — você mesmo controla a variável `melhor` e atualiza ela manualmente a cada iteração, além de tratar a lista vazia com um `if (alunos.isEmpty())` no início. Já a versão com Streams é mais declarativa, expressando "o quê" se quer obter em vez de "como" obter, resultando em código mais compacto, mas exigindo entender conceitos adicionais como method reference, `Comparator` e `Optional`.

Em termos práticos, a versão com `for` costuma ser mais fácil de depurar e tem uma curva de aprendizado mais suave para quem está começando. A versão com Streams é mais usada em Java moderno (Java 8+) e se torna ainda mais vantajosa quando combinada com outras operações encadeadas, como filtrar elementos antes de buscar o máximo. Para quem ainda está consolidando os fundamentos, vale continuar praticando a versão com `for` e incorporar Streams gradualmente.

**Minha resposta:** O método `encontrarMelhorAluno()` pode ser feito com Streams usando:

```java
public Aluno encontrarMelhorAluno() {
    return alunos.stream()
            .max(Comparator.comparingDouble(Aluno::getNota))
            .orElse(null);
}
```

O `stream()` permite percorrer a lista de forma funcional, enquanto o `max()` encontra o aluno com a maior nota. O `Comparator` define que a comparação deve ser feita pela nota. O `orElse(null)` faz com que o método retorne `null` caso a lista esteja vazia.

A principal diferença para o `for` é que o `for` mostra passo a passo como a busca é feita, enquanto o Stream deixa o código mais curto e indica diretamente o que queremos encontrar. Para quem está começando, o `for` costuma ser mais fácil de entender, enquanto Streams são bastante usados em Java moderno.