### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?

**git version**

2. Qual o efeito da giexecução de cada um dos comandos abaixo?
 * a. git help - 
    **apresenta todos os comandos explicados(sem detalhes) que podem ser excutados no git**
  
 * b. git help checkout -
   **apresenta em uma guia as informações do comando checkout detalhado com exemplos**
  
 * c. git help merge -
    **apresenta em uma guia as informações do comando merge detalhado com exemplos**
  
 * d. git init -
    **cria um novo repositorio git(local)**
  
 * e. git add --all -
    **Coloca todos arquivos (novos, modificados e removidos) no index/stage**
  
 * f. git add -u -
    **Coloca no Stage apenas arquivos modificados e removidos**
  
 * g. git config -l -
     **define os valores de configuração do Git no projeto de nível local**
  
 * h. git mv a.txt b.txt -
      **move ou renomea o a.txt para b.txt**
  
 * i. git reset --hard -
      **desfaz as alterações quaisquer alterações mesmo se estiverem pendentes**
  
 * j. git log -27 -
      **visualiza o historico de alterações das primeiras 27 alterações**
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

**git pull e git push**

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?

**git status**

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

**git status -u**

6. Qual o comando para efetuar um _commit_?

**git commit -m 'Menssagem'**

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?

**git clean**

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

**git rm --cached -r /.metadata**

9. O que acontece se o seu repositório local for acidentalmente removido?

**caso não tenha o repositorio remoto, o repositorio local é totalmente perdido**

10. Como clonar um repositório remoto?

**git clone URL**

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?

**git log --pretty=oneline**

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?

**.git/config**

13. Qual o comando para criar um repositório local?

**git init**

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?

**o nome que está no diretorio**

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)

**git add -u**

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

**embaralha determinado arquivo, imagem ou texto para que seja gerado um conjunto de caracteres identificadores**    

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
    **(HEAD -> main, origin/main, origin/HEAD, mais)**
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
    
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
**git clean -d -f**

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?

**.gitignore**

23. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
24. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
25. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
  **git shortlog -sne**?

**Apresenta um log resumido ordenado do autor com maior quantidade de commits para o menor mostrando a quantidade de commits, o nome do autor e o email**

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
 
**obtem a lista de referências remotas**

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
 
**git tag**

27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?

**git tag -l '2.0\*'**

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

**cria uma tag sem assinatura, com a tad de nome "3.4-gold" e com a mensagem “minha versão ouro”**

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

**mostra os dados da tag 3.4-gold**

30. O que o comando **git push origin 3.4-gold** teria como efeito?

**enviaria a tag 3.4-gold para o repositorio remoto**

31. Após executar um commit, qual o efeito de **git commit --amend**?
32. 
**Abre um arquivo com a decrição do commit e do resultado que o commit teve**

33. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

**caso o git checkout -- ax.txt tenha sido executado, desfaz a alteração do git add x.txt**

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

**desambingua a alteração**

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

**Enquanto o git reset HEAD a.txt desfaz a adição do arquivo a.txt para o HEAD, o git checkout -- a.txt desambigua a alteração**

36. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.














</DIV/>
