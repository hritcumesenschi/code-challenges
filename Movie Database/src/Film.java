public class Film {
    int anAparitie;
    String nume;
    Actor[] actori;

    static String stringPrinted = "";

    Film(int anAparitie,String nume,Actor[] actori)
    {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public void actorsAge()
    {
        int i;
        for( i = 0; i < actori.length; i++)
            if(actori[i].varsta > 50)
                if(stringPrinted.contains(nume) == false) //here we check whether we already printed this movie because
                    //we found another 50+ actor before this one
                {
                    System.out.println(nume);
                    stringPrinted +=nume;
                }
    }
}
