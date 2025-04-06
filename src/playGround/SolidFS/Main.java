package playGround.SolidFS;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();

        // Step 1: Create the folder and file structure
        Node docs = new Node("Documents", true);
        fs.getCurrent().addChild("Documents", docs);

        Node images = new Node("images", true);
        docs.addChild("images", images);

        Node file = new Node("cat.png", false);
        images.addChild("cat.png", file);

        // Step 2: Navigate through the structure
        fs.cd("Documents");
        fs.pwd(); // /root/Documents

        fs.cd("images");
        fs.pwd(); // /root/Documents/images

        fs.cd("cat.png");
    }
}