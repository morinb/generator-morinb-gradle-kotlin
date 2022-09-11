package <%= package %>.product.app

import com.google.inject.Guice
import com.google.inject.servlet.SessionScoped
import <%= package %>.product.bespin.BespinModule
import <%= package %>.product.kamino.KaminoModule
import <%= package %>.product.kashyyyk.KashyyykModule
import <%= package %>.product.naboo.NabooModule
import <%= package %>.product.tatooine.TatooineModule
import org.slf4j.LoggerFactory

@SessionScoped
class MainModule {

    fun run() {
        LOGGER.info("Running application...")
        BespinModule().doThings()
        KaminoModule()
        KashyyykModule()
        NabooModule()
        TatooineModule()
        Guice.createInjector()
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(MainModule::class.java)
    }
}
