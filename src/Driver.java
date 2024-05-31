/**
 * Driver class to demonstrate the functionality.
 */
public class Driver
{
    /**
     * The main method to run the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args)
    {
        MusicMedia cd;
        cd = new CompactDisc("Dark Side of the Moon", "Pink Floyd", 10);
        System.out.println(cd.toString());
        cd.play();

        MusicMedia audioFile = new AudioFile("Shape of You", "Ed Sheeran", "shape_of_you.mp3", 320);
        System.out.println(audioFile.toString());
        audioFile.play();

        MusicMedia vinylRecord = new VinylRecord("Abbey Road", "The Beatles", 17, 12, 180);
        System.out.println(vinylRecord.toString());
        vinylRecord.play();
    }
}
