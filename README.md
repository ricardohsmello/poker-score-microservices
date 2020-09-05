# poker-victorys

Poker victorys é um projeto simples que cadastra e pontua um jogador de poker.
Ex:
- João, 15 pontos
- Rubens, 12 pontos ..


Cada um destes projetos rodam independente, cada um em uma porta pré-definida.

# player
### POST /api/player
```json 
    
     {
       "name": "Joao",
       "code": "cod205"
     }
 
```
Posteriormente, acionar o score-producer, passando 
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
 

  
