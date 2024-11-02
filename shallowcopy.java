class Page {
    String content;

    public Page(String content) {
        this.content = content;
    }
}

class Notebook {
    Page page;

    public Notebook(Page page) {
        this.page = page; // Just copying the reference
    }

    public Notebook shallowCopy() {
        return new Notebook(this.page); // Points to the same page
    }
}

public class Main {
    public static void main(String[] args) {
        Page myPage = new Page("Notes");
        Notebook originalNotebook = new Notebook(myPage);
        Notebook copiedNotebook = originalNotebook.shallowCopy(); // Create a shallow copy

        // Change the content in the copied notebook
        copiedNotebook.page.content = "Updated Notes"; // Change in the copy

        // Both original and copied notebooks reflect the change
        System.out.println(originalNotebook.page.content); // Outputs: Updated Notes
        System.out.println(copiedNotebook.page.content);   // Outputs: Updated NotesS
    }
}
