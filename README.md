# Santander-Bootcamp-Java-API
API Restful para exercitar o Spring e aprender a fazer o deploy com Railway
Onde basicamente eu abstraí o perfil do Github bem simplificadamente e a barra onde tem os itens como repositorios e etc

E com deploy no Railway

https://santander-bootcamp-java-api-production.up.railway.app/swagger-ui/index.html#/perfil-usuario-controller/findById

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
