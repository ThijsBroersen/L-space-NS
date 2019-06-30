package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object totalTime extends PropertyDef(
        iri = "http://schema.org/totalTime",
        iris = Set("http://schema.org/totalTime"),
        label = "totalTime",
        comment = """The total time required to perform instructions or a direction (including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.""",
        `@extends` = () => List(),
        `@range` = () => List(Duration.ontology)
       ){
}