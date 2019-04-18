package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BrainStructure
    extends OntologyDef(
      iri = "http://schema.org/BrainStructure",
      iris = Set("http://schema.org/BrainStructure"),
      label = "BrainStructure",
      comment =
        """Any anatomical structure which pertains to the soft nervous tissue functioning as the coordinating center of sensation and intellectual and nervous activity.""",
      `@extends` = () => List(AnatomicalStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AnatomicalStructure.Properties {}
}
