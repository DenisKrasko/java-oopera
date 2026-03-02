import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Василий", "Пупкин", Gender.MALE, 190);
        Actor actor2 = new Actor("Мария", "Домрачева", Gender.FEMALE, 175);
        Actor actor3 = new Actor("Каратыш", "Иванович", Gender.MALE, 150);

        Director director1 = new Director("Иосиф", "Виакентович", Gender.MALE, 1023);
        Director director2 = new Director("Анфиса", "Чехова", Gender.FEMALE, 2);

        MusicAuthor musicAuthor = new MusicAuthor("Олег", "Лях", Gender.MALE, 119);

        Choreographer choreographer = new Choreographer("Лев", "Мухов", Gender.MALE, 80);

        Show show = new Show("Царевна на горошине", 128, director1);
        Opera opera = new Opera("Певчихи", 160, director2, musicAuthor, "Либретто для оперы.", 20);
        Ballet ballet = new Ballet("Чёрный лебедь", 122, director1, musicAuthor, "Либретто для балета.", choreographer);

        show.addNewActor(actor1);
        show.addNewActor(actor2);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor(actor3, "Пупкин");
        show.printActors();

        opera.replaceActor(actor1, "Иванович");

        opera.printLibretto();
        ballet.printLibretto();






    }

}
