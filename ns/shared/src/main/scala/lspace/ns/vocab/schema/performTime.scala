package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object performTime extends PropertyDef(
        iri = "http://schema.org/performTime",
        iris = Set("http://schema.org/performTime"),
        label = "performTime",
        comment = """The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>.""",
        `@extends` = List(),
        `@range` = List(Duration.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}