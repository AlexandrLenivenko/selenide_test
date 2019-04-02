
class SuperManSteps {
    private val superMan: SuperMan = SuperMan()

    fun findSerchFieldAndSetText(text: String = "I am super man!!!"): SuperManSteps {
        superMan.getSerch().value = text
        return this
    }

    fun pleaseClick(): SuperManSteps {
        superMan.getSerchButton().click()
        return this
    }
}