import Helper.*;

import static Helper.Sex.FEMALE;
import static Helper.Sex.MALE;

public class Lesson12Program {
    public static void main(String[] args) {
        Human human = new Human("Kate", 18, FEMALE);
        System.out.println(human);
        Human human2= new Human("Li", 23, MALE);
        System.out.println(human2);
//            Person bob = new Employee("Bob", "Bank of America");
//            Person sam = new Client("Sam", "Bank of America");
//            bob.display();
//            sam.display();
//            bob.dinnerTime();
//            sam.dinnerTime();

//        Book b1 = new Book("War and Peace", "L. Tolstoy", Topic.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch (b1.bookType) {
//            case BELLETRE:
//                System.out.println(" Belletre");
//                break;
//            case SCIENCE:
//                System.out.println(" Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println(" Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println(" Phantasy");
//                break;
//        }

//        Operation op = Operation.SUM;
//        System.out.println(op.action(10, 4));   // 14
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));    // 24

//        System.out.println(Color.RED);
//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.BLUE);
//        System.out.println(Color.GREEN.getCode());      // #00FF00

//        Topic[] topics = Topic.values();
//        for (Topic topic :
//                topics) {
//            System.out.println(topic);
//        }
//        //Метод ordinal() повертає порядковый номер константи (нумерація починається з 0):
//        System.out.println(Topic.BELLETRE.ordinal());

//        Day current = Day.MONDAY;
//        System.out.println(current);    // MONDAY

//        Fly plane = new Airplane("Boing 737");
//        plane.flying();
//
//        Fly mosquito = new Mosquito("boring mosquito");
//        mosquito.flying();

//        Figure square = new Figure(0, 1) {
//            @Override
//            public float getPerimeter() {
//                return 5 * 4;
//            }
//
//            @Override
//            public float getArea() {
//                return 5 * 5;
//            }
//        };
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//
//        Figure rectangle = new Rectangle(0, 1, 10, 15);
//        Figure circle = new Circle(-10, -2, 6);
//
//        System.out.println("Rectangle");
//        System.out.println("Area rectangle = " + rectangle.getArea());
//        System.out.println("Perimeter rectangle = " + rectangle.getPerimeter());
//
//        System.out.println("circle");
//        System.out.println("Length circle = " + circle.getPerimeter());
//        System.out.println("Area circle = " + circle.getArea());

//        Employee sam = new Employee("Sam", "Leman Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//
//        Person sam2 = new Employee("Sam", "Leman Brothers");
//        sam2.display();
//        Person bob2 = new Client("Bob", "Leman Brothers");
//        bob2.display();

//        Device printer = new Printer("printer");
//        printer.printDevice();
//
//        Device fax = new Fax("fax");
//        fax.printDevice();
    }
}
