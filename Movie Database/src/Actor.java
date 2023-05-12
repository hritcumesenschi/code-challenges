public class Actor {
    String nume;
    int varsta;
    Premiu[] premii;

    Actor (String name, int age, Premiu[] premii)
    {
        this.nume = name;
        this.varsta = age;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }
}
