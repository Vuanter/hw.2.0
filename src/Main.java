import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Griffindor harry = generateGriffindor("Гарри Поттер");
        Griffindor ron = generateGriffindor("Рон Уизли");
        Griffindor hermione = generateGriffindor("Гермиона Грэйнджер");
        Ravenclaw zhou = generateRavenclaw("Чжоу Чанг");
        Ravenclaw padma = generateRavenclaw("Падма Патил");
        Ravenclaw marcus = generateRavenclaw("Маркус Белби");
        Slytherin graham = generateSlytherin("Грэхэм Монтегю");
        Slytherin gregory = generateSlytherin("Грегори Гойл");
        Slytherin draco = generateSlytherin("Драко Малфой");
        Hufflepuff сedric = generateHufflepuff("Седрик Диггори");
        Hufflepuff smith = generateHufflepuff("Захария Смит");
        Hufflepuff justin = generateHufflepuff("Джастин Финч-Флетчли");

        harry.print();
        ron.print();
        hermione.print();
        graham.print();
        gregory.print();
        draco.print();
        сedric.print();
        smith.print();
        justin.print();
        zhou.print();
        padma.print();
        marcus.print();

        harry.compareGriffindor(ron);
        draco.compareSlytherin(gregory);
        сedric.compareHufflepuff(smith);
        zhou.compareRavenclaw(padma);

        harry.compareHogwarts(draco);
        draco.compareHogwarts(ron);
        сedric.compareHogwarts(hermione);
        zhou.compareHogwarts(сedric);
    }
    private static Griffindor generateGriffindor(String name) {
        return new Griffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}