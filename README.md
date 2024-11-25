# Projeto: Programação Concorrente - Quiz

Este projeto explora conceitos fundamentais de programação concorrente por meio de exemplos práticos e explicações detalhadas. Focado na análise de uma classe Java utilizada em ambientes de múltiplas threads, o trabalho destaca os desafios de compartilhamento de recursos e condições de corrida.

---

## 📋 Índice
1. [Sobre o Projeto](#sobre-o-projeto)
2. [Questões e Soluções](#questões-e-soluções)
3. [Comentários sobre Programação Concorrente](#comentários-sobre-programação-concorrente)
4. [Estrutura do Código](#estrutura-do-código)
5. [Conclusões](#conclusões)

---

## 🧐 Sobre o Projeto
O projeto utiliza a classe `SharedObjectExample` como exemplo para ilustrar conceitos de programação concorrente em Java. A partir do código fornecido, discutimos as seguintes questões:
1. Como instanciar objetos da classe.
2. Como o compartilhamento de objetos entre threads afeta a execução e a consistência dos dados.

O objetivo é demonstrar como a ausência de sincronização pode levar a problemas como condições de corrida e inconsistências.

---

## ❓ Questões e Soluções

### Questão 1: Como instanciar um objeto da classe `SharedObjectExample`?
A linha correta para instanciar um objeto é:

```java
SharedObjectExample e = new SharedObjectExample(10);
```

O construtor da classe requer um argumento para inicializar o valor compartilhado (`sharedValue`). A alternativa `SharedObjectExample e = new SharedObjectExample();` é inválida, pois a classe não possui um construtor sem argumentos.

---

### Questão 2: Como objetos da classe são compartilhados entre threads?
A afirmativa correta é:

O compartilhamento de objetos da classe SharedObjectExample é definido por quem usa a classe.

Isso significa que o comportamento concorrente depende de como as instâncias da classe são utilizadas. Quando várias threads acessam a mesma instância, é possível que ocorram **condições de corrida**, já que a classe não é thread-safe.

---

## 💡 Comentários sobre Programação Concorrente

### 1. **Condições de Corrida**
Condições de corrida ocorrem quando múltiplas threads acessam e modificam uma variável compartilhada simultaneamente, sem controle adequado. Isso pode levar a resultados inconsistentes ou erros difíceis de reproduzir.

### 2. **Sincronização**
Para tornar a classe `SharedObjectExample` thread-safe, é necessário usar sincronização. Por exemplo, o método `updateValue` poderia ser modificado assim:

public synchronized void updateValue(int newValue) {
    sharedValue = newValue;
}

Isso garante que apenas uma thread execute o método por vez, evitando condições de corrida.

---

## 📂 Estrutura do Código
Estrutura básica do projeto:

.
├── src/
│   ├── SharedObjectExample.java
│   └── Main.java
└── README.md

---

## 📝 Conclusões
Este projeto demonstra a importância de compreender como objetos são compartilhados entre threads e como usar mecanismos de sincronização para evitar problemas de concorrência. A ausência de controle pode levar a inconsistências, enquanto o uso de práticas adequadas, como métodos sincronizados, promove a segurança e previsibilidade.

---