package Lesson4.Computer;

public class RAM {
    String name;
    float volume;

    public RAM() {
    }

    public RAM(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }
    public void prnt(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
