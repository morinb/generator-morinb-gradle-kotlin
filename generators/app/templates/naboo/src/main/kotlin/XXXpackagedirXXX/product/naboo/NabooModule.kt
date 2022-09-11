package <%= package %>.product.naboo

import org.apache.jute.Utils
import org.apache.solr.common.params.MapSolrParams
import org.apache.solr.common.params.SolrParams
import java.util.Collections

class NabooModule {
    constructor() {
        dive()
    }

    constructor(importantNumber: Int) {}

    private fun dive(): Int {
        val params: SolrParams = MapSolrParams(Collections.singletonMap("a1", ""))
        return Utils.compareBytes(params["a1"].toByteArray(), 0, 0, ByteArray(0), 0, 0)
    }
}
