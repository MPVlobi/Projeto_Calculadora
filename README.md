# Projeto_Calculadora

# Projeto Calculadora em Java

## Descrição do Projeto

Este projeto consiste na implementação de uma calculadora simples em Java, capaz de realizar operações matemáticas básicas como soma, subtração, multiplicação e divisão.

O sistema foi desenvolvido com foco em organização de código, utilização de métodos puros e documentação utilizando Javadoc.

---

## Objetivo da Atividade

Esta atividade tem como objetivo desenvolver a capacidade prática do aluno na construção, validação, manutenção e documentação de software, aplicando conceitos de:

testes funcionais; testes unitários;tratam ento de erros; refatoração de código; documentação técnica e versionamento de software.

Ao final da atividade, o aluno deverá ser capaz de compreender como práticas de qualidade de software são aplicadas em projetos reais de desenvolvimento, garantindo confiabilidade, organização, legibilidade e facilidade de manutenção do código-fonte.

---

## Tecnologias Utilizadas

- Java (JDK 17 ou superior)
- VS Code 
- Javadoc

---

## Explicação das Operações

A classe `Calculadora` possui os seguintes métodos:

- `somar(int a, int b)`  
  Retorna a soma de dois números.

- `subtrair(int a, int b)`  
  Retorna a subtração entre dois números.

- `multiplicar(int a, int b)`  
  Retorna a multiplicação entre dois números.

- `dividir(int a, int b)`  
  Retorna a divisão entre dois números, com tratamento para divisão por zero.

- `calcular(int a, int b, String operador)`  
  Método principal que utiliza uma estrutura `switch` para determinar qual operação será executada com base no operador informado.

Operadores suportados:

- "+" : soma  
- "-" : subtração  
- "*" : multiplicação  
- "/" : divisão  

---

## Testes Funcionais

Os testes foram realizados na classe `TesteCalculadora`, validando:

- Funcionamento das operações matemáticas
- Execução do método `calcular`
- Tratamento de exceções:
  - Divisão por zero
  - Operador inválido

---
Print do resultado do teste
<img width="1140" height="331" alt="image" src="https://github.com/user-attachments/assets/4e9842c6-ccd3-4ef4-967e-581ad870c80f" />



Exemplo de saída:

Soma (2 + 3): 5  
Subtração (10 - 4): 6  
Multiplicação (3 * 5): 15  
Divisão (8 / 2): 4  
Divisão por zero tratada corretamente  
Operador inválido tratado corretamente  

---

## Documentação JavaDoc

A documentação foi gerada utilizando a ferramenta Javadoc, contendo a descrição das classes e métodos do projeto.

---
Print Javadoc (Calculadora)
<img width="1394" height="850" alt="image" src="https://github.com/user-attachments/assets/7553f698-89a6-44f0-aa1c-9dffb9f7421d" />
Print javadoc (TesteCalculadora)
<img width="1061" height="761" alt="image" src="https://github.com/user-attachments/assets/49b23dc1-4fc3-4104-bcb9-f1b91b00acac" />
Print index Javadoc (HTML)
<img width="1758" height="897" alt="image" src="https://github.com/user-attachments/assets/e5f01258-ea75-4e86-bffb-5fa3a487306b" />

Inserir aqui os prints da documentação gerada (arquivo index.html aberto no navegador).
<img width="1857" height="379" alt="image" src="https://github.com/user-attachments/assets/1140cf7d-dddf-4f80-9554-c0e12eaa117d" />

---

## Link do Repositório

https://github.com/MPVlobi/Projeto_Calculadora/tree/main

---

## Autor

Murilo Vieira
