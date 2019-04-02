import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open
import org.openqa.selenium.By

fun main(args: Array<String>) {

    open("https://www.google.com/")
/*    `$`(By.cssSelector("#u4506529702339321 > div > div > div.gel-layout.gel-layout--no-flex.qa-seven-slice > div:nth-child(7) > div > div.gs-c-promo-body.gel-1\\2f 2\\40 xs.gel-1\\2f 1\\40 m.gs-u-mt\\40 m > div > a"))
        .waitUntil(visible,10000).click()*/
    `$`(By.name("q"))
        .waitUntil(visible,10000).value = "I am super man!!!"
    Selenide.sleep(4000)
    `$`(By.name("btnK"))
        .waitUntil(visible,10000).click()
    Selenide.sleep(20000)

}