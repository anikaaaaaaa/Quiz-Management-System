import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin {
    public void adminportal() throws IOException, ParseException, IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/quiz.json"));

        Scanner sc = new Scanner(System.in);

        while (true) {

            JSONObject jsonObject = new JSONObject();

            System.out.println("Input your question");
            String question = sc.nextLine();

            System.out.println("Input option 1:");
            String option1 = sc.nextLine();

            System.out.println("Input option 2:");
            String option2 = sc.nextLine();

            System.out.println("Input option 3:");
            String option3 = sc.nextLine();

            System.out.println("Input option 4:");
            String option4 = sc.nextLine();

            System.out.println("What is the answer key?");
            String answerkey = sc.nextLine();

            jsonObject.put("question", question);
            jsonObject.put("option 1", option1);
            jsonObject.put("option 2", option2);
            jsonObject.put("option 3", option3);
            jsonObject.put("option 4", option4);
            jsonObject.put("answerkey", answerkey);

            jsonArray.add(jsonObject);

            FileWriter fw = new FileWriter("./src/main/resources/quiz.json");
            fw.write(jsonArray.toJSONString());
            fw.flush();
            fw.close();

            System.out.println("Saved Successfully!");

            System.out.println("Do you want to add more questions? (s/q)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("q")) {
                break;
            }
        }
    }
}

