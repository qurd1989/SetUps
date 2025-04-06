package playGround.SolidFS;

import javax.swing.plaf.metal.MetalIconFactory;

public class FileSystem {
    private Node root;
    private Node current;
    public FileSystem() {
        root = new Node("root", true);
        current = root;
    }

    public Node getCurrent() {
        return current;
    }

    public void cdUp() {
        if (current.getParent() != null) {
            current = current.getParent();
        } else {
            System.out.println("Already at root");
        }
    }

    public void pwd() {
        Node temp = current;
        StringBuilder path = new StringBuilder();

        while (temp != null) {
            path.insert(0, "/" + temp.getName());
            temp = temp.getParent();
        }

        System.out.println(path.toString());
    }

    public void cd(String folderName) {
        if (!current.isDirectory()) {
            System.out.println("Current node is not a directory. Cannot perform 'cd'. ");
        }
        Node next  = current.getChild(folderName);

        if (next == null) {
            System.out.println("Folder not found: " + folderName);
            return;
        }
        if (!next.isDirectory()) {
            System.out.println(folderName + " is a file, not a folder. ");
        }
        current = next;
    }
}