Quiz Management System
--
A simple Quiz Management System built in Java where an admin can create quiz questions and a student can attend a quiz consisting of 10 randomly selected questions. After completing the quiz, the student can instantly view their score along with feedback.

Prerequisites
--
To run this project, you need: 
- Basic understanding of Java programming
- Java Development Kit (JDK) installed
- Any Java IDE or text editor such as:
    - IntelliJ IDEA
    - Eclipse
    - VS Code

Features
--
Login System
--
- Users log in using username and password
- Credentials are verified from users.json
- System identifies user role:
    - Admin → Admin Panel
    - Student → Student Panel

Admin Panel
--
- Admin can:
    - Add quiz questions
    - Provide 4 options for each question
    - Set the correct answer
- After adding each question, admin can choose:
    - Continue adding more
    - Quit
- All questions are saved in quiz.json

Student Panel
  --
  - Student can:
    - Start the quiz after login
    - Receive 10 random questions from the question bank
    - Submit answers one by one
  - Scoring:
     - +1 mark for each correct answer
     - Final result shown out of 10
     - Includes a performance comment
   
Project Structure
  --
```  
Quiz Management System  
 ┣  src  
 ┃ ┗  main  
 ┃     ┣  java  
 ┃     ┃   ┣  Login.java  
 ┃     ┃   ┣  Admin.java  
 ┃     ┃   ┗  Student.java  
 ┃     ┗  resources  
 ┃          ┣  users.json  
 ┃          ┗  quiz.json  
```



File Descriptions
--
- **users.json**<br>Stores login credentials and roles (admin/student)
- **quiz.json**<br> Contains:
    - Questions
  - Four options
  -  Correct answer

How It Works
  --
Login Flow
--
1.User enters username & password  <br>
2.System matches data from users.json <br>
3.User is redirected based on role

Admin Workflow
--
1. **Admin enters:**
   - Question  
   - 4 options  
   - Correct answer  

2. Data saved to `quiz.json`

3. Admin chooses to continue or exit

Admin Panel Demo
--


https://github.com/user-attachments/assets/0371f3df-6ddb-4c28-beb8-a8eba9256c5c


Student Workflow
--
1. Student starts exam-
2. System loads 10 random questions
3. Answers are validated instantly
4. Final score is displayed with feedback
   
Student Panel Demo
--
  

https://github.com/user-attachments/assets/ff2815ec-56f5-4228-ae62-d1866084bdde

  
    
      
