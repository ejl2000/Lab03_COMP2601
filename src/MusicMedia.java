import java.util.*;

/**
 * Abstract class representing a music media.
 *
 * @author Emma Lee, Nancy Yabg
 */
abstract class MusicMedia
{
    private final String title;
    private final String artist;

    /**
     * Constructor to initialize title and artist.
     *
     * @param title  The title of the music media.
     * @param artist The artist of the music media.
     * @throws IllegalArgumentException if the title or artist is invalid.
     */
    public MusicMedia(final String title, final String artist)
    {
        if (!isValidString(title) || !isValidString(artist))
        {
            throw new IllegalArgumentException("Title and artist must be non-empty strings.");
        }
        this.title = title;
        this.artist = artist;
    }

    /**
     * Gets the title.
     *
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title The new title.
     * @throws IllegalArgumentException if the title is invalid.
     */
    public void setTitle(final String title)
    {
        if (!isValidString(title))
        {
            throw new IllegalArgumentException("Title must be a non-empty string.");
        }
        this.title = title;
    }

    /**
     * Gets the artist.
     *
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Sets the artist.
     *
     * @param artist The new artist.
     * @throws IllegalArgumentException if the artist is invalid.
     */
    public void setArtist(final String artist)
    {
        if (!isValidString(artist))
        {
            throw new IllegalArgumentException("Artist must be a non-empty string.");
        }
        this.artist = artist;
    }

    /**
     * Returns a string representation of the music media.
     *
     * @return A string containing the title and artist.
     */
    @Override
    public String toString()
    {
        return "Title: " + title + ", Artist: " + artist;
    }

    /**
     * Abstract method to play the music media.
     */
    public abstract void play();

    /**
     * Validates if a string is non-empty.
     *
     * @param str The string to validate.
     * @return True if the string is non-empty, false otherwise.
     */
    private static boolean isValidString(final String str)
    {
        return str != null && !str.trim().isEmpty();
    }
}
