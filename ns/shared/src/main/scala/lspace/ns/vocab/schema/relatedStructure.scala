package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object relatedStructure
    extends PropertyDef(
      iri = "http://schema.org/relatedStructure",
      iris = Set("http://schema.org/relatedStructure"),
      label = "relatedStructure",
      comment =
        """Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
