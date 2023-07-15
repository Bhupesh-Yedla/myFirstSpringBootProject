package com.reactapp.service;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
    int result=0;
    if(n.length()==1)
        return result;
    else{
        int sum=0;
        for(int i=0;i<n.length();i++){
        sum+=Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        n=String.valueOf(sum*k);
        result=sum*k;
        return superDigit(n, 1);
    }
        
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


// package com.codility.selenium;

// import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.interactions.Actions;

// import org.junit.Test;
// import org.junit.Before;
// import org.junit.After;
// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertEquals;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class AppTest extends BaseTest {

//     @Before
//     public void setup(){
//         WebDriver webDriver=null;
//         String url="https://codility-frontend-prod-eu.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html";
//         webDriver.get(url);
//     }

//     @Test
//     public void verifyEmailPasswordFieldsExists() {
//         WebElement email = webDriver.findElement(By.id("email-input"));
//         WebElement password = webDriver.findElement(By.id("password-input"));
//         assertEquals(email.isDisplayed(),true);
//         assertEquals(password.isDisplayed(),true);
//     }

//     @Test
//     public void verifyValidLogin() {
//         WebElement email = webDriver.findElement(By.id("email-input"));
//         WebElement password = webDriver.findElement(By.id("password-input"));
//         WebElement submit = webDriver.findElement(By.id("login-button"));
//         WebElement success = webDriver.findElement(By.xpath("//div[@class='message success']"));
//         email.sendKeys("login@codility.com");
//         password.sendKeys("password");
//         submit.click();
//         assertEquals(success.getText(),"Welcome to Codility");
//     }

//     @Test
//     public void verifyInvalidLogin() {
//         WebElement email = webDriver.findElement(By.id("email-input"));
//         WebElement password = webDriver.findElement(By.id("password-input"));
//         WebElement submit = webDriver.findElement(By.id("login-button"));
//         WebElement error = webDriver.findElement(By.xpath("//div[@class='message error']"));
//         email.sendKeys("unknown@codility.com");
//         password.sendKeys("password");
//         submit.click();
//         assertEquals(error.getText(),"You shall not pass! Arr!");
//     }

//     @Test
//     public void validateEmailField() {
//         WebElement email = webDriver.findElement(By.id("email-input"));
//         WebElement password = webDriver.findElement(By.id("password-input"));
//         WebElement submit = webDriver.findElement(By.id("login-button"));
//         WebElement invalidEmail = webDriver.findElement(By.xpath("//div[@class='validation error']"));
//         email.sendKeys("unknowncodility.com");
//         password.sendKeys("password");
//         submit.click();
//         assertEquals(invalidEmail.getText(),"Enter a valid email");
//     }

//     @Test
//     public void validateEmailPasswordFields() {
//         WebElement email = webDriver.findElement(By.id("email-input"));
//         WebElement password = webDriver.findElement(By.id("password-input"));
//         WebElement submit = webDriver.findElement(By.id("login-button"));
//         WebElement emptyEmail = webDriver.findElement(By.xpath("(//div[@class='validation error'])[0]"));
//         WebElement emptyPassword = webDriver.findElement(By.xpath("(//div[@class='validation error'])[1]"));
//         email.sendKeys("");
//         password.sendKeys("");
//         submit.click();
//         assertEquals(emptyEmail.getText(),"Email is required");
//         assertEquals(emptyPassword.getText(),"Password is required");
//     }

//     @After
//     public void tearDown(){
//         webDriver.close();
//     }
// }



