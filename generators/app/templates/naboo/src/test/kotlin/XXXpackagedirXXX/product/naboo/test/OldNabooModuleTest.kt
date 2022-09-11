package <%= package %>.product.naboo.test

import org.junit.Assert
import org.junit.Test

class OldNabooModuleTest {
    @Test
    fun testModuleOld4() {
        Assert.assertSame("Junit4", "Junit" + (2 + 2))
    }
}
