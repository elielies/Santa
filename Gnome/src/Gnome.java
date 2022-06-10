public class Gnome implements Observer{
    private String name;
    private Observable magicBoard;

    public Gnome(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.magicBoard == null) {
            System.out.println("No wish made");
            return;
        }
        String lastWish = this.magicBoard.getUpdate();
        System.out.println(this.name + " saw that Santa wants a " + lastWish);

    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }



}
