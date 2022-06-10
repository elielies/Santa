public class App {

    public static void main(String[] args) {
        SantaClaus santa = SantaClaus.getInstance();

        Workshop workshop = new Workshop();
        MagicBoard magicBoard = new MagicBoard();
        Observer obs1 = new Gnome("Gnome1");
//        Observer obs2 = new Gnome("Gnome2");

        magicBoard.watchBoard(obs1);

        Command bringMeDolls = new BringDollsCommand(magicBoard);
        Command bringMeBikes = new BringBikesCommand(magicBoard);

        santa.setCommand(bringMeDolls);
        santa.write();
        Toy toy1 = workshop.getToyType("doll");
        toy1.make();


        santa.setCommand(bringMeBikes);
        santa.write();
        Toy toy2 = workshop.getToyType("bike");
        toy2.make();
    }
}
