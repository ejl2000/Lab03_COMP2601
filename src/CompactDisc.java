/**
 * Class representing a compact disc.
 *
 * @author Emma Lee, Nancy Yang
 * @version 2024
 */
class CompactDisc extends MusicMedia
{
    private final int numberOfTracks;
    private static final int MINIMUM_NUMBER_OF_TRACKS;
    public static final String READING_METHOD;

    static
    {
        READING_METHOD = "laser";
    }

    /**
     * Constructor to initialize title, artist, and number of tracks.
     *
     * @param title          The title of the CD.
     * @param artist         The artist of the CD.
     * @param numberOfTracks The number of tracks on the CD.
     * @throws IllegalArgumentException if the number of tracks is invalid.
     */
    public CompactDisc(final String title, final String artist, final int numberOfTracks)
    {
        super(title, artist);
        if (!isValidNumberOfTracks(numberOfTracks))
        {
            throw new IllegalArgumentException("Number of tracks must be positive.");
        }
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * Gets the number of tracks.
     *
     * @return The number of tracks.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }

    /**
     * Sets the number of tracks.
     *
     * @param numberOfTracks The new number of tracks.
     * @throws IllegalArgumentException if the number of tracks is invalid.
     */
    public void setNumberOfTracks(final int numberOfTracks)
    {
        if (!isValidNumberOfTracks(numberOfTracks))
        {
            throw new IllegalArgumentException("Number of tracks must be positive.");
        }
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * Returns a string representation of the CD.
     *
     * @return A string containing the title, artist, and number of tracks.
     */
    @Override
    public String toString()
    {
        return "CD - " + super.toString() + ", Number of Tracks: " + numberOfTracks;
    }

    /**
     * Plays the CD.
     */
    @Override
    public void play()
    {
        System.out.println("Playing CD: " + getTitle() + " by " + getArtist() + " using " + READING_METHOD);
    }

    /**
     * Validates if the number of tracks is positive.
     *
     * @param tracks The number of tracks to validate.
     * @return True if the number of tracks is positive, false otherwise.
     */
    private static boolean isValidNumberOfTracks(final int tracks)
    {
        return tracks > MINIMUM_NUMBER_OF_TRACKS;
    }
}