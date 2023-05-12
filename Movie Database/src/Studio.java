public class Studio {
    String nume;
    Film[] film;

    Studio(String nume, Film[] film)
    {
        this.film = film;
        this.nume = nume;
    }
    int countFilms() {
        return film.length;
    }

    public void printActorNames() {
        int i;
        for ( i = 0; i < film.length; i++) {
            Actor[] actori = film[i].actori;

            for (int j = 0; j < actori.length; j++) {
                if( actori[j].nume == "actor cu 2 oscaruri") System.out.println(nume + " ");
            }
        }
    }

}
