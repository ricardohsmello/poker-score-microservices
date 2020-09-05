# poker-victorys

Poker victorys é um projeto de estudos voltado para microservice e messageria.

![Quick Start quarkus](https://i.ibb.co/Pj5kjsr/draw-5.png)

Conforme ilustra a imagem, este repositório contém 4 projetos:
- score-producer
- score-consumer
- score-registry
- player

O objetivo é fazer a comunicação entre eles utilizando o spring cloud (Feign) através de messageria com o RabbitMQ.
Cada um destes projetos rodam independente, cada um em uma porta pré-definida.

- O service de player pode ser acionado através do seu endpoint /api/player
- O service de score-registry registra o score final. Para isso, ele faz o acesso ao microserviço de player pra coletar o nome do jogador.
- O score producer e o consumer são responsáveis por controlar a execução das filas.

# Built With
- Java 11
- Spring-boot
- RabbitMQ
- Spring-cloud 
- H2
- Postgresql

# Prerequisites
 - Docker
 - JVM 11 
 - Postgres
 - RabbitMQ
 

  
