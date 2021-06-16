public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria();
        System.out.println("Pizzaria open!");
        System.out.println("Choose your pizza!\n");
        System.out.println(pizzeria.getMENU() + "\n");

        Visitor petr = new Visitor("Петр");
        petr.start();
        Visitor vasiliy = new Visitor("Василий");
        vasiliy.start();
        Visitor ivan = new Visitor("Иван");
        ivan.start();
    }
}
