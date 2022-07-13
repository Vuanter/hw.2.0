public class Slytherin extends Hogwarts {
    private int ambitions;
    private int cunning;
    private int determination;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magic, int transgression, int ambitions, int cunning, int determination, int resourcefulness, int thirstForPower) {
        super(name, magic, transgression);
        this.ambitions = ambitions;
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int ability() { // Сравнение доступно только с участниками Слизерин так как приватный
        return ambitions + cunning + determination + resourcefulness + thirstForPower;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", getName(), slytherin.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", slytherin.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", slytherin.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; Амбициозность: %d; Хитрость: %d; Решительность: %d; Находчивость: %d; Жажда власти: %d", super.toString(), ambitions, cunning, determination, resourcefulness, thirstForPower);
    }
}
