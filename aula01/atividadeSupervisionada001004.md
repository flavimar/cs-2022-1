### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;

  API REST(Representational State Transfer) que em português significa tansferência de estado representacional, também chamada de API RESTful, é uma interface de programação de aplicações (API ou API web) que está em conformidade com as restrições do estilo de arquitetura REST, permitindo a interação com serviços web RESTful. Essa arquitetura foi criada pelo cientista da computação Roy Fielding. O objetivo de uma aplicação API REST é o estabelecimento de um contrato entre um provedor e um usuário de informações, onde faz a busca do o conteúdo exigido pelo consumidor (a chamada) ao produtor (a resposta). Por exemplo, o design da API de um serviço de cursos onlines pode especificar que o usuário forneça seu login(usuario e senha) para o produtor responder com os dados dos cursos viculados ao usuário a partir dos dados do usuário.

  Em outras palavras, ao interagir com um computador ou sistema para recuperar informações ou executar uma função, a API ajudará a comunicar o que você quer ao sistema para que ele entenda e realize o que foi solicitado. 
* As principais características deste conceito (pelo menos umas cinco).

  **cliente-Servidor:** Trata a separação das responsabilidades de interface do usuario(clience) e do banco de dados(servidor) abstraindo a dependência entre os lados e permitindo a evolução desses componentes sem impacto e quebra de contrato.

    **Interface Uniforme:** É a capacidade de diversos sistemas e organizações trabalharem em conjunto de modo que garante que pessoas, organizações e sistemas        computacionais interajam para trocar informações de maneira eficaz e eficiente entre os componentes cliente e servidor. Como o cliente e servidor compartilham da    mesma interface, é necessário estabelecer um contrato para a comunicação entre essas partes. Para isso, há quatro princípios a serem seguidos:
    1) Identificação dos recursos (por exemplo,Swagger);
    2) Representação dos recursos;
    3) Mensagens auto-descritivas;
    4) Componente HATEOAS.

    **Stateless:** Cada requisição acionada entre a comunicação cliente-servidor deve receber uma resposta e caso seja interrompida ou encerrada sem querer será        preciso começar outra, não sendo de responsabilidade do servidor armazenar qualquer tipo de contexto. Isso pode gerar alto tráfego de dados e impacto na            performance da aplicação, porém pode-se utilizar recursos de cache nesses casos.

    **Cache:** É utilizado para melhorar a performance de comunicação entre aplicações, otimizando o tempo de resposta  na comunicação entre cliente-servidor. É de    responsabilidade do servidor controlar as diretivas de cache através do cabeçalho HTTP (HTTP Header), <br>**exemplo:** caso uma comunicação tenha cache entre        aplicações e a chamado de um endpoint seja feito mais de uma vez os dados já estaram salvos na maquina do usuario fazendo com que o servidor não precise buscar      os dados no banco de novo.

    **Camadas:** A separação de responsabilidades é importante nesse modelo de arquitetura pois é sugerido a construção de camadas independentes e auto gerenciadas,    em que cada camada não pode conhecer as demais camadas. Caso ocorra mudanças em uma delas, as demais não serão impactadas. Nesse modelo, o cliente não deve          conectar-se diretamente ao servidor da aplicação, porém de deve ser acionada uma camada de balanceamento de carga para essa responsabilidade.
