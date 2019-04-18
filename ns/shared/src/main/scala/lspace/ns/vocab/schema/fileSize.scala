package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object fileSize
    extends PropertyDef(
      iri = "http://schema.org/fileSize",
      iris = Set("http://schema.org/fileSize"),
      label = "fileSize",
      comment =
        """Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.""",
      `@extends` = () => List(),
      `@range` = () => List(`@string`, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
