import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable{
    private List<Observer> observers;
    private String magicBoard;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void watchBoard(Observer observer) {
        this.observers.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void stopWatchBoard(Observer observer) {
        this.observers.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.magicBoard;
    }

    public void setMagicBoard(String magicBoard) {
        this.magicBoard = magicBoard;
        this.notifyObservers();
    }

    public void writeWish(String wish) {
        System.out.println("Last wish on the magic board: " + wish);

    }

}
