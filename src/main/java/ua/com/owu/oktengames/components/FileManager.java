package ua.com.owu.oktengames.components;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import ua.com.owu.oktengames.models.Product;

import java.io.File;
import java.io.IOException;

/***
 * This class is created to handle all the work related to saving images' fileNames in database
 * and saving actual files by <code>filesFolderPath</code> to have access to them
 * <code>@Component</code> annotation creates a bean from this class instance,
 * so it can be autowired into other beans and used as a service
 *
 * @param <E> is entity to which images will be saved, has to be subclass of Product abstract class
 */
@Component
public class FileManager<E extends Product> {

    /***
     * Path where all the files will be saved so we will have access to them if needed
     */
    private final String filesFolderPath = "D:" + File.separator +
            "dev" + File.separator +
            "OktenGamesProject" + File.separator +
            "pics" + File.separator;

    public String getFilesFolderPath() {
        return filesFolderPath;
    }

    /***
     * Saves title image's and other screenShots' fileNames from files into entity's table in DB
     * Actual files are then transferred by <code>filesFolderPath</code> and saved there
     * Remember that the very first file in <code>files</code> will be treated as a title file
     *
     * @param files an array of images to be saved in database
     * @param entity Entity class which extends Product class to have all the required properties
     * @throws IOException if files
     */
    public void saveImagesToDatabase(MultipartFile[] files, E entity) throws IOException {
        MultipartFile titleImg = files[0];
        entity.setTitleImgUrl(titleImg.getOriginalFilename());
        transferFileToPath(titleImg, filesFolderPath + titleImg.getOriginalFilename());

        for (int i = 1; i < files.length; ++i) {
            entity.getScreenShotsImgUrl().add(files[i].getOriginalFilename());
            transferFileToPath(files[i], filesFolderPath + files[i].getOriginalFilename());
        }
    }

    /***
     * Saves file by the path
     * @param file to be saved
     * @param path where file will be saved
     * @throws IOException if path is not valid or File could not be created
     */
    private void transferFileToPath(MultipartFile file, String path) throws IOException {
        file.transferTo(new File(path));
    }
}
