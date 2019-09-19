package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object evidenceOrigin extends PropertyDef(
        iri = "http://schema.org/evidenceOrigin",
        iris = Set("http://schema.org/evidenceOrigin"),
        label = "evidenceOrigin",
        comment = """Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}