package <%= package %>.product.bespin.test

import <%= package %>.product.corellia.fixtures.CorelliaModuleFixture
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BespinModuleTest {
    @Test
    fun testModule() {
        Assertions.assertEquals(3, CorelliaModuleFixture().threeModules().size)
    }
}
