package playGround.SolidFS;

import java.util.HashMap;
import java.util.Map;


public class Node {
    private String name;
    private boolean isDirectory;
    private Map<String, Node> children;
    private  Node parent;
    public Node(String name, boolean isDirectory){
        this.name = name;
        this.isDirectory = isDirectory;

        if (isDirectory) {
            this.children = new HashMap<>();
        }
    }
    public Node getParent() {
        return parent;
    }
    public String getName() {
        return name;
    }
    public boolean isDirectory(){
        return isDirectory;
    }

    public boolean hasChild(String name) {
        return isDirectory && children.containsKey(name);
    }
    public Node getChild(String name) {
        if (isDirectory){
            return children.get(name);
        }
        return null;
    }
    public void addChild(String name, Node child) {
        if (isDirectory && !children.containsKey(name)) {
            child.parent = this;
            children.put(name, child);
        }
    }

    // Optional: Remove a child
    public void removeChild(String name) {
        if (isDirectory && children.containsKey(name)) {
            children.remove(name);
        }
    }


//    public void setName(String name) {
//        this.name = name;
//    }



}
