# metaindustria-backend-sprint1

API REST desenvolvida com Spring Boot para o gerenciamento simples de equipamentos industriais de uma fabrica, como parte da Sprint 1 da disciplina Advanced Programming & Mobile Dev.

## Contexto da Metaindustria

A Metaindustria precisa registrar e acompanhar equipamentos utilizados nas linhas de producao da fabrica. Esta API permite cadastrar, consultar, atualizar e remover equipamentos, mantendo informacoes como setor, status operacional, temperatura atual e data da ultima manutencao.

## Entidade escolhida

Entidade principal: `Equipamento`

### Campos da entidade

- `id`: Long
- `nome`: String
- `setor`: String
- `status`: String
- `temperaturaAtual`: Double
- `dataUltimaManutencao`: LocalDate

## Endpoints disponiveis

- `POST /equipamentos`
- `GET /equipamentos`
- `GET /equipamentos/{id}`
- `PUT /equipamentos/{id}`
- `DELETE /equipamentos/{id}`

## Exemplo de JSON para POST

```json
{
  "nome": "Prensa Hidraulica 01",
  "setor": "Linha de Producao A",
  "status": "ATIVO",
  "temperaturaAtual": 72.5,
  "dataUltimaManutencao": "2026-05-10"
}
```

## Exemplo de JSON para PUT

```json
{
  "nome": "Prensa Hidraulica 01 - Revisada",
  "setor": "Linha de Producao A",
  "status": "MANUTENCAO",
  "temperaturaAtual": 65.0,
  "dataUltimaManutencao": "2026-05-18"
}
```

## Como rodar o projeto

### Requisitos

- Java 17 instalado

### Comandos

```bash
./mvnw spring-boot:run
```

No Windows, voce tambem pode usar:

```powershell
.\mvnw.cmd spring-boot:run
```

Para rodar os testes basicos:

```powershell
.\mvnw.cmd clean test
```

## Como acessar o H2 Console

- URL da aplicacao: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:file:./data/metaindustria`
- User: `sa`
- Password: deixe em branco

## Integrantes do grupo

- Rodrigo Caruzzo Benevides - RM 554665
- Gustavo Demeis Peres - RM 555143
- Caio Tadeu Da Silva Faraleski - RM 558795
- Pedro Alvarez Certo - RM 554603
- Eduardo do Nascimento Souza - RM 558819
