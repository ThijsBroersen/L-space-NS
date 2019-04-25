package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object acquiredFrom
    extends PropertyDef(
      iri = "http://schema.org/acquiredFrom",
      iris = Set("http://schema.org/acquiredFrom"),
      label = "acquiredFrom",
      comment = """The organization or person from which the product was acquired.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
