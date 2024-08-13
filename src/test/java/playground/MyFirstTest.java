package playground;

import org.testng.annotations.*;

public class MyFirstTest {

    @BeforeMethod
     public void runBeforeMethod(){
         System.out.println("This before each method the method");

 }
 @BeforeTest
 public void runBeforeTest(){

     System.out.println("Runs before each test!");
 }
    @Test
    public void myFirstTestMethod(){
        System.out.println("Hello world");

    }
    @AfterTest
    public void runsAfterTest(){
        System.out.println("Runs after each method!");
    }

    @AfterMethod
    public void runsAfterMethods(){
        System.out.println("This runs after each method");
    }


}
