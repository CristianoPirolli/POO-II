package compositer.issues;

import java.util.ArrayList;
import java.util.List;

public class CompositeIssue implements IssuesStructure {
    private String title;
    private List<IssuesStructure> subIssues;

    public CompositeIssue(String title) {
        this.title = title;
        this.subIssues = new ArrayList<>();
    }

    public void add(IssuesStructure issue) {
        subIssues.add(issue);
    }

    public void remove(IssuesStructure issue) {
        subIssues.remove(issue);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Group " + title);
        for (IssuesStructure issue : subIssues) {
            issue.print(indent + "  ");
        }
    }
}
