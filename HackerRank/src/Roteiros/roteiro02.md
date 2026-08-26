Java Hello World
Roteiro de Atividades
Nome: Gian Li
Data: 06/08/2026



Atividade 1: Identificando operadores
a. 3 operadores que eu nunca ouvi falar são os operadores especiais: ? ;instanceof ; ->.

b. “?” é um operador ternário (atalho para if-else) , “instanceof “ verifica se um objeto é instância de uma classe ou interface, -> é um operador de seta (usado em expressões Lambda).

c.

Atividade 2: JVM e o princípio Write once, run anywhere
Compilação com javap

PS C:\\Users\\BV3071251\\IdeaProjects\\OlaMundo\\out\\production\\OlaMundo> javap -c Saudacao.class
Compiled from "Saudacao.java"
public class Saudacao {
public Saudacao();
Code:
0: aload\_0
1: invokespecial #1                  // Method java/lang/Object."<init>":()V
4: return

public static void main(java.lang.String\[]);
Code:
0: bipush        20
2: istore\_1
3: ldc           #7                  // String Aluno
5: astore\_2
6: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
9: aload\_2
10: iload\_1
11: invokedynamic #15,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
16: invokevirtual #19                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
19: return
}

Saída do compilador do computador:
Ola, Aluno! Voce tem 20 anos.



b.  esse arquivo contém todo o passo a passo/instruções que a máquina fará para compilar todo o código e transformá-lo em .exe. O componente responsável por transformá-lo é o compilador.



c. Prompt : De uma forma clara e resumida, me explique a diferença entre bytecode, JVM, JRE e JDK.



Resposta da IA:
Aqui está uma explicação simples e resumida:
Bytecode: É o código intermediário gerado pelo compilador Java (.class). Ele não é executado diretamente pelo sistema operacional, mas pela JVM.
JVM (Java Virtual Machine): É a máquina virtual que interpreta ou compila o bytecode para que ele possa ser executado no sistema operacional. Isso permite que um mesmo programa Java funcione em diferentes plataformas.
JRE (Java Runtime Environment): É o ambiente necessário para executar aplicações Java. Inclui a JVM e as bibliotecas essenciais, mas não possui ferramentas para desenvolver programas.
JDK (Java Development Kit): É o kit completo para desenvolver aplicações Java. Inclui a JRE, o compilador (javac) e outras ferramentas de desenvolvimento, como depuração e documentação.



Resumindo:
Bytecode → Código intermediário gerado pelo compilador.
JVM → Executa o bytecode.
JRE → Ambiente para executar programas Java (JVM + bibliotecas).
JDK → Ambiente para desenvolver programas Java (JRE + ferramentas de desenvolvimento).
Resposta com as minhas palavras:

Quando programamos em Java, ele é transformado em Bytecode que é um código intermediário e não consegue ser executado pelo sistema operacional, então utiliza o JVM para isso, que é uma máquina virtual que compila o bytecode, após tudo isso, o JRE é o ambiente responsável por executar aplicações Java. Ela já inclui a JVM e as bibliotecas necessárias para rodar os programas, mas não possui ferramentas para criar ou compilar novos códigos. O JDK é o que vai desenvolver as aplicações Java, que inclui JRE, o compilador javac e outras ferramentas de desenvolvimento como depuração e documentação.



Atividade 3: Criação de repositório no GitHub

https://github.com/yGianLi/proo-ifsp-2026-GianLi



3.2.1:
git add vai adicionar uma nova pasta/arquivo/programação para o repositório do GitHub, já o git commit ele vai "commitar"/ atualizar o código atual, colocar as novas atualizações feita dentro do código. Se colocar apenas o comando git add e fechar o terminal, ele apenas prepara os arquivos na sua máquina. Ele não se conecta à internet nem envia nada para servidores remotos. Os arquivos não são perdidos, eles ficam salvos no histórico do .git, só irão para o GitHub após colocar "git commit" no terminal para que os arquivos subam para o GitHub. O git commit salva as suas alterações apenas no seu computador (repositório local). O git push envia essas mudanças para o site ou servidor na nuvem (repositório remoto). Isso prova que os dois lugares ficam separados e que o seu computador estava com arquivos mais novos que o GitHub.
Prompt para IA(CHATGPT):



3.2.2:

Resposta da IA:
Sua mensagem de commit atual parece ser:

proo-ifsp-2026-GianLi

ou, pelo contexto, talvez você esteja se referindo ao conteúdo inicial do repositório:

# proo-ifsp-2026-GianLi

# Disciplina de POO - Exercicios

Repositório de exercícios da disciplina de Programacao Orientada a Objetos.

Se proo-ifsp-2026-GianLi foi usada como mensagem de commit, ela não segue boas práticas.

Avaliação

❌ Pontos negativos:

Não descreve a alteração realizada.
Não utiliza um prefixo semântico (feat:, docs:, chore:, etc.).
Parece mais o nome do repositório do que uma descrição do commit.
Como melhorar

Se este foi o primeiro commit, algumas opções são:

chore: initialize repository

ou

chore: create initial project structure

Se o commit foi para adicionar o README.md:

docs: add initial README

Se adicionou os primeiros exercícios da disciplina:

feat: add initial POO exercises

ou

feat: add initial object-oriented programming exercises
Minha sugestão

Se você criou o repositório e adicionou o README e a estrutura inicial, eu faria:

chore: initialize repository with README and project structure

Se também já adicionou os exercícios:

feat: add initial POO exercises and README

Essas mensagens seguem o padrão de Conventional Commits:

feat: → nova funcionalidade.
fix: → correção de bug.
docs: → documentação.
chore: → tarefas de manutenção, configuração ou inicialização.
refactor: → refatoração sem alterar comportamento.
test: → adição ou alteração de testes.
style: → alterações de formatação sem impacto na lógica.

Como regra geral, uma boa mensagem de commit deve responder à pergunta: "O que este commit adiciona ou modifica?", em vez de apenas identificar o projeto.





3.2.3:

Foi alterada a mensagem de commit de first commit para docs: adiciona README do projeto, seguindo a convenção de commits semânticos. Mensagens padronizadas facilitam a compreensão e organização do histórico do projeto, especialmente em trabalhos colaborativos.