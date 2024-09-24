## Sistema de Xadrez em Java
Este projeto faz parte do curso de Java do Nélio Alves 
O sistema de xadrez foi implementado 
em Java, utilizando princípios de 
programação orientada a objetos.

# Funcionalidades
- Mecânicas básicas do jogo de xadrez (movimento das peças, cheque, cheque-mate).
- Suporte para En Passant e Roque.
- Promoção de peões.
- Impressão do tabuleiro no console.
- Interface simples do jogo no terminal.
- Validação de cor das peças e alternância de turnos.
- Tratamento de movimentos inválidos. 
# Estrutura do Projeto
- O projeto segue uma estrutura organizada utilizando princípios de orientação a objetos:

```
src/
│
├── application/            # Contém a classe principal para executar o sistema.
│
├── boardgame/              # Contém as classes relacionadas ao tabuleiro.
│
├── chess/                  # Contém as classes relacionadas ao jogo de xadrez (regras específicas).
   ├──pieces/               # Contém as classes relacionadas as peças de xadrez
```


# 🔧 Como Executar
Certifique-se de ter o JDK 22 instalado.

Você também vai precisar de uma IDE como Eclipse, IntelliJ IDEA ou Visual Studio Code.

1. Clone o repositório:

```
git clone https://github.com/lucasrengel/SP_SpringBoot_AWS_SET_2024.git
```
2. Vá para a pasta do projeto:

```
cd SP_SpringBoot_AWS_SET_2024/Semana-02/Xadrez/
```

3. Importe o projeto em sua IDE. E
execute a classe principal (Program) localizada no pacote application ou compile ela:
```
javac src/application/Program.java
java src.application.Program
```


# Regras do Jogo
- O sistema segue as regras básicas do xadrez tradicional.
- A impressão do tabuleiro é atualizada a cada movimento.
- Verificações como cheque, cheque-mate, e movimentos especiais (roque, en passant) estão implementadas.

# 🛠️ Ferramentas Usadas
- Java - Linguagem
- JDK 22 - Versão do Java
- Intellij - IDE