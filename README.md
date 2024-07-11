# Planner

O Planner é uma aplicação desenvolvida durante o NLW Journey da Rocketseat, projetada para ajudar o usuário a organizar viagens de trabalho ou lazer. Com o Planner, é possível criar uma viagem, adicionar atividades diárias e gerenciar a participação de convidados de forma simples e eficiente.

## Funcionalidades

- Cadastro de Viagem
    * O usuário cadastra uma viagem informando o local de destino, data de início, data de término, e-mails dos convidados e também seu nome completo e endereço de e-mail.

- Confirmação de Viagem
  * O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem.

- Confirmação de Participação
  * Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem.

- Gerenciamento de Links Importantes
  * Na página do evento, os participantes da viagem podem adicionar links importantes da viagem como reserva do AirBnB, locais para serem visitados, etc.

- Gerenciamento de Atividades
  * Na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário.

- Convite de Novos Participantes
  * Novos participantes podem ser convidados dentro da página do evento através do e-mail e devem passar pelo fluxo de confirmação como qualquer outro convidado.


## Pré-requisitos

- Java JDK 17 ou superior
- Maven

## Dependências Utilizadas

- Spring Boot DevTools
- Spring Data JPA
- Spring Web
- Lombok
- H2 Database
- Flyway Migration

## Como Executar

Para executar o projeto localmente, siga estas instruções:

- Clone este repositório.
- Configure seu ambiente de desenvolvimento com Java e Maven.
- Configure as variáveis de ambiente necessárias, se houver.
- Execute a aplicação usando mvn spring-boot:run

## Configuração do Banco de Dados

O projeto utiliza um banco de dados H2 em memória por padrão. Não é necessário configurar nenhum banco de dados adicional.

## Rotas

## Entidades
  ```json
  [
    {
        "destionation": "Florianópolis, SC",
        "starts_at": "2024-06-25T21:51:54.7342",
        "ends_at": "2024-06-25T21:51:54.7342",
        "emails_to_invite":[
          "mayk.brito@rocketseat.com"
          ],
        "owner_name": "Fernanda Kipper",
        "owner_email": "fernanda.kipper@rocketseat.com"
    }
]
```

## Rotas

| Action                           | Endpoint                                                                             | Description                                           |
|----------------------------      |----------------------------------------------------------------------------          |-------------------------------------------------------|
| Recupera Detalhes da Viagem      | [http://localhost:8080/](http://localhost:8080/trip/{id})                            | ********                                              |
| Recupera Participantes da Viagem | [http://localhost:8080/create](http://localhost:8080/trip/{id}/participants)         | ********                                              |
| Recupera Atividades da Viagem    | [http://localhost:8080/delete/{id}](http://localhost:8080/trip/{id}/activities)      | ********                                              |
| Recupera Links da Viagem         | [http://localhost:8080/](http://localhost:8080/trip/{id}/links)                      | ********                                              |
| Confirma Viagem                  | [http://localhost:8080/create](http://localhost:8080/trip/{id}/confirm)              | ********                                              |
| Confirma Participante            | [http://localhost:8080/delete/{id}](http://localhost:8080/participants/{id}/confirm) | ********                                              |
| Convida Participante             | [http://localhost:8080/](http://localhost:8080/trip/{id}/invite)                     | ********                                              |
| Registra Atividade               | [http://localhost:8080/create](http://localhost:8080/trip/{id}/activities)           | ********                                              |
| Registra Link                    | [http://localhost:8080/delete/{id}](http://localhost:8080/trip/{id}/links)           | ********                                              |
| Criação de Viagem                | [http://localhost:8080/](http://localhost:8080/trip)                                 | *********                                             |
| Atualização de Viagem            | [http://localhost:8080/create](http://localhost:8080/trip/{id})                      | ********                                              |


## License

This project is licensed under the MIT License.
