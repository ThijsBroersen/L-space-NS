package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Ligament
    extends OntologyDef(
      iri = "http://schema.org/Ligament",
      iris = Set("http://schema.org/Ligament"),
      label = "Ligament",
      comment =
        """A short band of tough, flexible, fibrous connective tissue that functions to connect multiple bones, cartilages, and structurally support joints.""",
      `@extends` = () => List(AnatomicalStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {}
}
