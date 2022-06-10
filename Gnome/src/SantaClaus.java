public class SantaClaus {
    private static SantaClaus instance;

    private SantaClaus() {
        // TODO Auto-generated constructor stub
    }

    public static SantaClaus getInstance() {

        if(instance == null) {
            instance = new SantaClaus();
        }

        return instance;
    }

    // pasted from MagicBoardController
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void write() {
        if(this.command == null) {
            System.out.println("No wish made");
            return;
        }
        this.command.execute();
    }
    // ends from MagicBoardController



    public void writesOnBoard(String toy) {
        System.out.println("Santa wrote on the magic board that he wants a " + toy);
        System.out.println("command-----------------------------");

        if (toy == "doll"){
        }
        if(toy == "bike"){

        }
        if(this.command == null) {
            System.out.println("No wish made");
            return;
        }
        this.command.execute();
    }
}
