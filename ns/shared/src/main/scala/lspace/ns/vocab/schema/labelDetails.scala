package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object labelDetails
    extends PropertyDef(
      iri = "http://schema.org/labelDetails",
      iris = Set("http://schema.org/labelDetails"),
      label = "labelDetails",
      comment = """Link to the drug's label details.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
