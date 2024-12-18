# Rastreador de tarefas
[Link da ideia de projeto](https://roadmap.sh/projects/task-tracker)

##### O Task tracker é um projeto usado para rastrear e gerenciar suas tarefas. Nesta tarefa, você construirá uma interface de linha de comando (CLI) simples para rastrear o que você precisa fazer, o que você fez e no que você está trabalhando atualmente. Este projeto ajudará você a praticar suas habilidades de programação, incluindo trabalhar com o sistema de arquivos, manipular entradas do usuário e construir um aplicativo CLI simples.

#### **Requisitos:**

O aplicativo deve ser executado a partir da linha de comando, aceitar ações e entradas do usuário como argumentos e armazenar as tarefas em um arquivo JSON. O usuário deve ser capaz de:

- Adicionar, atualizar e excluir tarefas
- Marcar uma tarefa como em andamento ou concluída
- Listar todas as tarefas
- Listar todas as tarefas que foram feitas
- Liste todas as tarefas que não foram feitas
- Listar todas as tarefas em andamento

#### Aqui estão algumas restrições para orientar a implementação:

- Você pode usar qualquer linguagem de programação para construir este projeto.
- Use argumentos posicionais na linha de comando para aceitar entradas do usuário.
- Use um arquivo JSON para armazenar as tarefas no diretório atual.
- O arquivo JSON deve ser criado se não existir.
- Use o módulo do sistema de arquivos nativo da sua linguagem de programação para interagir com o arquivo JSON.
- Não use nenhuma biblioteca ou estrutura externa para construir este projeto.
- Certifique-se de lidar com erros e casos extremos com elegância.

#### **Propriedades da tarefa**

Cada tarefa deve ter as seguintes propriedades:

- *id*: Um identificador exclusivo para a tarefa
- *description*: Uma breve descrição da tarefa
- *status*: O status da tarefa ( todo, in-progress, done)
- *createdAt*: A data e a hora em que a tarefa foi criada
- *updatedAt*: A data e a hora em que a tarefa foi atualizada pela última vez
