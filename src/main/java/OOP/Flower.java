package OOP;

public class Flower {
    static String flower_name;
    static String flower_color;

    void leaf(){
        System.out.println(flower_name + " has 5 leaves");
    }

    void color(){
        System.out.println(flower_name + " is " + flower_color);
    }

    public Flower(String flower_name, String flower_color){
        Flower.flower_name = flower_name;
        Flower.flower_color = flower_color;
    }

    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose","Red");
        flower1.leaf();
        flower1.color();

        Flower flower2 = new Flower("Marigold","Yellow");
        flower2.leaf();
        flower2.color();
    }
}
