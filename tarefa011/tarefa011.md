# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022
## Padrões de codificação
  * O conceito padrões de codificação tem como finalidade a criação de padrões de escrita que deixe um código legível e consistente para qualquer desenvolvedor conseguir entender e para facilitar a identificação de possíveis erros, algumas sugestões de para a padronização do código são: 
    * convenções de nomenclatura: definir uma padrão que diferencie variável, classe, método e objeto.Ex: variável - letras minúsculas, método - começa com um verbo minúsculo e as demais palavras em camelCase.
    * linhas e espaços em brancos: dar espaçamento entre blocos, depois de vírgulas, etc para facilitar a leitura do código.
    * comentários: definir um padrão para comentários.
    * indentação: separar os níveis de codificação por espaços em branco.
  * Os padrões de codificação são aconselháveis de utilizar quando o desenvolvedor está codificando um projeto com outros, pois ajuda na legibilidade do código.
  * Exemplo de codigo sem e com padrões de codificação:

 
        //Código sem padrão de codificação
        if ((Condition1 && Condition2)  //variáveis com primeira letra maiúscula 
        || (Condition3 && condition4) 
        ||!(condition5 && condition6)) { 
        DoSomethingAboutIt();            //metodo começando com letra maiúscula
        }  //comentário desorganizado

  
  ~~~ 
        //Codigo com padrão de codificação
        if((condition1 && condition2)
            || (condition3 && condition4)      //variáveis com todas as letras minúsculas
            ||!(condition5 && condition6)){    //
            
            doSomethingAboutIt();              //método com primeira letra maiúscula
        }                                      //função indentada
~~~
## Reflexão
* A reflexão é o conceito de examinar e modificar o métodos, classes e interfaces em tempo de execução, ou seja, enquanto o código está sendo executado em vez de funcionar durante a compilação, assim como permite a instanciação de novos objetos e invocação de métodos 
* Esse conceito é usado tradicionalmente para carregar módulos/classes ne um projeto assim como criar as instâncias do mesmo, para obter os atributos públicos de um objeto, durante o teste, é usado para criar objetos simulados durante a inicialização do tempo de execução, assim como criar bibliotecas genéricas para lidar com diferentes formatos sem reimplantação, entre outras aplicações.
* Exemplo de codigo reflexivo:
~~~
//This will load the dll from a static resource such as a DB or File
Assembly searchAssembly = LoadSearchServiceAssemblyFromResource();
// Now we need to find the class in the assembly, this in this instance is simply called "Search"
Type searchType = searchAssembly.GetType(searchAssembly.GetName().Name + "Search");

// If we have found the class
if (searchType != null)
{
    object searchResult = null;
    dynamic classInstance = Activator.CreateInstance(searchType);
    // DoSearch is a method that is declared on both SearchService Classes!
    var searchResult = instance.DoSearch();
}
~~~
## Programação defensiva
* Esse conceito tem como finalidade apresentar práticas que ajudem o desenvolvedor a implementar um código que saiba gerenciar situações não esperadas, assim funcionando adequadamente mesmo em processos imprevistos ou quando entradas inesperadas são feitas por usuários, algumas padrões de tratamento de erros(entradas inesperadas) são: **Converter para o valor válido mais próximo** quando um cálculo pode gerar um valor não esperado como um número que tem que ser positivo mas pode ter um valor abaixo de zero ,  **Retornar um valor padrão para a operação** quando é ele poder ser nulo, **Retornar um código de erro** quando a operação for muito complexa tendo a chance de ocorrer erros em diversos pontos de sua execução ou **Finalizar a aplicação** quando erros não são admissíveis.
* Exemplo de código com programação defensiva:
  ~~~
    //a função já retorna false quando o usuário administrador buscado é nulo, em vez de verificar seu cargo
    //evitando NullReferenceException
    public bool CheckIfAdministrator(long userId) {
      var user = User.LoadById(userId);
    
      if (user == null)
        return false;
        
      return (user.Role == UserRoles.Administrator);
    }
  ~~~
