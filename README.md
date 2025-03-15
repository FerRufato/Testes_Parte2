# Contrato Service

Este projeto é um serviço de gerenciamento de contratos, implementado em Java. Ele inclui testes unitários para garantir a funcionalidade correta dos métodos de serviço.

## Estrutura do Projeto

- `src/br/com/ferufato/testes/ContratoService.java`: Implementação do serviço de contrato.
- `src/br/com/ferufato/testes/ContratoServiceTest.java`: Testes unitários para o serviço de contrato.
- `src/br/com/ferufato/testes/ContratoDaoMock.java`: Mock do DAO de contrato para testes.
- `src/br/com/ferufato/testes/IContratoDao.java`: Interface do DAO de contrato.

## Funcionalidades

- **Salvar**: Salva um novo contrato.
- **Buscar**: Busca um contrato pelo ID.
- **Excluir**: Exclui um contrato pelo ID.
- **Atualizar**: Atualiza um contrato pelo ID.

## Como Executar

1. Clone o repositório:
    ```sh
    git clone https://github.com/FerRufato/Testes_Parte2
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd PS C:\Users\Usuario\IdeaProjects\Tarefa-mod24\src
    ```
3. Compile o projeto:
    ```sh
    javac -d bin src/br/com/ferufato/testes/*.java
    ```
4. Execute os testes:
    ```sh
    java -cp bin org.junit.runner.JUnitCore br.com.ferufato.testes.ContratoServiceTest
    ```

## Dependências

- JUnit 4: Para testes unitários.

## Autor

- FerRufato

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
