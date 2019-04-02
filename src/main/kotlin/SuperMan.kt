import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import org.openqa.selenium.By

class SuperMan {

    fun getSerch(waitTime: Long = 10000) = Selenide.`$`(By.name("q")).waitUntil(Condition.visible,waitTime)

    fun getSerchButton(waitTime: Long = 10000) = Selenide.`$`(By.name("btnK")).waitUntil(Condition.visible,waitTime)
}