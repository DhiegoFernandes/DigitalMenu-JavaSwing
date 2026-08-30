# DigitalMenu

## Sobre o Projeto
O **DigitalMenu** é um Projeto Integrador desenvolvido para agilizar o atendimento em restaurantes. Trata-se de um sistema de menu inteligente construído com o objetivo de facilitar e modernizar a interação direta entre os clientes e o estabelecimento. 

Através de uma interface intuitiva, clientes (através das mesas) e funcionários (atendentes e administradores) podem realizar e gerenciar pedidos de forma eficiente, diminuindo o tempo de espera e minimizando erros operacionais.

## Funcionalidades Principais
* **Sistema de Autenticação Integrado:** Login com permissões específicas para **Usuários** (Administradores e Atendentes) e login de acesso rápido para **Mesas**.
* **Gestão de Mesas:** Controle em tempo real do status de cada mesa no restaurante (Ex: Ativada, Disponível, Ocupada).
* **Cardápio Digital Inteligente:** Visualização clara de produtos que estão sendo adicionados a comanda pelo cliente.
* **Painel Administrativo/Atendimento:** Interface dedicada para funcionários gerenciarem pedidos, atualizarem o cardápio e extraírem relatórios.


## Download do Executável (Windows)


🔗 **[Baixar o Executável (Google Drive)](https://drive.google.com/drive/folders/1kxZ941JOtmXPqbOSU8A1G-hNASL13Z1x?usp=drive_link)**

*(Aviso: O link contém os arquivos compilados para a fácil instalação e testes do projeto).*

## Logins de teste

Para testar o sistema e explorar os diferentes painéis de funcionalidades, utilize as contas pré-configuradas abaixo:

| Perfil de Acesso | Usuário | Senha |
| :--- | :--- | :--- |
| **Administrador** | `admin` | `admin` |
| **Atendente** | `atendente` | `atendente` |
> **Nota:** Senha para sair da tela das mesas: `admin`.



## Tecnologias Utilizadas
* **Linguagem:** Java (versão 17+)
* **Interface Gráfica:** Java Swing
* **Gerenciamento de Dependências:** Maven
* **Banco de Dados:** MySQL
* **Pool de Conexões:** HikariCP
* **Distribuição:** Executável nativo gerado via `jpackage`.

## Como Executar o Projeto (Desenvolvimento)
Caso queira compilar o código fonte e rodar no seu ambiente de desenvolvimento:

1. Faça o git clone ou baixe este projeto.
2. Certifique-se de ter o **Java JDK 17** (ou superior) e o **Maven** instalados na sua máquina.
3. Importe o projeto em sua IDE favorita (IntelliJ IDEA, Eclipse, NetBeans).
4. Configure um banco de dados MySQL local chamado `digitalmenu`.
5. Atualize as credenciais do banco (se necessário) no código-fonte da pasta .
6. Deixe o Maven sincronizar e baixar todas as dependências (`pom.xml`).
7. Execute a aplicação a partir da classe principal: `br.digitalmenu.view.Tela_Login`.

---
Projeto Integrador - DigitalMenu
