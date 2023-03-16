
<div align="center">
   <img src="https://user-images.githubusercontent.com/100237670/210073579-42b5a77e-8129-4396-b380-4203c0517dba.png" />
</div>

<p align="center">
   <img src="http://img.shields.io/static/v1?label=React&message=FRAMEWORK&color=blue&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Java&message=17.0.5&color=red&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=Srping%20Boot&message=FRAMEWORK&color=green&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=license&message=MIT&color=yellow&style=for-the-badge" #vitrinedev/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=greeb&style=for-the-badge" #vitrinedev/>
</p>

## <img height="30px" src="https://img.icons8.com/plasticine/100/null/todo-list.png"/> Tópicos
- [Descrição](#-descrição)
- [Funcionalidades](#-funcionalidades)
- [Layout](#-layout-ou-deploy-da-aplicação)
- [Ferramentas Utilizadas](#-ferramentas-utilizadas)
- [Pré Requisitos](#-pré-requisitos)
- [Executar / Testar](#-executar--testar)
- [Licença](#-licença)

## <img src="https://cdn-icons-png.flaticon.com/512/3534/3534033.png" style="widht:30px; height:30px;" /> Descrição

Encut é um encutador de url, para facilitar a memorização, digitação e entre outros fatores que uma url menor pode proporcionar. Como envia em redes sociais, e-mail, curriculo e documentos ocupadando menos espaço.

Obs: esse é apenas a api do projeto o client pode ser encontrado [aqui](https://github.com/ygorfsguilherme/encut-client)


<div align="center">
  <img src="https://img.icons8.com/color/48/null/error--v1.png"/>
      <h2>AVISO: voltado para aprendizado</h2>
  <img src="https://img.icons8.com/color/48/null/error--v1.png"/>
</div>

## <img height="35px" src="https://img.icons8.com/color/96/null/puzzle-matching.png"/> Funcionalidades
- Gera uma nova url curta
- Gera uma url personalizada

## <img height="30px" src="https://img.icons8.com/color/96/null/template.png"/> Layout ou Deploy da Aplicação
- [Figma - Representação das funcionalidades e designer](https://www.figma.com/file/d8qu274P7vIjO6yu163LQy/Encut?node-id=0%3A1&t=2DLsvKm4Y0uahWfE-0)

## <img src="https://cdn-icons-png.flaticon.com/512/1835/1835211.png" style="widht:30px; height:30px;" /> Ferramentas Utilizadas

- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/trello/trello-plain.svg" /> Trello
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" /> Java
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" /> Spring boot
- <img height="20px" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" /> Mysql

Outras tecnologias como, banco de dados H2.

## <img height="35px" src="https://img.icons8.com/fluency/96/null/requirement.png"/> Pré-requisitos
- [Java 17.xx](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.htmlnode)
- [Docker Compose](https://docs.docker.com/compose/)

Obs: O docker é opcional, apenas se deseja roda a aplicação em docker.

## <img src="https://cdn-icons-png.flaticon.com/512/3068/3068553.png" style="widht:30px; height:30px;" /> Executar / Testar

Executando o projeto:

> No terminal, clone o projeto:
```
git clone https://github.com/ygorfsguilherme/encut-server.git
```
> Entre na raiz do projeto:
```
cd encut-server/
```

> Executar o back end no modo desenvolvedor/teste:

```
./gradlew bootRun --args='--spring.profiles.active=dev'
```

Executando em docker

*partindo do principio em que tenha o docker e docker compose instalado.*

> No terminal, clone o projeto:
```
git clone https://github.com/ygorfsguilherme/encut-server.git
```
> Entre na raiz do projeto:
```
cd encut-server/
```

> Executar o back end no modo docker:

```
docker-compose up -d
```


## <img height="30px" src="https://img.icons8.com/external-filled-outline-icons-maxicons/85/null/external-balance-law-and-justice-filled-outline-filled-outline-icons-maxicons.png"/> Licença
Encut é licenciado pelo [MIT License](https://github.com/ygorfsguilherme/encut/blob/main/LICENSE).
