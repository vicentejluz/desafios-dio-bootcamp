# Introdução ao Git e Github ✍️

### Download Git

**Link para download do Git:** [https://git-scm.com/downloads](https://git-scm.com/downloads)

- **Git Bash** - Terminal estendido para otimizar o uso do Git.

### Comando básico Windows

- **cd** - Mudar de diretório
- **dir** - Listar arquivos e diretórios
- **mkdir** - Criar diretórios
- **del/rmdir** - Deletar diretórios
- **mv `<arquivo>` `<diretório>`** - Mover um arquivo da ORIGEM para o DESTINO

### Comando básico Unix

- **cd** - Mudar de diretório
- **ls** - Listar arquivos e diretórios
- **mkdir** - Criar diretórios
- **rm -rf** - Deletar diretórios
- **mv `<arquivo>` `<diretorio>`** - Mover um arquivo da ORIGEM para o DESTINO

### Comandos para gerar chave SSH

1. **ssh-keygen -t ed25519 -C `<email>`**
2. **eval $(ssh-agent -s)**
3. **cd .ssh**
4. **ssh-add id_ed25519**

### Comandos para gerar chave GPG

1. **gpg --full-generate-key** - Gera a chave;
2. **gpg --list-secret-keys** -- Lista as chaves privadas;
3. **gpg --list-secret-keys --keyid-format=long** - Lista as chaves secretas em formato longo;
4. **gpg --list-keys** - Lista as chaves públicas;
5. **gpg --armor --export `<chave-gpg>`** - Exporta a chave pública com o ID especificado e imprime em formato ASCII armor.

### Comandos para deletar chave GPG

1. **gpg delete-secret-keys `<chave-gpg>`** - Usado para excluir uma chave privada armazenada na chave GPG.
2. **gpg delete-keys `<chave-gpg>`** - Usado para excluir uma chave pública armazenada na chave GPG.

### Configurações do autor

- **git config --global user.name `"<user>"`** - Usado para definir o nome de usuário global no Git;
- **git config --global user.email `"<email>"`** - Usado para definir o email global no Git;
- **git config --global user.signingkey `<chave-gpg>`** - Usado para especificar a chave GPG que deve ser usada para assinar commits no Git;
- **git config --global commit.gpgsign true** - Usado para configurar o Git para assinar automaticamente todos os commits com a chave GPG configurada;
- **git config --list** - Usado para exibir todas as configurações do Git que foram definidas no seu sistema;
- **git config --global --edit** - Usado para abrir o arquivo de configuração global do Git em um editor de texto, permitindo que a edição das configurações do Git manualmente.

### Tirar as configurações do autor

- **git config --global --unset user.name**
- **git config --global --unset user.email**

### Comandos Git de inicialização, adicionar e commit

1. **git init** - Iniciar o repositório no git;
2. **git add** - Adiciona o conteúdo do arquivo ao índice ou adiciona uma alteração no diretório ativo;
3. **git status** - Exibe as condições do diretório de trabalho e da área de staging;
4. **git commit -m** - Grava as alterações feitas no repositório.

### Comando Git commit assinado

- **git commit -m `<mensagem>` -S** - Grava as alterações feitas no repositório (commit verificado (Assinado)).

### Comandos Git de logs

- **git log** - Exibe os registros log do commit;
- **git cat-file -p `<id-commit>`** - Usado para exibir o conteúdo de um objeto do Git.

### Comando para enviar o repositório local para o remoto

- **git remote add origin `<repositório>`** - Usado para adicionar um novo repositório remoto ao seu repositório Git local;
- **git branch -M main** - Permite criar, listar, renomear e excluir ramificações;
- **git remote -v** - Imprimirá a lista de nomes de repositório marcados e, adicionalmente, a URL do repositório correspondente;
- **git push -u origin main** - Envia o conteúdo do repositório local para um repositório remoto;

### Comando para puxar do repositório remoto para o local

- **git pull origin main** - Puxa o repositório remoto para o local

### Comando para dar suporte a caminhos longos

- **git config `<--system/--global>` core.longpaths `<true/false>`** - Suporte para caminhos longos;
