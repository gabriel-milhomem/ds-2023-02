# Software para Processamento de Arquivos CSV

### Demanda
Um software que lê um arquivo no formato CSV e, para cada linha, calcula a soma das duas primeiras colunas e gera um arquivo CSV, contendo as mesmas linhas, mas o arquivo gerado contém uma coluna adicional que a soma obtida para cada linha.

## Principais Funcionalidades

### 1 . Leitura de Arquivos CSV
O software deve ser capaz de ler arquivos CSV de entrada fornecidos pelo usuário. O usuário deve especificar o caminho do arquivo de entrada.

### 2. Cálculo da Soma
Para cada linha do arquivo CSV de entrada, o software deve calcular a soma das duas primeiras colunas. Essas colunas podem conter números inteiros ou decimais.

### 3. Geração de Arquivo de Saída
O software deve gerar um novo arquivo CSV de saída que inclui todas as linhas do arquivo de entrada, além de uma coluna adicional contendo as somas calculadas.

### 4. Tratamento de Erros
O software deve ser capaz de lidar com possíveis erros, como arquivos de entrada ausentes, formatos CSV inválidos ou problemas de cálculo.

## Tecnologias Utilizadas
Para implementar esse software, planejamos utilizar a linguagem de programação Python, devido à sua facilidade de manipulação de arquivos CSV e cálculos matemáticos.

## Estrutura do Código
O código fonte será organizado em várias funções e classes para facilitar a manutenção e expansão futura. As etapas de leitura, cálculo e geração do arquivo CSV serão separadas em funções distintas para melhor modularidade.

### Diagrama de sequência
```mermaid
sequenceDiagram
    actor Usuário
    participant Camada I/O
    participant Regra de Negócio
    Usuário->>Camada I/O: Lê o arquivo de CSV selecionado
    Camada I/O->>Regra de Negócio: Envia os dados lidos
    loop Cálculo
        Regra de Negócio-->>Regra de Negócio: Cálcula a soma das duas primeiras colunas para cada linha
    end
    
    Regra de Negócio->>Camada I/O: Envia os dados calculado
    Camada I/O->>Usuário:Gera o arquivo CSV de saída com a coluna adicional
    
