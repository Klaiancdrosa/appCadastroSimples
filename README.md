# **App Cadastro Simples**
&gt; Desenvolvido para cadastrar usuários se a utilização de um banco de dados.

## Descrição
O **Cadastro Simples** permite ao usuário cadastrar a listar os usuários sem a utilização de um banco de dados e sim de um arraylist.

## Funcionalidades
- [x] Entrada de dados (nome, endereço e telefone)
- [x] Interface simples

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **RelativeLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/appCadastroSimples.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.ulbra.appcadastrosimples
│ │ │ │ | ├── MainActivity.java # Atividade aonde ocorre a principal comunicação entre telas e ArrayList.
│ │ │ │ | ├── Registro.java # A classe registro.
│ │ │ │ | ├── TelaCadastroUsuario.java # Atividade aonde ocorre os cadastros dos usuários.
│ │ │ │ | ├── TelaListagemUsuarios.java # Atividade aonde a listagem dos usuários no ArrayList.
│ │ │ │ | ├── TelaPrincipal.java # Atividade que permite a comunicação entra as principais telas.
│ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ │ ├── cadastro_de_usuarios.xml # Layout da tela que permite o cadastro dos usuários
│ │ │ │ | ├── listagem_usuarios_cadastrados.xml # Layout que permite a visualização dos registros contidos nela
│ │ │ │ │ ├── cadastro_de_usuarios.xml # Layout da tela principal que explica e permite a utilização do sistema entre as telas
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **RelativeLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade.

## Telas do Cadastro Simples
**Tela Principal**
Na tela principal, o usuário pode alternar entre o cadastro e o registro dos usuários.

![image](https://github.com/user-attachments/assets/6d092b30-62a0-4564-8e52-78549f25c025)

**Tela de Cadastro**
Na tela de cadastro, o usuário poderá adicionar uma quantidade fixa de registros.

![image](https://github.com/user-attachments/assets/7dbe0537-f474-40ae-9bae-15d0c400b295)

**Tela de Registros**
Na tela de registros, o usuário visualizar os registros cadastrados por ele.

![image](https://github.com/user-attachments/assets/3c7026d4-c3fe-4404-9020-cf64a2718e0b)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
