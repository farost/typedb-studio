package com.vaticle.typedb.studio.data

data class GraphData(val vertices: List<VertexData> = listOf(),
                     val edges: List<EdgeData> = listOf(),
                     val explanationVertices: List<ExplanationVertexData> = listOf(),
                     val explanationEdges: List<ExplanationEdgeData> = listOf())

data class VertexData(val id: Int, val encoding: VertexEncoding, val label: String, val shortLabel: String,
                      val width: Float, val height: Float, val inferred: Boolean = false)

enum class VertexEncoding {
    ENTITY_TYPE,
    RELATION_TYPE,
    ATTRIBUTE_TYPE,
    THING_TYPE,
    ENTITY,
    RELATION,
    ATTRIBUTE,
}

data class EdgeData(val id: Int, val source: Int, val target: Int, val label: String,
                    val inferred: Boolean = false)

data class IncompleteEdgeData(val id: Int, val vertexID: Int, val direction: EdgeDirection, val label: String,
                              val inferred: Boolean = false)

enum class EdgeDirection {
    OUTGOING,
    INCOMING
}

data class ExplanationVertexData(val explanationID: Int, val vertexID: Int)

data class ExplanationEdgeData(val explanationID: Int, val edgeID: Int)