import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@ExtendWith(SerenityJUnit5Extension.class)
class SauceDemoLoginTest {

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    Actor user = Actor.named("Víctor");

    @Test
    void login() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.attemptsTo(
                Open.url("https://www.saucedemo.com/"),
                Login.withCredentials("standard_user", "secret_sauce")
        );
    }
}