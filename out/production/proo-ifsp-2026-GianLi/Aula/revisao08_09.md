# 📘 Revisão — Programação Orientada a Objetos & UML

---

## 1. Conceitos Básicos

### 🔹 Classe

Uma **classe** é um **tipo abstrato de dados**.

Ela possui:
- **Propriedades** (atributos/dados)
- **Métodos** (funções/comportamentos)

> 💡 Tipos como `String` e `Scanner` também são exemplos de tipos de dados abstratos (classes já prontas do Java).

**Exemplo — Classe `Carro`:**

| Atributos    | Métodos          |
|--------------|------------------|
| `cor`        | `acelerar()`     |
| `motor`      | `virar()`        |
| `tamanho`    | `ligar()`        |
| `modelo`     | `desligar()`     |
| `torque`     | `frear()`        |
| `preco`      |                  |

---

### 🔹 Objeto

Um **objeto** é uma **instância** de uma classe.

```java
Carro fusca = new Carro();   // "fusca" é um objeto
Carro porsche = new Carro(); // "porsche" é um objeto
```

**Outro exemplo — Médico realizando uma Cirurgia:**

```java
Medico m1 = new Medico();
Cirurgia c1 = new Cirurgia();

m1.realizarCirurgia(c1); // chamada de método
```

Aqui, `Medico` e `Cirurgia` são classes, e `realizarCirurgia()` é um **método** da classe `Medico`, que recebe um objeto `Cirurgia` como parâmetro.

---

## 2. Relacionamento de Classes

### 🔹 UML (Unified Modeling Language)

A **UML** é usada para representar visualmente a estrutura de um sistema orientado a objetos, por meio de **diagramas de classes**.

**Um diagrama de classe é representado por um retângulo dividido em três partes:**

1. Nome da Classe
2. Atributos
3. Métodos

**Visibilidade dos membros:**

| Símbolo | Significado |
|:-------:|-------------|
| `-`     | **Privado** |
| `+`     | **Público** |

---

### 📦 Exemplos de Diagramas de Classe

**Classe: `Cirurgia`**

| Atributos     | Métodos        |
|---------------|----------------|
| `- duracao`   | `+ agendar()`  |
| `- risco`     | `+ executar()` |
| `- paciente`  |                |

**Classe: `Medico`**

| Atributos          | Métodos        |
|--------------------|----------------|
| `- nome`           | `+ realizar()` |
| `- especialidade`  |                |

**Relação entre as classes:**

```
Cirurgia ── realizar ──▶ Medico
```

---

## 3. Tipos de Relacionamentos entre Classes

| Tipo                     | Descrição rápida |
|--------------------------|-------------------|
| **Associação**           | Ligação simples entre classes |
| **Agregação**            | Relação "todo-parte" fraca (partes existem independentemente) |
| **Composição**           | Relação "todo-parte" forte (partes dependem do todo) |
| **Herança**              | Uma classe estende outra (relação "é um") |
| **Interfaces / Implementação** | Uma classe implementa um contrato definido por uma interface |

---