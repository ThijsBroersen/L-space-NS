package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object outcome extends PropertyDef(
        iri = "http://schema.org/outcome",
        iris = Set("http://schema.org/outcome"),
        label = "outcome",
        comment = """Expected or actual outcomes of the study.""",
        `@extends` = List(),
        `@range` = List(`@string`, MedicalEntity.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}