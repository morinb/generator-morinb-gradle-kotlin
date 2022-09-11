package <%= package %>.product.corellia.fixtures

import com.google.common.collect.ImmutableList
import com.google.common.io.ByteProcessor
import <%= package %>.product.corellia.CorelliaModule
import javax.annotation.Nonnull

class CorelliaModuleFixture : ByteProcessor<CorelliaModuleFixture?> {
    fun threeModules(): List<CorelliaModule> {
        CorelliaModule()
        return ImmutableList.of(CorelliaModule(), CorelliaModule(), CorelliaModule())
    }

    override fun processBytes(@Nonnull buf: ByteArray, off: Int, len: Int): Boolean {
        return false
    }

    override fun getResult(): CorelliaModuleFixture? {
        return null
    }
}
