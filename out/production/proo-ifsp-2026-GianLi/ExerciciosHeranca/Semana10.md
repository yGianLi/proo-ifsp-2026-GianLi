Atividade 1:
Passo 1
3. Deverá incluir nos códigos, adicionando a "dataAdmissão" como atributo nas classes para que possa seja herdado os dados entre classes.

Passo 6:

| Modificador | Acessível na subclasse? |
|-------------|-------------------------|
| `private`   | **Não.** Só a própria classe acessa. Na subclasse, só via getter/setter público ou protected. |
| `protected` | **Sim.** Acessível diretamente na subclasse (e também por classes do mesmo pacote). |
| `public`    | **Sim.** Acessível na subclasse e em qualquer outra classe. |

## Reflexão e Prática

### 1. Construtor de `Gerente` sem `super(...)` explícito

O código **não compila** (`constructor Funcionario in class Funcionario cannot be applied to given types`).

Todo construtor de subclasse precisa chamar um construtor da superclasse como primeira instrução, para que a parte herdada (`Funcionario`) seja inicializada antes. Sem `super(...)` explícito, o compilador insere automaticamente `super();`, que chama o construtor **sem parâmetros**. Como `Funcionario` só tem um construtor com parâmetros (e o construtor padrão só é gerado quando a classe não declara nenhum), esse construtor não existe e o compilador acusa o erro.

**Correção:** `super(nome, cpf, salario);` como primeira linha do construtor de `Gerente`.

### 2. Origem do `Gerente@1b6d3586` e uso do `@Override`

O método `toString()` vem da classe **`Object`**, da qual toda classe Java herda implicitamente. O `println(g)` chama `g.toString()`; como `Gerente` não o sobrescreveu, roda a versão de `Object`, que retorna `NomeDaClasse@hashEmHexadecimal`.

O `@Override` é recomendado porque faz o compilador **verificar** se o método realmente sobrescreve algo da superclasse. Assim, erros de nome (`tostring()`), assinatura ou tipo de retorno geram erro de compilação, em vez de criar silenciosamente um método novo que o `println` nunca chama. Também deixa a intenção clara para quem lê o código.

### 3. Apoio da IA.

Prompt: quando a herança é uma má escolha de projeto e em que situações a composição seria preferível,
dê um exemplo em Java no contexto de funcionários (ex: um funcionário que pode ter
vários "papéis" ao mesmo tempo).

Resposta da IA: 
## Quando a herança é uma má escolha

Herança modela "é um" e cria acoplamento forte entre subclasse e superclasse. Ela é problemática quando:

- **O papel muda ao longo do tempo:** um desenvolvedor promovido a gerente não pode "trocar de classe" em tempo de execução.
- **Há vários papéis ao mesmo tempo:** Java não permite herança múltipla de classes (`extends Gerente, Desenvolvedor` não existe).
- **As combinações explodem:** `GerenteDesenvolvedor`, `DesenvolvedorMentor`, `GerenteMentor`...
- **A relação não é "é um":** a subclasse herda o que não faz sentido para ela.
- **A superclasse muda muito:** alterações nela quebram as subclasses (classe base frágil).

## Composição: "tem um" em vez de "é um"

O funcionário **tem** uma lista de papéis e delega a eles o que depende do papel.

```java
public interface Papel {
    double calcularBonus(double salario);
}

public class PapelGerente implements Papel {
    @Override
    public double calcularBonus(double salario) { return salario * 0.20; }
}

public class PapelDesenvolvedor implements Papel {
    @Override
    public double calcularBonus(double salario) { return salario * 0.10; }
}

public class Funcionario {
    private double salario;
    private List<Papel> papeis = new ArrayList<>();

    public Funcionario(double salario) { this.salario = salario; }

    public void adicionarPapel(Papel p) { papeis.add(p); }
    public void removerPapel(Papel p)   { papeis.remove(p); }

    public double calcularBonus() {
        double total = 0;
        for (Papel p : papeis) total += p.calcularBonus(salario);
        return total;
    }
}
```

Uso: Ana começa com `PapelDesenvolvedor` (bônus 800.0) e, ao ser promovida, recebe também `PapelGerente` (bônus 2400.0), sem trocar de objeto.

## Vantagens da composição

| Problema da herança | Solução com composição |
|---|---|
| Vários papéis ao mesmo tempo | Adicionar os papéis na lista |
| Mudança em tempo de execução | `adicionarPapel` / `removerPapel` |
| Explosão de subclasses | Cada novo papel é só uma nova classe |
| Acoplamento forte | `Funcionario` depende só da interface `Papel` |

## Regra prática

Use herança para relações **estáveis** de "é um", em que o comportamento da superclasse vale para todas as subclasses. Para comportamento variável, mudança ao longo do tempo ou combinação de características, prefira composição com interfaces (*"favor composition over inheritance"*).

### Resposta com as minhas palavras:
A herança pode ser uma má escolha quando um funcionário pode assumir diferentes papéis ao longo do tempo, como desenvolvedor e gerente, pois não é possível trocar de classe durante a execução do programa. Além disso, o Java não permite herança de várias classes ao mesmo tempo, o que pode gerar muitas subclasses diferentes.

Uma alternativa é usar a composição, em que o funcionário possui papéis que podem ser adicionados ou removidos conforme necessário. Assim, ele pode assumir várias funções sem precisar trocar de objeto.

A principal vantagem é que a composição oferece mais flexibilidade e facilita a manutenção do código. Por isso, a herança é mais indicada para relações estáveis de "é um", enquanto a composição é melhor quando os comportamentos podem mudar ou ser combinados.

