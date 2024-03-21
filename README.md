Para fazer a config do Spring framework
- https://start.spring.io/
    - Project: _Maven_
    - Language: _java_ ☕
    - Spring Boot: Version 3.2.3
    - Project MetaData:
      - Group: br.edu.fateclins
      - Artifact: appVitrine
      - Name: appVitrine
      - Description: APP para vitrine Virtual
      - Package Name: br.edu.fateclins.appVitrine
      - Packaging: Jar
      - Java: 17
    - Dependencies:
        - Spring Web
        - Spring Data JPA SQL
        - Validation
        - MySQL Driver


------

- Criação do User no Banco de dados e dando privilegios no banco de dados
  `CREATE USER 'fatec24a'@'localhost' identified by 'aulafatec';
GRANT ALL PRIVILEGES ON bdvitrine24a.* TO 'fatec24a'@'localhost';
FLUSH PRIVILEGES;`
