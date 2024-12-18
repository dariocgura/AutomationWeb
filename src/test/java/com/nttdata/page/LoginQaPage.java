package com.nttdata.page;
import org.openqa.selenium.By;

public class LoginQaPage {
    public static By loginBotton = By.xpath("//*[@id=\"_desktop_user_info\"]/div");
    public static By userInput = By.xpath("//*[@id=\"field-email\"]e");
    public static By passInput = By.xpath("//*[@id=\"field-password\"]");
    public static By submitLogin = By.xpath("//*[@id=\"submit-login\"]");

}
