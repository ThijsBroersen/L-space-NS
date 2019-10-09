package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actionOption extends PropertyDef(
        iri = "http://schema.org/actionOption",
        iris = Set("http://schema.org/actionOption"),
        label = "actionOption",
        comment = """A sub property of object. The options subject to this action.""",
        `@extends` = List(`object`.property),
        `@range` = List(`@string`, Thing.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.`object`.Properties
}