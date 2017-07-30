package main.java.com.brooklyness.servicesImpl;

import main.java.com.brooklyness.services.AWSService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Aman Mahato
 */
public class AWSServiceImpl implements AWSService {

    @Override
    public void upload(MultipartFile fileName, String bucketName, String nameInAws) {

    }

    @Override
    public List<String> getFileName(Integer userID) {


        return null;
    }

    @Override
    public void createFolder(String bucketName, String folderName) {

    }

}
