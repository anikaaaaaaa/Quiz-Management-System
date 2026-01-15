import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Student {
    public void studentportal() throws IOException, ParseException {
        Scanner sc=new Scanner(System.in);
        JSONParser jsonParser=new JSONParser();
        JSONArray jsonArray= (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/quiz.json"));
        Collections.shuffle(jsonArray);
        int count=0;
        for(int i=0;i<10;i++){
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            System.out.println(jsonObject.get("question"));
            System.out.println("1. " + jsonObject.get("option 1"));
            System.out.println("2. " + jsonObject.get("option 2"));
            System.out.println("3. " + jsonObject.get("option 3"));
            System.out.println("4. " + jsonObject.get("option 4"));

            String answer = sc.nextLine();
            String correct_ans = jsonObject.get("answerkey").toString();
            if (answer.equals(correct_ans)) {
                count = count + 1;
            }
        }
        if(count>=8){
            System.out.println("Excellent! You have got "+ count +" out of 10");
        }
        else if (count>=5) {
            System.out.println("Good. You have got "+ count +" out of 10");
        }
        else if (count>=3) {
            System.out.println("Very poor! You have got "+ count +" out of 10");

        }
        else if (count>=0) {
            System.out.println("Very sorry you are failed. You have got "+ count +" out of 10");
        }
    }


    }

