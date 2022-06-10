public class BringDollsCommand implements  Command {
    private MagicBoard magicBoard;

    public BringDollsCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }
    @Override
    public void execute() {
        System.out.println("--------------------------------------");

        System.out.println("Santa wrote on the magic board that he wants a doll" );

        magicBoard.writeWish("doll");
        magicBoard.setMagicBoard("doll");

    }
}
