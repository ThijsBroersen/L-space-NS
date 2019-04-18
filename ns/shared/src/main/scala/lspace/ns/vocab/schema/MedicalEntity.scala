package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalEntity
    extends OntologyDef(
      iri = "http://schema.org/MedicalEntity",
      iris = Set("http://schema.org/MedicalEntity"),
      label = "MedicalEntity",
      comment = """The most generic type of entity related to health and the practice of medicine.""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {}
}
