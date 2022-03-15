public class ATV extends Vehicle{
    public String color;

    public ATV(String name, int wheels, String color){
        super(name, wheels);
        this.color = color;
    }

    public void getColor(){
        System.out.println("I am " + color);
    }
}
