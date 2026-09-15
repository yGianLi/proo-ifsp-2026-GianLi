Atividade 1:

1. Por que o compilador passou a recusar o acesso direto aos atributos depois da mudança para
   private?

R: Porque antes o tipo do atributo era "public", onde poderia ser modificado, como ele passou a ser "private" os dados dentro do atributo passaram a ser privados e não dá para modificá-los, a não ser criar um método que posso alterar o valor.

2. Qual problema prático (do mundo real) o encapsulamento evitou neste exemplo, ao impedir
   o acesso direto ao atributo preco?

R: Um exemplo problema prático que o encapsulamento evitou é não deixar abertamente/público os dados pessoais de certas ocasiões como por exemplo dados pessoais de um Banco, precisam ser privados para que não tenha alteração e que comprometa o acesso ao banco da pessoa, evitando problemas de certas pessoas nn ter o acesso.

3. Apoio de IA: Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte por
   que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código
   profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes.

**Prompt**: Por que a linguagem Java não permite, por padrão, que atributos fiquem públicos em código
profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes.

Resposta da IA: Em Java, atributos públicos são evitados em código profissional porque diminuem o encapsulamento, permitindo que qualquer parte do programa altere diretamente os dados de uma classe. Isso pode quebrar regras e deixar o código mais difícil de controlar.

Em sistemas grandes, isso gera acoplamento: várias classes passam a depender diretamente da estrutura interna de outras. Assim, uma simples mudança em um atributo pode exigir alterações em muitos lugares, dificultando a manutenção, os testes e as futuras refatorações. Por isso, geralmente os atributos são private e seu acesso é controlado por métodos.

Resposta com as minhas palavras:

Em Java, normalmente evitamos atributos públicos porque eles deixam qualquer parte do sistema alterar os dados diretamente. Isso dificulta o controle das regras da classe. Em sistemas grandes, isso pode gerar muito acoplamento, fazendo com que uma simples mudança em um atributo exija alterações em vários lugares. Por isso, o mais comum é usar atributos private e controlar o acesso por métodos.

Atividade 2:

1. O que aconteceu com o preço do produto quando você chamou setPreco(-50.0)? O atributo
   foi alterado?

R: Saiu mensagem de erro de "Número Negativo" pois dentro do atributo tem um if que nn permite o valor ser negativo, o valor nn foi alterado pois número negativo não foi atribuído para o novo preço 

2. Por que o setter é o lugar correto para validar dados, e não a classe que usa o objeto Produto?

R: O setter é o lugar correto para validar porque ele protege o estado interno do objeto. Assim, qualquer classe que tente alterar o Produto passa pela mesma validação, evitando valores inválidos.

3. Como atribuir o parâmetro ao atributo de uma classe, se eles tiverem o mesmo nome?

R: Quando o parâmetro e o atributo da classe possuem o mesmo nome, usamos a palavra-chave this para diferenciá-los. Por exemplo, em this.nome = nome;, this.nome representa o atributo da classe, enquanto nome representa o parâmetro recebido pelo método. Assim, o valor do parâmetro é atribuído ao atributo correspondente.

4. Com o apoio de uma IA (ex: Claude, ChatGPT, Gemini), pergunte quais
   validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas
   bancários) além de checar valores negativos.

Prompt: quais validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas
bancários) além de checar valores negativos.
faça em texto

Resposta da IA: Em sistemas reais, os setters podem validar várias regras além de valores negativos. Por exemplo, podem verificar se o campo não está vazio ou nulo, se o tamanho do texto é válido, se um e-mail possui formato correto, se uma data é válida, se um preço está dentro de um limite permitido ou se um valor atende às regras do negócio. Em sistemas bancários, também podem existir validações de limite, saldo e dados obrigatórios. O objetivo é impedir que o objeto receba informações inválidas e manter os dados consistentes.

Resposta com minhas palavras: Em sistemas reais, os setters costumam ter algumas validações para evitar que dados errados sejam armazenados. Eles podem verificar, por exemplo, se um campo está vazio, se o texto tem um tamanho adequado, se um e-mail é válido ou se um valor está dentro de um limite permitido. Em sistemas bancários, por exemplo, também podem verificar saldo, limites e outras regras do negócio. A ideia é simples: evitar que informações inválidas entrem no sistema e causem problemas depois.

Atividade 3: 

    






