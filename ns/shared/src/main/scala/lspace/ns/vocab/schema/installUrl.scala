package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object installUrl
    extends PropertyDef(
      iri = "http://schema.org/installUrl",
      iris = Set("http://schema.org/installUrl"),
      label = "installUrl",
      comment = """URL at which the app may be installed, if different from the URL of the item.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
