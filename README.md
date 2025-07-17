## Formação Mensageria com Apache Kafka

Aprenda a usar a plataforma de mensageira tipicamente usada em uma arquitetura de Microsserviços. Crie e processe mensagens com alto de desempenho e garantias fortes.

### Apache Kafka

Aprenda a usar a plataforma de mensageira tipicamente usada em uma arquitetura de Microsserviços. Crie e processe mensagens com alto de desempenho e garantias fortes.

O Apache Kafka é uma plataforma de streaming distribuída. Através dele é possível processar uma grande quantidade de dados e entregá-los em tempo real aos seus consumidores.

Usado no LinkedIn, Netflix, Twitter e várias outras empresas o Kafka se tornou a ferramenta principal para criar pipeline de dados e enviar, processar e consumir mensagens de forma distribuída, algo muito comum em aplicações baseadas em Microsserviços.

#### 1. Streams, Cluster e Microsserviços

- Curso 01 - Kafka: Produtores, Consumidores e Streams. ✔
  - Utilize Kafka para comunicação assíncrona.
  - Aprenda a criar microsserviços com Kafka.
  - Entenda as vantagens de Kafka para paralelismo e execução serializada.
  - Entenda como funciona a serialização e deserialização no Kafka.
  - Extraia uma camada de abstração própria com boas práticas.
- Curso 02 - Kafka: Delegate, Evolução e cluster de brokers.
  - Use servidor http como ponto de entrada
  - Evolua os serviços e schemas
  - Faça seu serviço acessar bancos externos
  - Conheça como fazer a replicação de clusters

#### 2. Dead Letter Queue e Garantias de entrega

Agora que você já tem bom conhecimento sobre Kafka e a arquitetura de microserviços avance no uso dela. Replica os seus dados e saiba como lidar com erros no processamento. Aprenda como definir um dead letter queue e tentativas de reenvio. Crie múltiplos tópicos para o mesmo serviço e saiba como obter garantias sobre o envio e entrega de mensagens.

- Curso 03 - Kafka: Batches, Correlation Ids e Dead Letters.
  - Generalize um processo de batch assíncrono
  - Entenda melhor a importância de fast delegate e pontas do sistemas
  - Entenda a importância e implemente um correlation ID
  - Implemente uma versão inicial de deadletter
  - Entenda os problemas de retries assíncronos
- Curso 04 - Kafka: Idempotência e garantias
  - Lide com múltiplos tópicos de envio no mesmo serviço
  - Extraia camadas de serviços
  - Paralelize pools de threads
  - Facilite a criação de novos serviços
  - Entenda como obter garantias relativas ao envio ou entrega das mensagens

#### 3. Integração com Kafka usando Spring

Nesta passo final da formação, você aprenderá a realizar conexão de uma aplicação Spring com Kafka. Também verá como configurar produtor e consumidor, e como fazer outras configurações no Spring, como retentativas.

Em seguida, aprenderemos a processar fluxo de dados com o Kafka Streams. Por fim, conheceremos duas ferramentas muito legais de usar com o Kafka: o Schema Registry e o Kafka Connect.

- Curso 05 - Kafka e Spring: Integrando aplicações e gerenciando fluxo de dados.
  - Realize a integração de aplicações Spring com Kafka
  - Entenda como implementar produtores e consumidores Kafka no Spring
  - Saiba como processar fluxos de dados em tempo real com Kafka Streams
  - Utilize o Kafka Connect e o Schema Registry
  - Aplique configurações avançadas no Spring e Kafka
