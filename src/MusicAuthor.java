public class MusicAuthor extends Person {
    private final int countMusic;

    public MusicAuthor(String name, String surname, Gender gender, int countMusic) {
        super(name, surname, gender);
        this.countMusic = countMusic;
    }
}
