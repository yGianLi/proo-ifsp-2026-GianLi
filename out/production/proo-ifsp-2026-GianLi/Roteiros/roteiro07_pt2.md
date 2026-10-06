### Exercícios de revisão - Parte II

Atividade 1: Validando um cadastro com String

1. o método trim() ele retorna uma váriavel nova, no código eu fiz dois prints, um sem o método trim() e o outro com. Nos prints, o primeiro print saiu com todos os espaços e no segundo saiu só o conteúdo sem os espaços.

2.  porque mesmo se houver espaços dentro da String, ainda vai contar como caracter e o isEmpty() nn vai conseguir decifrar se tem ou nn algum conteúdo dentro. Já se checar dps do trim(), o trim ele retira todos os espaços existentes na String, se ele retirar esses espaços a String ficará vazia e o isEmpty vai conseguir decifrar se tem ou nn algum conteúdo dentro da String.

3. Apoio da IA

Prompt: por que uma String é uma classe imutável em Java e o que isso implica para métodos como trim(), toUpperCase() e replace().

Resposta da IA: Uma String em Java é imutável porque, internamente, o valor dela é armazenado em um array de caracteres (char[], ou byte[] a partir do Java 9 com o Compact Strings) que é final e nunca é alterado depois que o objeto é criado. Uma vez que uma String existe na memória, seu conteúdo não pode ser modificado — nenhum método da classe muda os bytes/caracteres internos daquele objeto.

Minha resposta: 
Uma `String` em Java é imutável porque, depois que é criada, seu conteúdo não pode ser alterado. Quando tentamos modificar uma `String`, na verdade um novo objeto é criado com o novo valor.

Isso ajuda a evitar alterações inesperadas e permite que o Java reutilize `String`s com segurança na memória.

Atividade 2:

1. O que indexOf('@') retorna se @ não existir?

Retorna -1. É o valor sentinela que o Java usa para indicar "não encontrado" em métodos de busca como indexOf.

2. Diferença entre substring(indice) e substring(0, indice)
   substring(0, indice) — recebe dois argumentos: início (inclusive) e fim (exclusive). Extrai do começo da string até antes de indice. É o que usamos para pegar o usuário (tudo antes do @).
   substring(indice) — recebe um único argumento, que é apenas o índice de início. Extrai daquele ponto até o final da string automaticamente. É o que usamos para pegar o domínio (tudo depois do @, usando posicaoArroba + 1 como início).

Resumindo: a versão com dois parâmetros define um "recorte" com começo e fim específicos; a versão com um parâmetro só define onde começar, e vai até o fim naturalmente.

3. Apoio da IA:

Prompt: Quais exceções o método substring pode lançar em Java? Em quais condições cada uma ocorre? Me dê um exemplo de código com um índice inválido.

Resposta da IA: Exceções do substring em Java

Exceção lançada: StringIndexOutOfBoundsException (unchecked, subclasse de RuntimeException).

Quando ocorre:

Situação	Exemplo
Índice inicial negativo	"Java".substring(-1)
Índice inicial maior que o tamanho da string	"Java".substring(10)
Índice final maior que o tamanho da string	"Java".substring(0, 10)
Índice inicial maior que o final	"Java".substring(3, 1)

Exemplo prático ligado ao exercício do e-mail:

java
String email = "usuariosemarroba.com";
int posicaoArroba = email.indexOf('@'); // retorna -1
email.substring(0, posicaoArroba); // substring(0, -1) → exceção!

Como evitar: validar o índice antes de usar o substring:

java
if (posicaoArroba != -1) {
// extrair normalmente
} else {
System.out.println("E-mail inválido: não contém @");
}

Minha Resposta: O método `substring` pode lançar a exceção `StringIndexOutOfBoundsException` quando os índices informados estão fora dos limites da `String`.

Isso pode acontecer quando o índice é negativo, maior que o tamanho da `String` ou, no caso de `substring(início, fim)`, quando o índice inicial é maior que o final.

Por exemplo, se `indexOf('@')` retornar `-1` porque o `@` não existe, usar esse valor no `substring` causará a exceção. Por isso, é importante verificar se os índices são válidos antes de usar o método.

Atividade 3:

1. equals vs equalsIgnoreCase

linha.equals(outraLinha) → false
linha.equalsIgnoreCase(outraLinha) → true
Diferença: equals() compara caractere por caractere considerando maiúsculas/minúsculas; equalsIgnoreCase() ignora essa diferença de caixa antes de comparar.

2. Comparando com ==

linha == outraLinha → false
Motivo: == em objetos compara referência de memória, não conteúdo. Como são objetos distintos, o resultado é false. Por isso, para comparar o conteúdo de Strings, deve-se sempre usar equals(), nunca ==.

Atividade 4:


