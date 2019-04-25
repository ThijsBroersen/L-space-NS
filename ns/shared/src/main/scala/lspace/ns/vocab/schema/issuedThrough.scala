package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object issuedThrough
    extends PropertyDef(
      iri = "http://schema.org/issuedThrough",
      iris = Set("http://schema.org/issuedThrough"),
      label = "issuedThrough",
      comment = """The service through with the permit was granted.""",
      `@extends` = () => List(),
      `@range` = () => List(Service.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
