package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target SELECT_BUTTON = Target.the("Botón para seleccionar el segmento de cursos")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div//strong"));
    public static final Target INPUT_COURSE = Target.the("Curso a buscar")
            .located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target GO_COURSE = Target.the("Botón para buscar curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target COURSE_BUTTON = Target.the("Da click para buscar el curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extrae nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
