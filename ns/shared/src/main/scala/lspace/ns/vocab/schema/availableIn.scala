package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object availableIn
    extends PropertyDef(
      iri = "http://schema.org/availableIn",
      iris = Set("http://schema.org/availableIn"),
      label = "availableIn",
      comment = """The location in which the strength is available.""",
      `@extends` = () => List(),
      `@range` = () => List(AdministrativeArea.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
