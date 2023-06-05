package homeWork;

// 1 уровень сложности: Создайте класс Box, в котором будут три поля: ширина, высота, длина этой коробки. Создайте внутри
// этого класса конструктор, который принимает 3 значения и определяет их в вышеописанные поля, помимо этого в конструкторе
// подсчитывается объём коробки и печатается на экран.
public class Box {

    int l;
    int w;
    int h;

    public Box() {
        System.out.println(125);
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println(l * w * h);

    }

    public static void main(String[] args) {
        Box box = new Box(150, 200, 250);
        Box box1 = new Box(10, 15, 20);
        Box box2 = new Box();


    }
}
