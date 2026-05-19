# 🎬 SmartCine - Sistema de Gestão de Cinema

[cite_start]**Projeto Final (NP2) - C06 Programação Orientada a Objetos** [cite: 1, 2]  
**Instituição:** Inatel (Instituto Nacional de Telecomunicações)  
[cite_start]**Professor:** Christopher Lima   

---

## 📌 Sobre o Projeto
O **SmartCine** é um sistema de gerenciamento de rede de cinemas desenvolvido em Java. O objetivo principal do software é controlar o cadastro de filmes e sessões, além de gerenciar a venda de ingressos (Inteira, Meia e VIP). O grande diferencial técnico é o tratamento de concorrência: o sistema simula múltiplos terminais tentando comprar o mesmo assento simultaneamente, garantindo a integridade dos dados e evitando vendas duplicadas.

[cite_start]Este projeto visa solucionar um problema real de gerenciamento e logística de vendas [cite: 5][cite_start], aplicando rigorosamente os pilares da Orientação a Objetos[cite: 54].

## ⚙️ Requisitos Técnicos Aplicados
O desenvolvimento deste sistema atende aos seguintes critérios de avaliação da disciplina:

- [x] [cite_start]**Boas Práticas:** Código limpo, modularização e nomes significativos[cite: 12, 15].
- [x] [cite_start]**Estrutura Base:** Classes com atributos, métodos e construtores definidos[cite: 16, 17].
- [x] [cite_start]**Herança & Polimorfismo:** Hierarquia de classes de ingressos com cálculos de valores sobrescritos[cite: 18, 19, 21, 22].
- [x] [cite_start]**Classes Abstratas e Interfaces:** Contratos bem definidos para as entidades do cinema[cite: 24, 25].
- [x] [cite_start]**Tratamento de Erros:** Exceções customizadas (ex: `AssentoIndisponivelException`) para prevenir falhas em tempo de execução[cite: 27, 28].
- [x] [cite_start]**Persistência de Dados:** Uso de Banco de Dados (ou Arquivos) para salvar o histórico de vendas[cite: 30, 33].
- [x] [cite_start]**Threads:** Uso de concorrência (`synchronized`) para simulação de vendas simultâneas[cite: 34, 35].
- [ ] [cite_start]**UML Completo:** O diagrama arquitetural do sistema encontra-se na raiz do repositório[cite: 36, 37, 50]. *(Pendente)*

## 🚀 Como Executar
1. Clone o repositório para sua máquina local:
   ```bash
   git clone [https://github.com/NeitanAcosta/Projeto-C06---2026.git](https://github.com/NeitanAcosta/Projeto-C06---2026.git)
