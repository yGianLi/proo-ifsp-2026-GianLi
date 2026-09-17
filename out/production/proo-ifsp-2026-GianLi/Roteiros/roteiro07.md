# Atividades de POO — Construtores, Sobrecarga e Encapsulamento

---

## Atividade 1

**1. Por que o compilador passou a recusar o acesso direto aos atributos depois da mudança para `private`?**

Porque antes o tipo do atributo era `public`, onde poderia ser modificado. Como ele passou a ser `private`, os dados dentro do atributo passaram a ser privados e não dá para modificá-los, a não ser criando um método que permita alterar o valor.

**2. Qual problema prático (do mundo real) o encapsulamento evitou neste exemplo, ao impedir o acesso direto ao atributo `preco`?**

Um exemplo prático que o encapsulamento evita é não deixar aberto/público o acesso a dados sensíveis, como os de um banco. Eles precisam ser privados para que não haja alteração indevida que comprometa o acesso à conta da pessoa, evitando que terceiros tenham acesso não autorizado.

**3. Apoio de IA**

> **Prompt:** Por que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes.

> **Resposta da IA (ChatGPT):** Em Java, atributos públicos são evitados em código profissional porque diminuem o encapsulamento, permitindo que qualquer parte do programa altere diretamente os dados de uma classe. Isso pode quebrar regras e deixar o código mais difícil de controlar. Em sistemas grandes, isso gera acoplamento: várias classes passam a depender diretamente da estrutura interna de outras. Assim, uma simples mudança em um atributo pode exigir alterações em muitos lugares, dificultando a manutenção, os testes e as futuras refatorações. Por isso, geralmente os atributos são `private` e seu acesso é controlado por métodos.

**Resposta com minhas palavras:** Em Java, normalmente evitamos atributos públicos porque eles deixam qualquer parte do sistema alterar os dados diretamente. Isso dificulta o controle das regras da classe. Em sistemas grandes, isso pode gerar muito acoplamento, fazendo com que uma simples mudança em um atributo exija alterações em vários lugares. Por isso, o mais comum é usar atributos `private` e controlar o acesso por métodos.

---

## Atividade 2

**1. O que aconteceu com o preço do produto quando você chamou `setPreco(-50.0)`? O atributo foi alterado?**

Saiu uma mensagem de erro de "Número Negativo", pois dentro do setter tem um `if` que não permite o valor ser negativo. O atributo não foi alterado, pois o número negativo não foi atribuído ao novo preço.

**2. Por que o setter é o lugar correto para validar dados, e não a classe que usa o objeto `Produto`?**

O setter é o lugar correto para validar porque ele protege o estado interno do objeto. Assim, qualquer classe que tente alterar o `Produto` passa pela mesma validação, evitando valores inválidos.

**3. Como atribuir o parâmetro ao atributo de uma classe, se eles tiverem o mesmo nome?**

Quando o parâmetro e o atributo da classe possuem o mesmo nome, usamos a palavra-chave `this` para diferenciá-los. Por exemplo, em `this.nome = nome;`, `this.nome` representa o atributo da classe, enquanto `nome` representa o parâmetro recebido pelo método. Assim, o valor do parâmetro é atribuído ao atributo correspondente.

**4. Apoio de IA**

> **Prompt:** Quais validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas bancários) além de checar valores negativos.

> **Resposta da IA (ChatGPT):** Em sistemas reais, os setters podem validar várias regras além de valores negativos. Por exemplo, podem verificar se o campo não está vazio ou nulo, se o tamanho do texto é válido, se um e-mail possui formato correto, se uma data é válida, se um preço está dentro de um limite permitido ou se um valor atende às regras do negócio. Em sistemas bancários, também podem existir validações de limite, saldo e dados obrigatórios. O objetivo é impedir que o objeto receba informações inválidas e manter os dados consistentes.

**Resposta com minhas palavras:** Em sistemas reais, os setters costumam ter algumas validações para evitar que dados errados sejam armazenados. Eles podem verificar, por exemplo, se um campo está vazio, se o texto tem um tamanho adequado, se um e-mail é válido ou se um valor está dentro de um limite permitido. Em sistemas bancários, também podem verificar saldo, limites e outras regras do negócio. A ideia é simples: evitar que informações inválidas entrem no sistema e causem problemas depois.

---

## Atividade 3

**1. O que aconteceu com os atributos `nome` e `idade` do objeto quando você removeu o `this`? Por quê?**

Os atributos `nome` e `idade` não receberam os valores passados no construtor. Isso acontece porque `nome = nome` e `idade = idade` fazem referência ao próprio parâmetro, então os atributos continuam com os valores padrão: `null` e `0`.

**2. Em que situação o `this` é obrigatório para o código funcionar corretamente, dentro de um método ou construtor?**

O `this` é necessário quando o parâmetro ou variável local tem o mesmo nome do atributo da classe. Ele serve para deixar claro que estamos nos referindo ao atributo do objeto. Por exemplo: `this.nome = nome;`.

**3. Apoio de IA**

> **Prompt:**
> ```java
> package exercicios.encapsulamento;
>
> public class Pessoa {
>     private String nome1;
>     private int idade;
>
>     public Pessoa(String nome1, int idade) {
>         nome1 = nome1;
>         idade = idade;
>     }
>
>     public String getNome1() {
>         return this.nome1;
>     }
>
>     public int getIdade() {
>         return this.idade;
>     }
> }
> ```
> Neste código, dentro da classe pública `Pessoa`, nas variáveis `nome1` e `idade`, tinha `this.` na frente e depois eu tirei e deu mensagem de erro. Poderia explicar o conceito de "escopo de variável" (shadowing) relacionado a esse erro?

> **Resposta da IA (Claude):** Shadowing (sombreamento de variável) acontece quando um atributo da classe e um parâmetro têm o mesmo nome — nesse caso, dentro do construtor ou método, o parâmetro "esconde" o atributo, e o Java sempre prioriza a variável mais próxima no escopo, que é o parâmetro local. No código original, `nome1 = nome1;` e `idade = idade;` fazem exatamente isso: existem duas variáveis chamadas `nome1` naquele contexto (o parâmetro do construtor e o atributo `this.nome1` do objeto), e a linha `nome1 = nome1;` apenas pega o valor do parâmetro e atribui a ele mesmo — o atributo da classe nunca é tocado, ficando com o valor padrão (`null` para `String`, `0` para `int`). É por isso que, ao tirar o `this.`, o código continua compilando normalmente (não é um erro de sintaxe), mas o comportamento fica errado: ao chamar `getNome1()` ou `getIdade()`, você recebe `null` ou `0`, porque os atributos nunca foram preenchidos de verdade. A solução é usar `this`, que é uma referência ao objeto atual sendo construído: escrevendo `this.nome1 = nome1;` e `this.idade = idade;`, você deixa explícito que quer pegar o valor do parâmetro local e guardar no atributo deste objeto, eliminando a ambiguidade do shadowing.

**Resposta com minhas palavras:** Shadowing acontece quando um atributo da classe e um parâmetro possuem o mesmo nome. Nesse caso, o Java prioriza o parâmetro, que está no escopo mais próximo. Por isso, `nome1 = nome1;` atribui o parâmetro a ele mesmo, sem alterar o atributo da classe, que continua com o valor padrão, como `null` ou `0`. Para evitar isso, usamos `this`, por exemplo: `this.nome1 = nome1;`. O `this` indica que estamos alterando o atributo do objeto, enquanto `nome1` representa o parâmetro.

---

## Atividade 4

**1. Por que o Java não gerou um construtor padrão automaticamente?**

O Java só gera um construtor padrão automático quando a classe não tem nenhum construtor declarado. Como `Livro` já tinha o construtor parametrizado, essa geração automática não ocorreu.

**2. Em que momento o construtor padrão de uma classe deixa de ser gerado automaticamente pelo compilador?**

No momento em que qualquer construtor é escrito explicitamente na classe. A partir daí, o compilador para de gerar o construtor padrão implícito, e ele precisa ser declarado manualmente se for necessário.

**3. Apoio de IA**

> **Prompt:** O que é o "construtor padrão implícito" gerado pelo compilador Java e em quais condições exatas ele deixa de existir.

> **Resposta da IA (Claude):** **O que é:** construtor sem parâmetros que o compilador Java insere automaticamente no bytecode, com o mesmo modificador de acesso da classe e corpo vazio (apenas `super()`). Garante que toda classe tenha uma forma de ser instanciada. **Quando deixa de existir:** é gerado somente se a classe não declarar nenhum construtor. Assim que qualquer construtor é escrito explicitamente (com ou sem parâmetros), a geração automática é desativada — e, se necessário, o construtor sem parâmetros deve ser declarado manualmente.

**Resposta à mão:** O construtor padrão implícito é um construtor sem parâmetros que o Java cria automaticamente quando a classe não possui nenhum construtor declarado. Ele deixa de ser criado assim que declaramos qualquer construtor na classe, mesmo que seja um construtor com parâmetros. Nesse caso, se quisermos criar objetos sem passar argumentos, precisamos declarar um construtor sem parâmetros manualmente, como `Livro()`.

---

## Atividade 5

**1. Como o compilador Java decide qual dos três construtores será chamado em cada `new Retangulo(...)`?**

A resolução do construtor acontece em tempo de compilação, com base na quantidade e no tipo dos argumentos passados em `new Retangulo(...)` — é a sobrecarga (*overloading*): zero argumentos chama o Construtor 1, um `double` chama o Construtor 2, e dois `double` chamam o Construtor 3.

**2. O que aconteceria se você tentasse criar um quarto construtor `Retangulo(double altura)` além do `Retangulo(double lado)` já existente? Teste e registre o erro.**

Tentar criar `Retangulo(double altura)` além de `Retangulo(double lado)` não compila, pois os dois têm exatamente a mesma assinatura (um único parâmetro `double`) — o nome do parâmetro é só uma etiqueta interna e não conta para diferenciar sobrecargas. O erro é do tipo:

```
method Retangulo(double) is already defined in class Retangulo
```

**3. Apoio de IA**

> **Prompt:** Por que a assinatura de um método/construtor não considera o nome dos parâmetros, apenas seus tipos e quantidade, e peça um exemplo de sobrecarga que causa ambiguidade.

> **Resposta da IA (Claude):** A assinatura de um método/construtor em Java é definida, na JVM, pelo nome do método + tipos e ordem dos parâmetros. O nome do parâmetro (`lado`, `altura`, `x`, etc.) é apenas uma variável local, usada dentro do corpo do método para se referir ao valor recebido — ela não é armazenada como parte da identidade do método no bytecode. Isso faz sentido do ponto de vista de quem chama o método: ao escrever `new Retangulo(5.0)`, você não informa o nome do parâmetro, só o valor e seu tipo. O compilador precisa decidir qual construtor usar só com essa informação disponível na chamada.
>
> **Exemplo de sobrecarga que causa ambiguidade:**
> ```java
> public class Teste {
>     public void metodo(int a, long b) { }
>     public void metodo(long a, int b) { }
>
>     public static void main(String[] args) {
>         Teste t = new Teste();
>         t.metodo(10, 20); // erro: ambíguo
>     }
> }
> ```
> `10` e `20` são `int` por padrão, mas o Java pode promover qualquer um deles para `long`. Como não existe um `metodo(int, int)` exato, o compilador tenta achar a versão mais específica — só que `metodo(int, long)` e `metodo(long, int)` são igualmente válidas, e nenhuma é "mais específica" que a outra. Resultado: `error: reference to metodo is ambiguous`.

**Resposta à mão:** A assinatura de um método ou construtor em Java é definida pelo nome e pelos tipos e ordem dos parâmetros. O nome dado aos parâmetros não faz parte da assinatura, pois serve apenas para identificar as variáveis dentro do método. Por isso, métodos com o mesmo nome precisam ter parâmetros diferentes em quantidade, tipo ou ordem para serem considerados sobrecargas. Se duas opções forem igualmente válidas para uma chamada, o Java não consegue escolher qual usar e gera um erro de ambiguidade.

---

## Atividade 6

**1. O que acontece se você tentar colocar `this(...)` como a segunda instrução de um construtor, depois de outra linha de código? Teste e registre o erro apresentado pelo compilador.**

Colocar `this(...)` depois de outra instrução gera erro de compilação: `call to this must be first statement in constructor`. Isso ocorre porque a chamada a outro construtor precisa ser a primeira ação, garantindo que a inicialização "base" do objeto aconteça antes de qualquer outro código do construtor rodar — senão essa ordem previsível seria quebrada.

**2. Compare esta versão com a da Atividade 5: qual vantagem prática o uso de `this()` trouxe para a manutenção do código (ex: se a fórmula de inicialização mudasse)?**

Na versão sem `this()`, a lógica de atribuição (`this.base = ...; this.altura = ...;`) fica duplicada em três construtores; se a fórmula de inicialização mudasse (ex: adicionar validação para impedir valores negativos), seria preciso alterar em três lugares, com risco de esquecer algum. Com `this()`, só o construtor mais completo tem a lógica real — os outros apenas delegam —, então qualquer mudança precisa ser feita em um único lugar, reduzindo duplicação e risco de erro.

**3. Apoio de IA**

> **Prompt:** Por que `this()` precisa obrigatoriamente ser a primeira instrução do construtor e o que o compilador Java faz "por trás dos panos" quando um objeto é criado.

> **Resposta da IA (Claude):** A JVM segue uma regra rígida de inicialização de objetos: antes que qualquer código do construtor atual seja executado, a cadeia de construção do objeto (via `this(...)` ou `super(...)`) precisa terminar primeiro. Isso garante que, quando o corpo do construtor começa a rodar de fato, o objeto já está em um estado minimamente consistente.
>
> **Por trás dos panos, na criação de um objeto:**
> 1. A JVM aloca memória para o objeto no heap, com todos os atributos recebendo valores padrão (`0`, `0.0`, `false`, `null`).
> 2. Resolve qual construtor chamar, com base no tipo e quantidade dos argumentos.
> 3. Se a primeira instrução é `this(...)`, a JVM desvia a execução para o outro construtor antes de continuar.
> 4. Esse construtor chama implicitamente `super()` como sua própria primeira instrução.
> 5. Depois que `super()` termina, o corpo do construtor delegado executa.
> 6. O controle volta ao construtor original, que termina.
> 7. O objeto totalmente inicializado é retornado.

**Resposta à mão:** O `this()` precisa ser a primeira instrução do construtor porque o Java precisa executar primeiro a cadeia de inicialização do objeto. Assim, o construtor chamado por `this()` consegue inicializar o objeto antes que o restante do construtor seja executado. Na prática, quando usamos `this(lado, lado)`, o Java chama primeiro o outro construtor e, depois que ele termina, continua o construtor atual. Isso garante que o objeto seja inicializado na ordem correta e evita que ele seja utilizado antes de estar devidamente inicializado.

---

## Atividade 7

**1. Por que `p1` e `p2` continuam sendo dois objetos independentes na memória, mesmo tendo os mesmos valores iniciais?**

Porque `new Pessoa(p1)` cria um novo objeto na memória. O construtor de cópia apenas copia os valores de `p1` para o novo objeto `p2`. Assim, mesmo que inicialmente tenham os mesmos valores, `p1` e `p2` são objetos diferentes.

**2. Dentro do construtor de cópia, por que é possível acessar `outra.nome` e `outra.idade` diretamente, mesmo sendo atributos `private`?**

Porque o construtor está dentro da própria classe `Pessoa`. Em Java, membros `private` podem ser acessados diretamente por qualquer método ou construtor da mesma classe. Por isso podemos fazer `this(outra.nome, outra.idade)`, mesmo `nome` e `idade` sendo `private`.

**3. Apoio de IA**

> **Prompt:** Por que um construtor de cópia é útil na prática e qual a diferença entre copiar um objeto e copiar apenas a referência (`Pessoa p2 = p1;`).

> **Resposta da IA (Claude):** Um construtor de cópia é útil porque permite criar um objeto com os mesmos valores de outro, mas totalmente independente dali em diante — útil para guardar um "snapshot" antes de alterações, evitar que um método modifique acidentalmente o objeto original, ou criar variações sem afetar o registro original. A diferença fundamental está em como cada abordagem trata a memória: com `new Pessoa(p1)`, a JVM aloca um novo objeto e copia os valores para lá, resultando em dois objetos distintos, então alterar um não afeta o outro. Já com `Pessoa p2 = p1;` (sem `new`), nenhum objeto novo é criado — apenas o endereço de memória de `p1` é copiado para `p2`, fazendo as duas variáveis apontarem para o mesmo objeto.

**Resposta à mão:** O construtor de cópia permite criar um novo objeto com os mesmos valores de outro objeto, mas de forma independente. Isso é útil quando queremos fazer uma cópia sem alterar o objeto original. Com `new Pessoa(p1)`, um novo objeto é criado e recebe os valores de `p1`. Assim, são dois objetos diferentes e alterar um não altera o outro. Já com `Pessoa p2 = p1;`, nenhum objeto novo é criado. As duas variáveis apontam para o mesmo objeto. Portanto, se alterarmos `p2`, a alteração também será refletida em `p1`.

---

## Atividade 8

**1. O que determina qual das versões de `somar` será executada em cada chamada: o nome do método, o tipo de retorno, ou os parâmetros?**

O que determina qual versão é executada são os parâmetros (tipo e quantidade) passados na chamada — nunca o nome do método (que é o mesmo nas três versões) nem o tipo de retorno. O compilador olha para os argumentos (`(2,3)`, `(2,3,4)`, `(2.5,3.5)`) e escolhe a assinatura correspondente.

**2. Seria possível criar uma versão `public double somar(int a, int b)` além da já existente `public int somar(int a, int b)`? Teste e explique o que o compilador informa.**

Não seria possível. Criar `public double somar(int a, int b)` junto de `public int somar(int a, int b)` gera erro de compilação, porque as duas têm exatamente a mesma assinatura (mesmo nome, mesmos tipos e quantidade de parâmetros: `int, int`). O tipo de retorno não faz parte da assinatura do método, então não é suficiente para diferenciá-los. O compilador acusa:

```
error: method somar(int,int) is already defined in class Calculadora
```

**3. Apoio de IA**

> **Prompt:** Por que o tipo de retorno sozinho não é suficiente para diferenciar métodos sobrecarregados em Java.

> **Resposta da IA (Claude):** O compilador decide qual método chamar observando apenas a chamada em si — nome do método, mais tipo e quantidade dos argumentos — nunca o que será feito com o valor retornado. Se dois métodos tivessem a mesma assinatura mas retornos diferentes, uma chamada como `calc.somar(2, 3)` seria ambígua, já que os argumentos combinam igualmente bem com as duas versões. Por isso, a especificação do Java define a assinatura de um método como nome + tipos e ordem dos parâmetros, deixando o tipo de retorno de fora de propósito.

**Resposta à mão:** O compilador escolhe qual método chamar com base no nome e nos tipos e quantidade dos parâmetros. O tipo de retorno não é considerado para diferenciar métodos. Por isso, não podemos ter dois métodos com a mesma assinatura e apenas retornos diferentes, como `int somar(int, int)` e `double somar(int, int)`. O Java não conseguiria saber qual deles deveria chamar.

---

## Atividade 9

**1. Depois de adicionar o `somar(int... numeros)`, o que aconteceu quando você chamou `somar(3, 4)`: o compilador reclamou de ambiguidade com o `somar(int a, int b)` da Atividade 8, ou escolheu a versão de dois parâmetros? Explique com base no resultado observado.**

A chamada `somar(3, 4)` não gerou ambiguidade — o compilador escolheu a versão `somar(int a, int b)` (confirmado pela mensagem "Chamando somar(int, int)" no console). Isso acontece porque o Java resolve sobrecargas em fases de prioridade: primeiro tenta achar um método que combine exatamente com os argumentos sem usar varargs; só recorre à versão varargs como último recurso, quando nenhuma outra opção serve.

**2. Dentro do método, `numeros` se comporta como qual estrutura de dados da linguagem Java?**

`numeros` se comporta como um array de `int` (`int[]`). O `int...` é apenas uma forma sintática mais prática de declarar o parâmetro — o compilador converte automaticamente os argumentos passados na chamada em um array antes de entregá-los ao método. Por isso o *for-each* funciona normalmente, e chamar `somar()` sem argumentos resulta em um array vazio (não `null`), fazendo o *for-each* simplesmente não iterar e retornar soma `0`.

**3. Apoio de IA**

> **Prompt:** Qual é a ordem de prioridade que o Java usa para escolher entre um método sobrecarregado "exato" e um método com varargs quando ambos poderiam atender à chamada.

> **Resposta da IA (Claude):** O Java resolve a sobrecarga em três fases, parando na primeira que encontrar um método aplicável:
> - **Fase 1** — Correspondência exata, sem conversões nem boxing/unboxing.
> - **Fase 2** — Permite conversões (promoção numérica e autoboxing/unboxing), mas ainda sem varargs.
> - **Fase 3** — Permite varargs, tratando os argumentos como um array.
>
> No caso de `somar(3, 4)` com `somar(int, int)` e `somar(int...)` disponíveis: `somar(int, int)` é encontrado já na Fase 1, então o compilador nem chega a avaliar a versão varargs.

**Resposta à mão:** O Java resolve a sobrecarga de métodos em três etapas, sempre começando pela opção mais simples. Na primeira fase, procura um método com exatamente os mesmos tipos dos argumentos, sem conversões. Na segunda fase, se não encontrar, permite algumas conversões, como `int` para `long` ou `int` para `Integer`, ainda sem considerar varargs. Na terceira fase, se nenhuma das anteriores funcionar, considera os métodos com varargs. Por exemplo, com `somar(int, int)` e `somar(int...)` disponíveis, ao chamar `somar(3, 4)`, o Java escolhe `somar(int, int)` porque é uma correspondência exata.

---

## Atividade 10

**1. Qual foi o papel do `this` em cada um dos três lugares onde ele apareceu nesta atividade (atribuição no construtor completo, encadeamento com `this(...)`, e dentro do próprio método `depositar` caso você tenha usado)?**

- **No construtor completo** (`this.titular = titular;` etc.): resolve o conflito de nomes entre o parâmetro e o atributo, indicando "o atributo da instância", não a variável local do parâmetro.
- **No encadeamento** `this(titular, 0, true)`: chama outro construtor da mesma classe, delegando a inicialização em vez de repeti-la.
- **Dentro de `depositar`** (`this.ativa`, `this.saldo`): aqui não havia conflito de nomes com o parâmetro `valor`, então o `this` foi usado de forma opcional/estilística, apenas para deixar explícito que se está referenciando os atributos da instância.

**2. Por que o getter do atributo `ativa` se chama `isAtiva()` e não `getAtiva()`? Essa diferença muda algo no comportamento do método, ou é só uma convenção de nome?**

É uma convenção de nomenclatura do JavaBeans, não uma regra da linguagem. Para atributos do tipo `boolean`, o padrão é usar o prefixo `is` (`isAtiva()`) em vez de `get` (`getAtiva()`), justamente para deixar a leitura mais natural em contextos como `if (conta.isAtiva())`, que soa como uma pergunta ("a conta está ativa?"). Tecnicamente, `getAtiva()` também compilaria e funcionaria normalmente — o comportamento do método não muda, é puramente uma questão de legibilidade e convenção.

**3. Apoio de IA**

> **Prompt:** Descreva a classe `ContaBancaria` que eu implementei e peça sugestões de mais uma regra de encapsulamento (validação) que um sistema bancário real aplicaria no método `depositar` ou em um método `sacar`.

> **Resposta da IA (Claude):** A classe encapsula `titular`, `saldo` e `ativa` como `private`, expondo apenas getters (sem setters) — a única forma de alterar o saldo é via `depositar`, que já valida conta ativa e valor positivo. Os dois construtores são encadeados com `this(...)`, evitando duplicar a lógica de inicialização.
>
> **Sugestão para `sacar`:** validar se há saldo suficiente, evitando saldo negativo:
> ```java
> public boolean sacar(double valor) {
>     if (this.ativa && valor > 0 && valor <= this.saldo) {
>         this.saldo -= valor;
>         return true;
>     }
>     return false;
> }
> ```
> O retorno `boolean` avisa se o saque foi rejeitado (ex: saldo insuficiente), permitindo que quem chamou o método trate o erro — a classe garante sozinha que seu estado interno nunca fique inconsistente.

**Resposta à mão:** A classe `ContaBancaria` utiliza encapsulamento, deixando os atributos `titular`, `saldo` e `ativa` como `private`. Dessa forma, eles só podem ser acessados por meio dos getters. Como não existem setters, as alterações são controladas pelos próprios métodos da classe, como `depositar`, que verifica se a conta está ativa e se o valor é positivo.

A classe também possui dois construtores usando `this(...)`. O construtor mais simples cria a conta com saldo zero e ativa, enquanto o outro recebe todos os valores. Isso evita repetir código e facilita a manutenção.

Um método `sacar` também pode ser utilizado para controlar os saques. Ele verifica se a conta está ativa, se o valor é positivo e se existe saldo suficiente. O retorno `boolean` indica se o saque foi realizado ou não.

Assim, o encapsulamento ajuda a proteger os dados da conta e evita alterações que poderiam deixar o objeto em um estado incorreto.