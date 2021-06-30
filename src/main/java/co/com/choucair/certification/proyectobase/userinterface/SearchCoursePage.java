package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Pick The Choucair University").located(By.xpath("//*[@id='certificaciones']/a/img"));
    public static final Target INPUT_COURSE = Target.the("Search course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search the course").located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Click to select the course").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Pick name of the course").located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
