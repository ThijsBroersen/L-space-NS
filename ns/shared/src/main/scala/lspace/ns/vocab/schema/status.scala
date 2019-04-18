package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object status extends PropertyDef(
        iri = "http://schema.org/status",
        iris = Set("http://schema.org/status"),
        label = "status",
        comment = """The status of the study (enumerated).""",
        `@extends` = () => List(),
        `@range` = () => List(EventStatusType.ontology, MedicalStudyStatus.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}