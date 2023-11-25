# Sobre o projeto

Derma Scan em Java é uma aplicação back-end construída durante em prol da FIAP.
A aplicação consiste em criar uma API para prevenção do cancer.

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Como executar o projeto

## Back end
Pré-requisitos: Java 11
Eclipse JDK

```bash
# clonar repositório
git clone https://github.com/gustavorenedev/DermaScanGS

# Abra o eclipse
# vá em file do eclipse
# opção Import
# Maven
# Existing Maven Projects
# Selecione o projeto
# Finish
# Execute o projeto
```

## Rotas API
Em seu Postman ou Insomnia coloque http://localhost:3000/{insira o Endpoint}

/cadastro-usuario	  GET	Obtém todas os usuarios.
/cadastro-usuario	  POST	Cria uma novo usuario.
/desempenho	        GET	Obtém todos os desempenhos do sistema.
/desempenho 	      POST	Cria uma nova feature de desempenho.
/feedback		        GET	Obtém todos os feedbacks do sistema.
/feedback		        POST	Cria um novo feedback.
/imagem		          GET	Obtém todas as imagens criadas.
/imagem		          POST	Cria uma nova imagem do usuario.
/informacoes	      GET	Obtém todas as informações relacionadas ao cliente.
/informacoes 	      POST	Cria um novo conjunto de informações a partir dos clientes.
/log-usuario		    GET	Obtém todos os logs no sistema.
/log-usuario		    POST	Cria um log no sistema.
/newsletter		      GET	Obtém todas as newsletter cadastradas no sistema.
/newsletter		      POST	Cria uma nova newsletter.
/prontuario		      GET	Obtém todos os prontuários dos usuarios.
/prontuario		      POST	Cria um novo prontuário.
/regiao		          GET	Obtém todas as regiões dos usuarios.
/regiao		          POST	Cria uma nova região por usuário.
/relatorio		      GET	Obtém todos os relatórios já cadastrados.
/relatorio		      POST	Cria um novo relatório.
/resultado		      GET	Obtém todos os resultados cadastrados.
/resultado		      POST	Cria um novo resultado.


E conforme os atributos da VO você coloca em ordem no JSON
