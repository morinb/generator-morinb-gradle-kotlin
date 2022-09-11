package <%= package %>.product.kashyyyk

import <%= package %>.product.bespin.BespinModule
import <%= package %>.product.kamino.KaminoModule
import <%= package %>.product.naboo.NabooModule
import <%= package %>.product.tatooine.TatooineModule
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class KashyyykModule {
    init {
        try {
            KashyyykModule::class.java.getResourceAsStream("hello.txt").use { hello ->
                val message = BufferedReader(InputStreamReader(hello)).readLine()
                println(message)
            }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    fun flyTo(from: TatooineModule?): NabooModule {
        KaminoModule()
        BespinModule()
        val a = calculateSomethingImportant()
        return NabooModule(a)
    }

    fun calculateSomethingImportant(): Int {
        return 4 + 1
    }
}
