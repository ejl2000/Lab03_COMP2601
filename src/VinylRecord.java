/**
 * Class representing a vinyl record.
 *
 * @author Emma Lee, Nancy Yang
 */
class VinylRecord extends MusicMedia
{
    private final int numberOfTracks;
    private final int size;
    private final int weight;
    public static final int SIZE_TWELVE_INCH = 12;
    public static final int SIZE_TEN_INCH = 10;
    public static final int SIZE_SEVEN_INCH = 7;

    private static final List<Integer> VALID_SIZES = Arrays.asList(12, 10, 7);
    private static final List<Integer> VALID_WEIGHTS_12 = Arrays.asList(140, 180, 200);
    private static final List<Integer> VALID_WEIGHTS_10 = Arrays.asList(100);
    private static final List<Integer> VALID_WEIGHTS_7 = Arrays.asList(40);

    /**
     * Constructor to initialize title, artist, number of tracks, size, and weight.
     *
     * @param title          The title of the vinyl record.
     * @param artist         The artist of the vinyl record.
     * @param numberOfTracks The number of tracks on the vinyl record.
     * @param size           The size of the vinyl record.
     * @param weight         The weight of the vinyl record.
     * @throws IllegalArgumentException if the number of tracks, size, or weight is invalid.
     */
    public VinylRecord(final String title,
                       final String artist,
                       final int numberOfTracks,
                       final int size,
                       final int weight)
    {
        super(title, artist);
        if (!isValidNumberOfTracks(numberOfTracks) || !isValidSize(size) || !isValidWeight(size, weight)) {
            throw new IllegalArgumentException("Invalid number of tracks, size, or weight.");
        }
        this.numberOfTracks = numberOfTracks;
        this.size = size;
        this.weight = weight;
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
            throw new IllegalArgumentException("Invalid number of tracks.");
        }
        this.numberOfTracks = numberOfTracks;
    }

    /**
     * Gets the size.
     *
     * @return The size.
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Sets the size.
     *
     * @param size The new size.
     * @throws IllegalArgumentException if the size is invalid.
     */
    public void setSize(final int size)
    {
        if (!isValidSize(size))
        {
            throw new IllegalArgumentException("Invalid size.");
        }
        this.size = size;
    }

    /**
     * Gets the weight.
     *
     * @return The weight.
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Sets the weight.
     *
     * @param weight The new weight.
     * @throws IllegalArgumentException if the weight is invalid.
     */
    public void setWeight(final int weight)
    {
        if (!isValidWeight(size, weight))
        {
            throw new IllegalArgumentException("Invalid weight.");
        }
        this.weight = weight;
    }

    /**
     * Returns a string representation of the vinyl record.
     *
     * @return A string containing the title, artist, number of tracks, size, and weight.
     */
    @Override
    public String toString()
    {
        return "Vinyl Record - " + super.toString() + ", Number of Tracks: " + numberOfTracks + ", Size: " + size + " inches, Weight: " + weight + " grams";
    }

    /**
     * Plays the vinyl record.
     */
    @Override
    public void play()
    {
        System.out.println("Playing vinyl record: " + getTitle() + " by " + getArtist());
    }

    /**
     * Validates if the number of tracks is positive.
     *
     * @param tracks The number of tracks to validate.
     * @return True if the number of tracks is positive, false otherwise.
     */
    private static boolean isValidNumberOfTracks(final int tracks)
    {
        return tracks > 0;
    }

    /**
     * Validates if the size is valid.
     *
     * @param size The size to validate.
     * @return True if the size is valid, false otherwise.
     */
    private static boolean isValidSize(final int size)
    {
        return VALID_SIZES.contains(size);
    }

    /**
     * Validates if the weight is valid for a given size.
     *
     * @param size   The size of the vinyl record.
     * @param weight The weight of the vinyl record.
     * @return True if the weight is valid for the given size, false otherwise.
     */
    private static boolean isValidWeight(final int size, final int weight)
    {
        if (size == SIZE_TWELVE_INCH)
        {
            return VALID_WEIGHTS_12.contains(weight);
        } else if (size == SIZE_TEN_INCH)
        {
            return VALID_WEIGHTS_10.contains(weight);
        } else if (size == SIZE_SEVEN_INCH)
        {
            return VALID_WEIGHTS_7.contains(weight);
        }
        return false;
    }
}

