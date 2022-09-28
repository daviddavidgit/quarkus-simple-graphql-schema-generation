import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GalaxyService {

    private List<Film> films = new ArrayList<>();

    public GalaxyService() {

        Film aNewHope = new Film();
        aNewHope.title = "A New Hope";
        aNewHope.releaseDate = LocalDate.of(1977, Month.MAY, 25);
        aNewHope.episodeID = 4;
        aNewHope.director = "George Lucas";

        Film theEmpireStrikesBack = new Film();
        theEmpireStrikesBack.title = "The Empire Strikes Back";
        theEmpireStrikesBack.releaseDate = LocalDate.of(1980, Month.MAY, 21);
        theEmpireStrikesBack.episodeID = 5;
        theEmpireStrikesBack.director = "George Lucas";

        Film returnOfTheJedi = new Film();
        returnOfTheJedi.title = "Return Of The Jedi";
        returnOfTheJedi.releaseDate = LocalDate.of(1983, Month.MAY, 25);
        returnOfTheJedi.episodeID = 6;
        returnOfTheJedi.director = "George Lucas";

        films.add(aNewHope);
        films.add(theEmpireStrikesBack);
        films.add(returnOfTheJedi);
    }

    public List<Film> getAllFilms() {
        return films;
    }

    public Film getFilm(int id) {
        return films.get(id);
    }
}
