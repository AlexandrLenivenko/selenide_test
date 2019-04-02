import com.codeborne.selenide.Selenide
import org.testng.annotations.BeforeMethod

open class BaseTest {
    var url = ""

    @BeforeMethod
    fun setup() {
        Selenide.open(url)
    }
}