# Santander-Bootcamp-Java-API
API Restful para exercitar o Spring e aprender a fazer o deploy com Railway
Onde basicamente eu abstraí o perfil do Github bem simplificadamente e a barra onde tem os itens como repositorios e etc

```mermaid

classDiagram
  class PerfilUsuario {
    - nome: String
    - username: String
    - description: String
  }

  class Itens {
    - icon: String
    - name: String
    - quantity: String
  }

  PerfilUsuario --* Itens
 ```
