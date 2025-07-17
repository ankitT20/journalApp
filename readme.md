# Hello welcome to my Journal APP  
### This Journal App is built for **production grade quality** and standards, don't believe me? See the [Source code](src/main/java/net/engineeringdigest/journalApp)     Still not satisfied? See repo on [Sonar Qube Cloud](https://sonarcloud.io/code?id=ankitt20_journalapp)
# See JournalApp Website [ankit.up.railway.app](https://ankit.up.railway.app/journal)
### API IS LIVE
## Import PostMan Collection v2.1
Use PostMan to send API Requests to https://ankit.up.railway.app  
1. Import(Ctrl+O), paste this url:
```
https://raw.githubusercontent.com/ankitT20/journalApp/refs/heads/main/journal.postman_collection.json
```
2. Setup new Environment journalApp, add variable ```domain``` value ```https://ankit.up.railway.app```  
3. Go to Public > signup and enter your details. API Response: 200 OK. Go to Login and enter your details. API Response: 200 OK, body: JWT, copy this JWT  
4. In Environment, add variable ```JWT``` value , paste your JWT  
Test-Experiment-Build-ENJOY🎉🚀  
### Manual Method (NOT RECOMMENDED)  
<details>
<summary>Click to see the process</summary>

0. Setup new Environment journalApp, add variable ```domain``` value ```https://ankit.up.railway.app```  
Add Request:  
1. Health-check: GET ```{{domain}}/journal/public/health-check```  
API Response: 200 OK, body: Ok  
2. SignUp: POST ```{{domain}}/journal/public/signup```  
API Input body: {   "userName":"ram9",   "password":"ram"   }   
API Response: 200 OK  
3. Login: POST ```{{domain}}/journal/public/login```  
API Response: 200 OK, body: JWT  
4. Setup received string as new journalApp variable ```JWT```  
5. Add new journal entry: POST ```{{domain}}/journal/journal```  
Go to Authorization, select Auth Type Bearer Token, Token is {{JWT}}  
Input body:  
```json
{
   "title":"hi, I am ram",
   "content":"good morning",
   "sentiment": "HAPPY"
}
```
API Response: 201 Created, body:  
```json
{    "id": {
        "timestamp": 1746625245,
        "date": "2025-05-07T13:40:45.000+00:00"    },
    "title": "I am ram",
    "content": "HAHAHAHA",
    "date": "2025-05-07T13:40:45.904219329",
    "sentiment": "HAPPY" }
```
6. Add new journal entry: POST ```{{domain}}/journal/journal```
Change Body  
API Response: 201 Created, body: ...  
7. Get All journal Entry: GET ```{{domain}}/journal/journal```  
API Response: 200 OK, body:  
```json
[
    {
        "id": {
            "timestamp": 1746625245,
            "date": "2025-05-07T13:40:45.000+00:00"
        },
        "title": "I am ram",
        "content": "HAHAHAHA",
        "date": "2025-05-07T13:40:45.904",
        "sentiment": "HAPPY"
    },
    {
        "id": {
            "timestamp": 1746625603,
            "date": "2025-05-07T13:46:43.000+00:00"
        },
        "title": "mydiary",
        "content": "this is my second journal",
        "date": "2025-05-07T13:46:43.455",
        "sentiment": "HAPPY"
    }
]
```
Please see documentation for more details, all controllers  
8. Update journal by id: PUT ```{{domain}}/journal/id/67ee715b7eb78e230094a646```  
9. Get journal by Id: GET ```{{domain}}/journal/id/67ee715b7eb78e230094a646```  
10. Delete journal by ID: DELETE ```{{domain}}/journal/id/67ee71b77eb78e230094a647```  
11. User Greetings: GET ```{{domain}}/journal/user```  
12. Update User: PUT ```{{domain}}/journal/user```  
13. Delete User: DELETE ```{{domain}}/user```  
Admin JWT is required for ADMIN API:  
14. Admin Get All User: GET ```{{domain}}/journal/admin/all-users```  
15. Admin Clear cache: GET ```{{domain}}/journal/admin/clear-app-cache```  
16. Admin add admin: POST ```{{domain}}/admin/create-admin-user```  
+more internal...

</details>
  
> [!TIP]
> ### Thanks to Vipul Tyagi for this amazing journey
> ### [Spring Boot Mastery: From Basics to Advanced](https://www.youtube.com/playlist?list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue)
> 
> | # | Topics Covered |
> |---|-------------|
> | 1 | [What is Spring Boot in Hindi \| The Whys and Hows of this Java Marvel!](https://www.youtube.com/watch?v=1993zSY5UBI) |
> | 2 | [Install Java & IntelliJ on Windows 11](https://www.youtube.com/watch?v=QZWCbxm9G28) |
> | 3 | [You can download Spring Boot Project from the zip file in the description](https://www.youtube.com/watch?v=vW-DTk--qEM) |
> | 4 | [Create Spring Boot Project in Intellij \| Create Spring Boot Project with Spring Initializr](https://www.youtube.com/watch?v=d4dcV7Kt3SI) |
> | 5 | [Install maven on windows 11](https://www.youtube.com/watch?v=p0vfKL_pZgo) |
> | 6 | [What is Maven in Java in Hindi \| How Maven Works with Java & Spring Boot: Step-by-Step Explanation](https://www.youtube.com/watch?v=zAmMPM8dIXc) |
> | 7 | [Structure of Spring Boot Application \| What's Inside Your Spring Boot App?](https://www.youtube.com/watch?v=JNzVOpNCcfw) |
> | 8 | [@SpringBootApplication Internal Working \| IOC Container & Dependency Injection in Spring Boot](https://www.youtube.com/watch?v=99M7TJvijUk) |
> | 9 | [Creating REST API using Spring Boot in Hindi \| A Step-by-Step Tutorial](https://www.youtube.com/watch?v=rxT5RFYxjSg) |
> | 10 | [One-Stop Solution: Installing MongoDB on Mac, Lubuntu, Fedora, Windows 11](https://www.youtube.com/watch?v=LtnVqa5dYLA) |
> | 11 | [A Beginner's Walkthrough to MongoDB: Key Concepts Simplified](https://www.youtube.com/watch?v=3Dc8YxC0p-s) |
> | 12 | [Understanding ORM, JPA, and Spring Data JPA: A Step-by-Step Tutorial](https://www.youtube.com/watch?v=ddrCOI0buBA) |
> | 13 | [Step-by-Step Tutorial: How to Integrate MongoDB in Your Spring Boot Application](https://www.youtube.com/watch?v=jvSicVdHKT8) |
> | 14 | [ResponseEntity in Spring Boot in Hindi \| Handling HttpStatus while creating REST API](https://www.youtube.com/watch?v=tWBhE1Cn8D0) |
> | 15 | [Mastering Project Lombok in Java: Simplify Your Code Like a Pro](https://www.youtube.com/watch?v=xmRjF9qycIk) |
> | 16 | [Mastering MongoDB Relationships in Spring Boot: @DBRef Annotation for Seamless Collection Linking!](https://www.youtube.com/watch?v=Cx81dki8BTA) |
> | 17 | [@Transactional Annotation in Spring Boot Example in Hindi \| @Enabletransactionmanagement](https://www.youtube.com/watch?v=6oxyNgZSz9s) |
> | 18 | [Connecting Spring Boot to MongoDB Atlas: A Step-by-Step Tutorial](https://www.youtube.com/watch?v=HjDyv7gL4Wg) |
> | 19 | [This video is for users of Spring Boot versions other than the one covered in the lectures](https://www.youtube.com/watch?v=jJ5qrkMQ6r8) |
> | 20 | [Spring Security in Spring Boot in Hindi \| @EnableWebSecurity Annotation](https://www.youtube.com/watch?v=02WP1FbiNSQ) |
> | 21 | [Adding Authentication to Journal Endpoints](https://www.youtube.com/watch?v=QrCVj8ek83k) |
> | 22 | [Role Based Authorization in Spring Boot Project](https://www.youtube.com/watch?v=LndqWC4yIU4) |
> | 23 | [Properties \| YAML \| How to pass command line arguments in spring boot application ?](https://www.youtube.com/watch?v=rbORgxkBWSk) |
> | 24 | [JUnit Testing in Spring Boot \| @Test @ParameterizedTest @CsvSource @ArgumentsSource @SpringBootTest](https://www.youtube.com/watch?v=mILLHaIjGn4) |
> | 25 | [Mockito Spring Boot Tutorial \| @Mock @InjectMocks](https://www.youtube.com/watch?v=YcAC59cvcV0) |
> | 26 | [Master Spring Boot Profiles: A Comprehensive Guide for Developers - 2025 Update](https://www.youtube.com/watch?v=WRUVixDFI6s) |
> | 27 | [Mastering Logging in Spring Boot: A Complete Guide, from Logback to SLF4J](https://www.youtube.com/watch?v=bphMYrTv8pA) |
> | 28 | [Master SonarQube, SonarLint, and SonarCloud: Ultimate Guide to Enhancing Your Code Quality](https://www.youtube.com/watch?v=iZtA-1zBvzY) |
> | 29 | [Master External API Integration in Spring Boot: A Step-by-Step Guide](https://www.youtube.com/watch?v=95zTDdXbl_Q) |
> | 30 | [Spring Boot Tutorial: How to Consume External POST APIs Effectively](https://www.youtube.com/watch?v=NwADDLFs_SU) |
> | 31 | [Ultimate Guide to Using Eleven Labs API: Transform Text to Lifelike Speech in Minutes!](https://www.youtube.com/watch?v=bvBuqw7Skh0) |
> | 32 | [@component vs @service in Spring Boot](https://www.youtube.com/watch?v=eAoX9wNT3Bo) |
> | 33 | [Mastering @Value in Spring Boot: Inject Properties Like a Pro!](https://www.youtube.com/watch?v=BqIpcX2zlWc) |
> | 34 | [Mastering @PostConstruct in Spring Boot: Complete Guide for Developers](https://www.youtube.com/watch?v=KSrXndTbVVQ) |
> | 35 | [Mastering MongoTemplate, Criteria, and Query in Spring Boot MongoDB](https://www.youtube.com/watch?v=EL2ouT5P4Lc) |
> | 36 | [Send Email Using Spring Boot \| Gmail SMTP \| Java Mail Sender](https://www.youtube.com/watch?v=42rA_GOlLHA) |
> | 37 | [Ultimate Guide to Scheduling Tasks with Cron Jobs in Spring Boot](https://www.youtube.com/watch?v=9aP0qD3jG_8) |
> | 38 | [Adding Sentiment to Journal App](https://www.youtube.com/watch?v=AIgjFvRr820) |
> | 39 | [How to Use Redis in Your Spring Boot Project: Step-by-Step Tutorial](https://www.youtube.com/watch?v=2srQ-RiJHps) |
> | 40 | [How to integrate Redis Cloud with Spring Boot Application](https://www.youtube.com/watch?v=13HUNj8lHC0) |
> | 41 | [What is Kafka ? How to use Confluent Kafka in Spring Boot Application ?](https://www.youtube.com/watch?v=2YnutJ8tNos) |
> | 42 | [Complete JWT Authentication and Authorisation in Spring Boot](https://www.youtube.com/watch?v=qvAoUVXgpZg) |
> | 43 | [Kafka Fallback: What if Kafka doesn't work ?](https://www.youtube.com/watch?v=OG9vXOQsi5k) |
> | 44 | [Deploy Spring Boot App on Heroku: Easy Guide for Beginners](https://www.youtube.com/watch?v=Q0Rhup_Vjlk) |
> | 45 | [Kusho AI: Testing with AI Automation – Faster, Smarter API Tests](https://www.youtube.com/watch?v=f_LiIOytYE4) |
> | 46 | [How to Integrate Swagger in Spring Boot \| Step-by-Step Tutorial](https://www.youtube.com/watch?v=7QlvGBJ9Tng) |
> | 47 | [OAuth2 in Spring Boot \| How to Add Google Login in Spring Boot \| Complete Tutorial](https://www.youtube.com/watch?v=cRiqZ0j1gEM) |

# ‎
![ankit up railway app_journal_swagger-ui_index html](https://github.com/user-attachments/assets/1ff2ef88-b617-4f1d-9e21-0137d6b94905)
