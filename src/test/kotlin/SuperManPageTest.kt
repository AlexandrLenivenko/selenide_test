import org.testng.annotations.Test

class SuperManPageTest: BaseTest() {
    private val step: SuperManSteps = SuperManSteps()

    init {
        url = "https://www.google.com/"
    }

    @Test
    fun `google "I am superMan"`() {
        step.findSerchFieldAndSetText("I am superMan" ).pleaseClick()
    }
}