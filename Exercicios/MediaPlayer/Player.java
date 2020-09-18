public abstract class Player {
    Player(){

    }

    public void playVideo(){
        loadFiles();
        System.out.println(decoder()); 
        inicialyzePlayer();

    };
    protected void loadFiles(){

        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    protected abstract String decoder();

    protected void inicialyzePlayer(){
        System.out.println("Player has sucefully inicialyzed!");
    };

}
