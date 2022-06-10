public class BringBikesCommand implements Command {
    private MagicBoard magicBoard;

    public BringBikesCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;

    }
    @Override
    public void execute() {
        System.out.println("--------------------------------------");

        System.out.println("Santa wrote on the magic board that he wants a bike" );
        magicBoard.writeWish("bike");

        magicBoard.setMagicBoard("bike");
    }
}
