package Lesson4.Computer;

public class HDD {
    String name;
    float volume;
    String type;

    public HDD() {
    }

    public HDD(String name, float volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    public void prnt (){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
