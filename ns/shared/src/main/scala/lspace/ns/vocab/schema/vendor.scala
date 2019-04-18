package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object vendor
    extends PropertyDef(
      iri = "http://schema.org/vendor",
      iris = Set("http://schema.org/vendor"),
      label = "vendor",
      comment = """'vendor' is an earlier term for 'seller'.""",
      `@extends` = () => List(participant.property),
      `@range` = () => List(Organization.ontology, Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.participant.Properties
}
