## Como escolher bons nomes ?

### 1. Qual a estrategia que voce atualmente emprega para dar nomes?
Atualmente, eu consulto um repositório chamado [Naming Cheatsheet](https://github.com/kettanaito/naming-cheatsheet/tree/main) (13k stars) que é um simples guia que sintetiza as principais preocupações e boas práticas a serem seguidas durante a hora de escolher nomes, seja variáveis, funções e etc. 

### 2. É uma estratégia intencional ou acidental ?
É uma estratégia intencional, sugere, por exemplo, utilizar o padrão chamado **(P)A/HC/LC** para nomeações de funções e métodos:

```
prefix? + action (A) + high context (HC) + low context? (LC)
```
Exemplo de uso:

| Name                   | Prefix   | Action (A) | High context (HC) | Low context (LC) |
| ---------------------- | -------- | ---------- | ----------------- | ---------------- |
| `getUser`              |          | `get`      | `User`            |                  |
| `getUserMessages`      |          | `get`      | `User`            | `Messages`       |
| `handleClickOutside`   |          | `handle`   | `Click`           | `Outside`        |
| `shouldDisplayMessage` | `should` | `Display`  | `Message`         |                  |

Além disso, o guia exprime certas recomendações como:
- Sempre utilizar a **lingua inglesa**
- Estar consistente com a convenção escolhida seja `camelCase`, `PascalCase` e `snake_case`
- Evitar **abreviações** e **duplicações de contexto**
- Um nome precisa ser **S-I-D** (short, intuitive, descriptive) 

### 3. É consciente ?
Hoje não é consciente, mas a prática e o tempo leva o hábito que leva a consciência. 

Em projetos profissionais é necessário a prática de code review, documentação das convenções escolhidas e o alinhamento entre os programadores, com a finalidade de manter uma codebase consistente e de fácil entendimento.
