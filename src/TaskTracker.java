public class TaskTracker {

    public static void main(String[] args) throws Exception {

        String command = args[0];
        switch (command) {
            case "add":
                System.out.println("add");
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
                System.out.println("comando invalido, tente novamente");
                break;
        }
    }
}
