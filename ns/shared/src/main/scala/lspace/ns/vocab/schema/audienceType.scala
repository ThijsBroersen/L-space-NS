package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object audienceType extends PropertyDef(
        iri = "http://schema.org/audienceType",
        iris = Set("http://schema.org/audienceType"),
        label = "audienceType",
        comment = """The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}