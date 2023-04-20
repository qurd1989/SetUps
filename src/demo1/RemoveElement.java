package demo1;

import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadataFormat;
import javax.imageio.metadata.IIOMetadataFormatImpl;

public class RemoveElement {

    public static void main(String[] args) {


        String elem = "elem2";
        int policy = IIOMetadataFormat.CHILD_POLICY_SOME;
        MyFormatIml fmt = new MyFormatIml("root", 1, 10);
        fmt.addElement("elem1", "root", policy);
        fmt.addElement(elem, "root", policy);
        fmt.removeElement("elem1");
         boolean gotIAE = false;

         try {
             fmt.getChildPolicy("elem1");
         }catch (IllegalArgumentException e) {
             gotIAE = true;
         }
         if (!gotIAE) {
             throw new RuntimeException("Element is still present!");

         }
         String [] chNAmes = fmt.getChildNames("root");
         if (chNAmes.length != 1) {
             throw new RuntimeException("Root still has more tthan 1 child!");

         }
         if (!elem.equals(chNAmes[0])){
             throw new RuntimeException("Root`s remaining child is incorrect");
         }
    }


    static class MyFormatIml extends IIOMetadataFormatImpl {



        MyFormatIml(String root, int minChild, int maxChild) {
            super(root, minChild,maxChild);
        }

        public  void addElement(String elementName, String parentName, int childPolicy) {
            super.addElement(elementName, parentName, childPolicy);

        }
        public void removeElement(String elementName) {
            super.removeElement(elementName);
        }
        public boolean canNodeAppear(String element, ImageTypeSpecifier imageTypeSpecifier){

            return true;
        }

    }

}
