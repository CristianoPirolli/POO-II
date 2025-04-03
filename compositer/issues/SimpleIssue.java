package compositer.issues;

public class SimpleIssue implements IssuesStructure {
    private String title;
    private String description;
    private String deadline;

    public SimpleIssue(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Tarefa: " + title);
        System.out.println(indent + "Descrição: " + description);
        System.out.println(indent + "Prazo: " + deadline + "\n\n");
    }
}
