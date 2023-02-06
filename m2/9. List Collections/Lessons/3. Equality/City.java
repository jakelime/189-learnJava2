import java.util.Objects;

public class City {

    private String name;
    private long population;


    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }



    // Use Java code generator to generate this snippet using "Generate HashCode and Equals"
    @Override
    public boolean equals(Object o) {
        // DO NOT change signauture, 'object' name! Java needs it
        if (o == this)
            return true;
        if (!(o instanceof City)) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(name, city.name) && population == city.population;
    }

    // Equality contract in Java requires that when you override equals, you MUST override hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }


}
