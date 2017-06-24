package com.identity.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by ajkumar on 4/28/17.
 */
public enum JsonParser{
    INSTANCE;

    public void jsonToObject(){
        ObjectMapper mapper  = new ObjectMapper();

        try {

            String workingDirectory = System.getProperty("user.dir");
            System.out.println(workingDirectory);

            File file = new File(workingDirectory, "src/main/resources/Employee.json");
            System.out.println(file.getAbsolutePath());

            byte[] jsonData = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
            Employee emp = mapper.readValue(jsonData, Employee.class);


            System.out.println("Employee Object\n"+emp);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
