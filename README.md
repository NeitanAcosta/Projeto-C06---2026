# 🎬 SmartCine - Sistema de Gestão de Cinema

**Projeto Final (NP2) - C06 Programação Orientada a Objetos**  
**Instituição:** Inatel (Instituto Nacional de Telecomunicações)  
**Professor:** Christopher Lima

---

## 📌 Sobre o Projeto

O **SmartCine** é um sistema de gerenciamento de rede de cinemas desenvolvido em Java. O objetivo principal do software é controlar o cadastro de filmes e sessões, além de gerenciar a venda de ingressos (Inteira, Meia e VIP). O grande diferencial técnico é o tratamento de concorrência: o sistema simula múltiplos terminais tentando comprar o mesmo assento simultaneamente, garantindo a integridade dos dados e evitando vendas duplicadas.

Este projeto visa solucionar um problema real de gerenciamento e logística de vendas, aplicando rigorosamente os pilares da Orientação a Objetos.

---

## ⚙️ Critérios de Avaliação

O desenvolvimento deste sistema atende aos 11 critérios oficiais de avaliação da disciplina:

- [x] **01 - Boas Práticas:** Código organizado com nomes significativos, modularização e convenções da linguagem Java (pacotes, encapsulamento, separação de responsabilidades).
- [x] **02 - Classes:** Entidades do sistema (`Filme`, `Sessao`, `Ingresso`, `Cinema`, etc.) com membros, métodos e construtores bem definidos.
- [x] **03 - Herança:** Hierarquia de ingressos — `Ingresso` → `IngressoInteira`, `IngressoMeia`, `IngressoVIP` — utilizando herança para reaproveitamento de código.
- [x] **04 - Polimorfismo:** Sobrescrita do método de cálculo de preço em cada subclasse de ingresso, com comportamento distinto demonstrável em tempo de execução.
- [x] **05 - Interfaces e Classes Abstratas:** Classe abstrata base para `Ingresso` e interfaces para operações de venda e relatório — ambas obrigatoriamente presentes no código.
- [x] **06 - Tratamento de Erros:** Exceções customizadas (ex: `AssentoIndisponivelException`, `SessaoNaoEncontradaException`) para tratamento robusto de erros em tempo de execução.
- [x] **07 - Arquivos ou Banco de Dados:** Leitura e escrita de arquivos via `java.nio` para persistência do histórico de vendas e cadastros.
- [x] **08 - Threads:** Simulação de múltiplos terminais de venda com concorrência controlada via `synchronized`, evitando venda duplicada de assentos.
- [ ] **09 - UML Completo:** Diagrama UML completo da solução disponível na raiz do repositório. *(Pendente)*
- [x] **10 - Repositório:** Projeto hospedado e versionado no GitHub.
- [x] **11 - Relevância ao Curso:** Projeto voltado à área de Engenharia de Software, simulando um sistema real de gestão e automação de vendas.

---

## 🚀 Como Executar

1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/NeitanAcosta/Projeto-C06---2026.git
   ```
