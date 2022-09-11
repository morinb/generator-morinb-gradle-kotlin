package <%= package %>.product.bespin

import org.apache.velocity.io.VelocityWriter
import <%= package %>.product.corellia.CorelliaModule
import <%= package %>.product.coruscant.CoruscantModule
import java.io.FileWriter

class BespinModule {

    fun doThings(): CorelliaModule {
        CoruscantModule()
        VelocityWriter(FileWriter(System.getProperty("java.io.tmpdir") + "/dummy.out"))
        return CorelliaModule()
    }
}
