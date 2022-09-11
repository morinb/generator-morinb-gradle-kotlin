package <%= package %>.product.tatooine.test

import org.junit.Assert
import org.junit.Test

class TatooineModuleTest {
    @Test
    fun testModule() {
        Assert.assertSame("Junit4", "Junit" + (2 + 2))
    }
}
