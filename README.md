# Pokedéx Reativo (๑⚈ ․̫ ⚈๑)
🔥 Sistema de gerenciamento de Pokémons

## Bem vindxs!
A ideia desse repositorio é não somente compartilhar o código construido durante as aulas do minicurso do canal da @anabneri e também documentar os conceitos aprendidos ao longo dessa jornada através de issues:

Aula   | Conceitos aprendidos
--------- | ------
Introdução a programação Reativa| [O que é programação reativa?](https://github.com/leticiacamposs2/pokedex-reativo/issues/1)
Iniciando um projeto WebFlux | [Preparação do ambiente de desenvolvimento](https://github.com/leticiacamposs2/pokedex-reativo/issues/2)
Criando o Model, Repository e configurações do MongoDB | [Classes de negócio e modelagem do banco de dados](https://github.com/leticiacamposs2/pokedex-reativo/issues/3)
Criando o Controller com os métodos GET e POST | [Classes controllers dos métodos da nossa API](https://github.com/leticiacamposs2/pokedex-reativo/issues/4)
Criando os métodos PUT e DELETE | [Edição e removação dos pokemons](https://github.com/leticiacamposs2/pokedex-reativo/issues/5)
Aplicando Testes Unitários e criando um Stream de Eventos | [Testes unitários e stream](https://github.com/leticiacamposs2/pokedex-reativo/issues/6)
Testes locais de Endpoint usando Postman | [Testando a requisição da API](https://github.com/leticiacamposs2/pokedex-reativo/issues/7)
Deploy de uma aplicação Spring na AWS EC2 de modo fácil! | [Deploy da aplicação no AWS](https://github.com/leticiacamposs2/pokedex-reativo/issues/8)

---

## 🚀 API REST
Esta aplicação permite o acesso aos seguintes recursos:

Método | endpoint | retorno
--------- | ------  | ------
GET | /pokemons | lista de todos os pokemons cadastrados
GET | /pokemons/{id} | lista os dados do pokemom especifico do id
POST | /pokemons | salva um pokemon
DELETE| /pokemons/{id} | deleta o pokemon especifico do id
DELETE| /pokemons/events | lista todos os eventos a cada 5 segundos podendo abrir varias abas
