package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object founder
    extends PropertyDef(
      iri = "http://schema.org/founder",
      iris = Set("http://schema.org/founder"),
      label = "founder",
      comment = """A person who founded this organization.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
