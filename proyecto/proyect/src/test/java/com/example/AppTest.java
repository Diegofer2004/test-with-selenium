package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Test // Anotación para que JUnit reconozca este método como una prueba
    public void testChromeDriver() {
        // Configura la ubicación del ChromeDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\xampp\\htdocs\\test-with-selenium\\proyecto\\proyect\\src\\main\\resources\\chromedriver-win64\\chromedriver.exe");

        // Crea una instancia de WebDriver
        WebDriver driver = new ChromeDriver();

        // Abre una página web, por ejemplo, saucudemo
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        // Realiza otras acciones de prueba aquí...
        WebElement usernameField = driver.findElement(By.id("user-name")); // Reemplaza "username" con el ID real
        WebElement passwordField = driver.findElement(By.id("password")); // Reemplaza "password" con el ID real
        WebElement loginButton = driver.findElement(By.id("login-button")); // Reemplaza "loginButton" con el ID real
        // Introducir las credenciales
        usernameField.sendKeys("standard_user"); // Reemplaza con un nombre de usuario válido
        passwordField.sendKeys("secret_sauce"); // Reemplaza con la contraseña válida

        loginButton.click();


        WebElement addcart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addcart.click() ;

        // Cierra el navegador después de la prueba
       // driver.quit();
    }
}
