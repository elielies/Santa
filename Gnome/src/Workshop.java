public class Workshop {
    public Toy getToyType(String toyType){
        if(toyType == null){
            return null;
        }
        if(toyType.equalsIgnoreCase("doll")){
            return new Doll();

        } else if(toyType.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return null;
    }
}
