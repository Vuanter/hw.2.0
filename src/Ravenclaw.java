public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability() { // Сравнение доступно только с участниками Когтевран так как приватный
        return smart + wisdom + wit + creativity;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName(), ravenclaw.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; Интелект: %d; Мудрость: %d; Остроумность: %d; Креативность: %d", super.toString(), smart, wisdom, wit, creativity);
    }
}
