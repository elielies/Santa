public interface Observable {
    void watchBoard(Observer observer);
    void stopWatchBoard(Observer observer);

    void notifyObservers();
    String getUpdate();
}
