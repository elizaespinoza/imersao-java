<div align="right"><img src="https://www.alura.com.br/assets/img/imersao-java/imersao-logo.1655844054.svg" width="24%"></div>

# 🎬 Day 1 - Film stickers maker app 📱💬

Projeto de uma aplicação para consumir uma API de filmes com Java e geração de stickers para o WhatsApp. 
Este projeto está en sendo feito durante a [#ImersãoJava](https://github.com/alura-cursos/imersao-java) da Alura.

## 🔨 Funcionalidades do projeto

- `JsonParser`: Parser que usa expressões regulares para extrair o título (`title`), url da imagem (`poster_path`) e o ranking (`vote_average`). Implementado a partir do [código](https://gist.github.com/alexandreaquiles/8988fc38969d4113d7c289ed1057a459) do Alexandre Aquiles. Lembrando que esta funcionalidade só serve para o The Movie Data Base (TMDB), por conta das expressões regulares para separar os dados úteis para o projeto.

## 🤹 Técnicas, tecnologias e plataformas utilizadas

- [``Java 8, act 333``](https://www.oracle.com/java/technologies/javase/8u333-relnotes.html)
- [``VS Code + Extension Pack for Java``](https://code.visualstudio.com/docs/java/extensions)
- [``Regex101``](https://regex101.com/)
- <img src="https://www.themoviedb.org/assets/2/v4/logos/v2/blue_long_2-9665a76b1ae401a510ec1e0ca40ddcb3b0cfe45f1d51b77a308fea0845885648.svg" width="16%"/> [``API``](https://www.themoviedb.org/documentation/api)

## 🎯 Desafios desta aula
> *Irei fazendo ao meu tempo mas vou listando o checlist proposto:*

- [ ] Colocar a chave da API do TMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.
- [ ] Consumir o endpoint de filmes mais populares da API do TMDB. Procurar também, na documentação da API do TMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
- [ ] Deixar a saída dos dados mais bonitinha: usar [emojis](https://r12a.github.io/app-conversion/) com código UTF-8, mostrar a nota do filme como [estrelinhas](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis), decorar o [terminal com cores, negrito e itálico](https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html) usando códigos ANSI, e mais!
- [ ] Mudar o JsonParser para usar uma biblioteca de parsing de JSON como [Jackson](https://github.com/FasterXML/jackson) ou [Gson](https://www.youtube.com/watch?v=BbI8FdQOKNs).
- [ ] **Desafio supremo:** criar alguma maneira para dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.

## 🛸 Links citados e usados nesta aula:
- Documentação da classe [``HttpRequest`` do pacote ``java.net.http``](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
- Artigo: [*Como deixar no seu GitHub com um README interessante*](https://www.alura.com.br/artigos/escrever-bom-readme).
- [Repo](https://github.com/alura-cursos/imersao-java/tree/aula1) e [site](https://www.alura.com.br/imersao-java/aula) da Imersão em Java da Alura.
- Lista de [APIs públicas e gratuitas](https://publicapis.dev/) para consumir.

## 📁 Acesso ao projeto
Você pode acessar os arquivos da Aula 1 clicando [aqui](https://github.com/elizaespinoza/imersao-java/tree/master/aula1/src).

## 📃 Licença
Este projeto é disponibilizado com a licença MIT. Revise o arquivo [LICENSE](https://github.com/elizaespinoza/imersao-java/blob/master/license) para ver os direitos e as limitações da licença.

## 🙇‍♀️ Obrigada!
A toda equipe e participantes da Imersã, em especial aos Instrutores e Instrutoras da Alura:
- Jacqueline Oliveira
- Alexandre Aquiles
- Paulo Silveira
