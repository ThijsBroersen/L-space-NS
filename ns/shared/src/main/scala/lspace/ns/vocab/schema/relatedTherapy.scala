package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relatedTherapy extends PropertyDef(
        iri = "http://schema.org/relatedTherapy",
        iris = Set("http://schema.org/relatedTherapy"),
        label = "relatedTherapy",
        comment = """A medical therapy related to this anatomy.""",
        `@extends` = List(),
        `@range` = List(MedicalTherapy.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}