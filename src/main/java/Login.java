import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            Scanner sc = new Scanner(System.in);

            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("./src/main/resources/users.json"));
            System.out.println("Enter your username");
            String username = sc.nextLine();
            System.out.println("Enter your password");
            String password = sc.nextLine();

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                String user_name = jsonObject.get("username").toString();
                String pass_word = jsonObject.get("password").toString();
                if (user_name.equals(username) && (pass_word.equals(password))) {
                    String role = jsonObject.get("role").toString();
                    if (role.equals("admin")) {
                        System.out.println("Welcome admin! Please create new questions in the question bank.");
                        Admin admin = new Admin();
                        admin.adminportal();
                    } else if (role.equals("student")) {
                        System.out.println("Welcome salman to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
                        String press = sc.nextLine();
                        if (press.equals("s")) {
                            Student student = new Student();
                            student.studentportal();
                        }

                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        }
    }


