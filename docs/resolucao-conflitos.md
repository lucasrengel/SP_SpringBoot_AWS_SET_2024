# Documentação de Resolução de Conflito - Semana 03

## Descrição do Conflito

Depois de fazer as modificações no README da Semana na sua duas branchs, na tentativa de push na branch master, um erro ocorreu porque o repositório remoto tinha mudanças que não estavam presentes na cópia local. O erro foi:

```
Lucas@pc MINGW64 /D/UOL/SP_SpringBoot_AWS_SET_2024 (master)
$ git push
To https://github.com/lucasrengel/SP_SpringBoot_AWS_SET_2024.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/lucasrengel/SP_SpringBoot_AWS_SET_2024.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```

## Resolução do Conflito

### 1. Pull das Mudanças Remotas
Para resolver o problema, foi necessário fazer um git pull:

```
$ git pull
```

Durante o processo de pull, foi necessário fazer um merge, pois o repositório remoto possuía alterações que não estavam na branch local.

### 2. Mensagem de Merge

A mensagem de commit utilizada para resolver o conflito foi:

```
"Resolve conflitos entre as alterações feitas na branch feature/semana-03 e a branch master."
```

### 3. Resolução do Conflito

O arquivo Semana-03/README.md foi editado para resolver o conflito. O conteúdo foi ajustado para combinar os títulos e manter os textos das duas branchs:

```
## Atividade da Semana 03 - Setembro/2024

### Resumo

Essa semana não cheguei ainda. (Trecho da branch `master`)

Essa semana eu tentei aprender algo que não sei ainda je (Trecho da branch `feature/semana-03`)
```

### 4. Finalização do Merge
Após a edição do arquivo para resolver o conflito:

- Adicionar o Arquivo Resolvido:

```
$ git add Semana-03/README.md
```
- Criar um Commit:

```
$ git commit -m "Resolve conflitos entre as alterações feitas na branch `feature/semana-03` e a branch `master`."
```
- Enviar as Alterações para o Repositório Remoto:

```
$ git push origin master
```

##  Ferramentas Utilizadas

Vim: O arquivo do conflito foi editado utilizando vim para resolver as diferenças.
Git: Ferramenta de versionamento utilizada para integrar as mudanças, resolver conflitos e concluir o merge.
GitHub: Plataforma utilizada para hospedar o repositório e colaborar no desenvolvimento do projeto.