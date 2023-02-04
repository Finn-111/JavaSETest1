package day4.decisionmaking;

public class Switch {
    public static void main(String[] args) {
        String animal = "dog";
        switch (animal) {
                case "Cat":
                System.out.println("Cat");
                break;

                case "Cow":
                System.out.println("Cow");
                break;

                case "dog":
                System.out.println("Dog");
                break;

                case "Rabbit":
                System.out.println("Rabbit");
                break;

            default:
                    System.out.println("There is no animal");
        }
    }
}
