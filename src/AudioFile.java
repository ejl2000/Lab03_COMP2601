/**
 * Class representing an audio file.
 *
 * @author Emma Lee, Nancy Yang
 */
class AudioFile extends MusicMedia implements FileManager
{
    private String fileName;
    private int fileSize;

    /**
     * Constructor to initialize title, artist, file name, and file size.
     *
     * @param title    The title of the audio file.
     * @param artist   The artist of the audio file.
     * @param fileName The file name.
     * @param fileSize The file size in bps.
     * @throws IllegalArgumentException if the file name or file size is invalid.
     */
    public AudioFile(final String title,
                     final String artist,
                     final String fileName,
                     final int fileSize)
    {
        super(title, artist);
        if (!isValidFileName(fileName) || !isValidFileSize(fileSize))
        {
            throw new IllegalArgumentException("Invalid file name or file size.");
        }
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    /**
     * Gets the file name.
     *
     * @return The file name.
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * Sets the file name.
     *
     * @param fileName The new file name.
     * @throws IllegalArgumentException if the file name is invalid.
     */
    public void setFileName(final String fileName)
    {
        if (!isValidFileName(fileName))
        {
            throw new IllegalArgumentException("Invalid file name.");
        }
        this.fileName = fileName;
    }

    /**
     * Gets the file size.
     *
     * @return The file size.
     */
    public int getFileSize()
    {
        return fileSize;
    }

    /**
     * Sets the file size.
     *
     * @param fileSize The new file size.
     * @throws IllegalArgumentException if the file size is invalid.
     */
    public void setFileSize(final int fileSize)
    {
        if (!isValidFileSize(fileSize))
        {
            throw new IllegalArgumentException("Invalid file size.");
        }
        this.fileSize = fileSize;
    }

    /**
     * Returns a string representation of the audio file.
     *
     * @return A string containing the title, artist, file name, and file size.
     */
    @Override
    public String toString()
    {
        return "Audio File - " + super.toString() + ", File Name: " + fileName + ", File Size: " + fileSize + " bps";
    }

    /**
     * Plays the audio file.
     */
    @Override
    public void play()
    {
        System.out.println("Playing audio file: " + getTitle() + " by " + getArtist());
    }

    /**
     * Saves the file.
     *
     * @param fileName The name of the file to save.
     */
    @Override
    public void save(final String fileName)
    {
        System.out.println("Saving file: " + fileName);
    }

    /**
     * Deletes the file.
     *
     * @param fileName The name of the file to delete.
     */
    @Override
    public void delete(final String fileName)
    {
        System.out.println("Deleting file: " + fileName);
    }

    /**
     * Validates if the file name is non-empty.
     *
     * @param fileName The file name to validate.
     * @return True if the file name is non-empty, false otherwise.
     */
    private static boolean isValidFileName(final String fileName)
    {
        return fileName != null && !fileName.trim().isEmpty();
    }

    /**
     * Validates if the file size is positive.
     *
     * @param fileSize The file size to validate.
     * @return True if the file size is positive, false otherwise.
     */
    private static boolean isValidFileSize(final int fileSize)
    {
        return fileSize > 0;
    }
}