public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        return this.name = newName;
    }

    public abstract boolean addCourse(String course);

}
