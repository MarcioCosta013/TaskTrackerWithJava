# Rastreador de Tarefas

O **Rastreador de Tarefas** é um aplicativo de linha de comando desenvolvido em Java que permite gerenciar suas tarefas diárias de forma eficiente.

## Funcionalidades

- Adicionar, atualizar e excluir tarefas
- Marcar tarefas como "em andamento" ou "concluídas"
- Listar todas as tarefas
- Listar tarefas concluídas
- Listar tarefas pendentes
- Listar tarefas em andamento

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior instalado
- Variável de ambiente `JAVA_HOME` configurada

## Como Compilar e Executar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/MarcioCosta013/TaskTrackerWithJava.git
   cd TaskTrackerWithJava
   ```

2. **Compile o projeto:**

   ```bash
   javac -d bin src/*.java
   ```

3. **Execute o aplicativo:**

   ```bash
   java -cp bin TaskTracker
   ```

## Uso

O aplicativo aceita comandos através de argumentos na linha de comando:

- **Adicionar uma tarefa:**

  ```bash
  java -cp bin TaskTracker add "Descrição da tarefa" "status"
  ```

  Exemplo:

  ```bash
  java -cp bin TaskTracker add "Estudar para o exame" "pendente"
  ```

- **Atualizar uma tarefa:**

  ```bash
  java -cp bin TaskTracker update <id> "Nova descrição" "novo status"
  ```

  Exemplo:

  ```bash
  java -cp bin TaskTracker update 1 "Estudar para o exame de matemática" "em andamento"
  ```

- **Excluir uma tarefa:**

  ```bash
  java -cp bin TaskTracker delete <id>
  ```

  Exemplo:

  ```bash
  java -cp bin TaskTracker delete 1
  ```

- **Listar tarefas:**

  - Todas as tarefas:

    ```bash
    java -cp bin TaskTracker list
    ```

  - Tarefas concluídas:

    ```bash
    java -cp bin TaskTracker list completed
    ```

  - Tarefas pendentes:

    ```bash
    java -cp bin TaskTracker list pending
    ```

  - Tarefas em andamento:

    ```bash
    java -cp bin TaskTracker list in-progress
    ```

## Estrutura do Projeto

```plaintext
TaskTrackerWithJava/
├── bin/                # Arquivos compilados
├── src/                # Código fonte
│   ├── TaskTracker.java
│   └── TaskObj.java
└── README.md           # Documentação
```

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas alterações (`git commit -m 'Adiciona nova feature'`)
4. Faça o push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

___

# Task Tracker

The **Task Tracker** is a command-line application developed in Java that allows you to efficiently manage your daily tasks.

## Features

- Add, update, and delete tasks
- Mark tasks as "in progress" or "completed"
- List all tasks
- List completed tasks
- List pending tasks
- List tasks in progress

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- `JAVA_HOME` environment variable configured

## How to Compile and Run

1. **Clone the repository:**

   ```bash
   git clone https://github.com/MarcioCosta013/TaskTrackerWithJava.git
   cd TaskTrackerWithJava
   ```

2. **Compile the project:**

   ```bash
   javac -d bin src/*.java
   ```

3. **Run the application:**

   ```bash
   java -cp bin TaskTracker
   ```

## Usage

The application accepts commands through command-line arguments:

- **Add a task:**

  ```bash
  java -cp bin TaskTracker add "Task description" "status"
  ```

  Example:

  ```bash
  java -cp bin TaskTracker add "Study for the exam" "pending"
  ```

- **Update a task:**

  ```bash
  java -cp bin TaskTracker update <id> "New description" "new status"
  ```

  Example:

  ```bash
  java -cp bin TaskTracker update 1 "Study for the math exam" "in progress"
  ```

- **Delete a task:**

  ```bash
  java -cp bin TaskTracker delete <id>
  ```

  Example:

  ```bash
  java -cp bin TaskTracker delete 1
  ```

- **List tasks:**

  - All tasks:

    ```bash
    java -cp bin TaskTracker list
    ```

  - Completed tasks:

    ```bash
    java -cp bin TaskTracker list completed
    ```

  - Pending tasks:

    ```bash
    java -cp bin TaskTracker list pending
    ```

  - Tasks in progress:

    ```bash
    java -cp bin TaskTracker list in-progress
    ```

## Project Structure

```plaintext
TaskTrackerWithJava/
├── bin/                # Compiled files
├── src/                # Source code
│   ├── TaskTracker.java
│   └── TaskObj.java
└── README.md           # Documentation
```

## Contribution

1. Fork the project
2. Create a branch for your feature (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.