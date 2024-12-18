package debugger_advanced;



public  class Debugger_Advanced {
    static Debugger_Advanced instatnce;
    public static void main(String[] args) {
        System.out.println("Debugger Advanced");
    }
    public static class Cache{
        static Cache instance;
        public static void main(String[] args) {
            System.out.println("Debugger Advanced");
            for(int i = 0; i < 10; i++){
                System.out.println(getInstance(i));
            }
        }

        private static void getInstance1() {
            for (int i = 0; i < 10; i++){
                System.out.println(getInstance(i));
            }
        }
        private static Cache getInstance(int i) {
            if (instance == null){
                instance = new Cache();
            }
            return instance;
        }
    }
}
