import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import classes.TaskObj;

public class TaskTracker {

    private static final String FILE_NOME = "tarefas.json";
    private static List<TaskObj> tasks = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.out.println("Uso: java TaskTracker <comando> [opções]");
            System.out.println("Comandos disponíveis:");
            System.out.println("  add <descricao> <status>       - Adiciona uma nova tarefa.");
            System.out.println("  update <id> <descricao>  - Atualiza uma tarefe pelo ID");
            System.out.println("  delete <id>                   - Apaga um tarefa");
            System.out.println(
                    "  mark-in-progress <id>                    - Marca a Tarefa como em progresso buscando pelo ID");
            System.out.println("  mark-done <id>                    - Marca a Tarefa como concluida buscando pelo ID");
            System.out.println("  list                    - Mostra todas as Tarefas");
            System.out.println("  list done                  - Mostra todas as Tarefas Concluidas");
            System.out.println("  list todo                  - Mostra todas as Tarefas A ser feitas");
            System.out.println("  list in-progress                  - Mostra todas as Tarefas em Progresso");
            return;
        }

        String command = args[0];
        switch (command) {
            case "add":

                try {
                    LocalDate horaAtual = LocalDate.now();
                    TaskObj newTask = new TaskObj(args[1], args[2], horaAtual, horaAtual);
                    tasks.add(newTask);
                    saveTasks();
                    int taskId = tasks.size() - 1;
                    System.out.println("Adicionado com sucesso! ID: " + taskId);
                    System.out.println(newTask.toString());
                    System.out.println(tasks);
                } catch (Exception e) {
                    System.err.println("Erro Tente novamente!");
                }

                break;

            case "update":
                System.out.println("update2");
                break;

            case "delete":
                System.out.println("delete");
                break;

            case "mark-in-progress":
                System.out.println("mark-in-progress");
                break;

            case "mark-done":
                System.out.println("mark-done");
                break;

            case "list":
                System.out.println("list");
                break;

            case "list done":
                System.out.println("list done");
                break;

            case "list todo":
                System.out.println("list todo");
                break;

            case "list in-progress":
                System.out.println("list in-progress");
                break;

            default:
                System.out.println("comando invalido, tente novamente!");
                break;
        }

    }

    //Salvando
    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NOME))) {
            writer.write("[");
            for (int i = 0; i < tasks.size(); i++) {
                writer.write(tasks.get(i).toJson());
                if (i < tasks.size() - 1) {
                    writer.write(",");
                }
            }
            writer.write("]");
        } catch (Exception e) {
            System.err.println("Erro ao salvar tarefas: " + e.getMessage());
        }
    }

    //Lendo
    private static List<TaskObj> loadTasks(){
        List<TaskObj> loadTasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NOME))){
            StringBuilder jsonBuild = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                jsonBuild.append(line);
            }
            String json = jsonBuild.toString();

            if (!json.isBlank()) {
                String[] taskArray = json.substring(1, json.length() - 1).split("\\}, \\{");
                for (String taskJson : taskArray){
                    taskJson = taskJson.startsWith("{") ? taskJson : "{" + taskJson;
                    taskJson = taskJson.endsWith("}") ? taskJson : "}" + taskJson;
                    loadTasks.add(TaskObj.fromJson(taskJson));
                }
            }
        } catch (FileNotFoundException e) {
            // Arquivo não encontrado, retorna lista vazia
        } catch (Exception e) {
            // TODO: handle exception
        }
        return loadTasks;
    }
}
