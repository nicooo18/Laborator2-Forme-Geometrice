public class Form {
    private String color;
    private static int counter = 0;

    public Form(){
        this.color = "white";
    }

    public Form(String color){
        this.color=color;
    }

    public float getArea(){
        return 0;
    }

    @Override
    public String toString(){
        return "This form has the color:" + color;
    }

    public static int getCounter(){
        return counter;
    }
}
