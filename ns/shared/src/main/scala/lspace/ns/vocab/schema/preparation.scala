package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object preparation
    extends PropertyDef(
      iri = "http://schema.org/preparation",
      iris = Set("http://schema.org/preparation"),
      label = "preparation",
      comment = """Typical preparation that a patient must undergo before having the procedure performed.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalEntity.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
