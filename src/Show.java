import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println("Режисёр спектакля: " + director + ".");
    }

    public void printActors() {
        System.out.println("Список актёров учавствующих в спектакле:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addNewActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Ошибка! Этот актёр уже есть в данном спектакле.\n");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("Ошибка! Актёра под замену с данной фамилией в данном спектале нет.\n");
    }
}
