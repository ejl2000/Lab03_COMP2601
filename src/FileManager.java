/**
 * Interface for file management.
 */
interface FileManager
{
    /**
     * Saves the file.
     *
     * @param fileName The name of the file to save.
     */
    void save(final String fileName);

    /**
     * Deletes the file.
     *
     * @param fileName The name of the file to delete.
     */
    void delete(final String fileName);
}
