package compositer.issues;

class Issues implements IssuesStructure{ 
        private String nameIssues;
        
        public Issues(String name) {
            this.nameIssues = name;
        }
    
        @Override
        public void print(String structure) {
            System.out.println(structure + nameIssues);
        }
    
}