package main.java.com.brooklyness.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Aman Mahato
 */
public interface AWSService {

    public void upload(MultipartFile fileName, String bucketName, String nameInAws);
    public List<String> getFileName(Integer userID);
    public void createFolder(String bucketName, String folderName);

}
