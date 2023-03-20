# Introdução ao Git e Github ✍️

### Download Git

**Link para download do Git:** [https://git-scm.com/downloads](https://git-scm.com/downloads)

- **Git Bash** - é um terminal extendido para otimizar o uso do Git.

### Comando Básico Windows

- **cd** - mudar de diretório
- **dir** - listar arquivos e diretórios
- **mkdir** - criar diretórios
- **del/rmdir** - deletar diretórios
- **mv `<arquivo>` `<diretório>`** - mover um arquivo da ORIGEM para o DESTINO

### Comando Básico Unix

- **cd** - mudar de diretório
- **ls** - listar arquivos e diretórios
- **mkdir** - criar diretórios
- **rm -rf** - deletar diretórios
- **mv `<arquivo>` `<diretorio>`** - mover um arquivo da ORIGEM para o DESTINO

### Comandos para gerar Chave SSH

1. **ssh-keygen -t ed25519 -C `<email>`**
2. **eval $(ssh-agent -s)**
3. **cd .ssh**
4. **ssh-add id_ed25519**

### Configurações inicial do autor

- **git config --global user.name `"<user>"`**
- **git config --global user.email `"<email>"`**
- **git config --list**

### Tirar as configurações do autor

- **git config --global --unset user.name**
- **git config --global --unset user.email**

### Comandos Git de inicialização, adicionar e commit

1. **git init** - Iniciar o repositório no git;
2. **git add** - Adiciona o conteúdo do arquivo ao índice ou adiciona uma alteração no diretório ativo;
3. **git status** - Exibe as condições do diretório de trabalho e da área de staging;
4. **git commit -m** - Grava as alterações feitas no repositório.
5. **git log** - Exibe os registros log do commit

### Comando para enviar o repositório local para o remoto

- **git remote add origin `<repositório>`** - Linkar repositório remote com local;
- **git branch -M main** - Permite criar, listar, renomear e excluir ramificações;
- **git remote -v** - Imprimirá a lista de nomes de repositório marcados e, adicionalmente, a URL do repositório correspondente;
- **git push -u origin main** - envia o conteúdo do repositório local para um repositório remoto;

### Comando para puxar do repositório remoto para o local

- **git pull origin main** - puxa o repositório remoto para o local

### Comando para dar suporte a caminhos longos

- **git config `<--system/--global>` core.longpaths `<true/false>`** - suporte para caminhos longos;
