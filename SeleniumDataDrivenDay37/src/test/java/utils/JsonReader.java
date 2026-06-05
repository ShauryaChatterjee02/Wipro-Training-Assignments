package utils;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonReader {

    public static Object[][] getJsonData(String path)
            throws Exception {

        String jsonContent =
                new String(Files.readAllBytes(
                        Paths.get(path)));

        JSONArray jsonArray =
                new JSONArray(jsonContent);

        Object[][] data =
                new Object[jsonArray.length()][2];

        for(int i = 0; i < jsonArray.length(); i++) {

            JSONObject object =
                    jsonArray.getJSONObject(i);

            data[i][0] =
                    object.getString("username");

            data[i][1] =
                    object.getString("password");
        }

        return data;
    }
}