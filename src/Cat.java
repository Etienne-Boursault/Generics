public class Cat extends Animal{

    private String litterPreference;

    public Cat() {
    }
    public Cat(String name) {
        this.name = name;
    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    @Override
    public void eat(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
