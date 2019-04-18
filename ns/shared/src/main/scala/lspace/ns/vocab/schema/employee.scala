package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object employee
    extends PropertyDef(
      iri = "http://schema.org/employee",
      iris = Set("http://schema.org/employee"),
      label = "employee",
      comment = """Someone working for this organization.""",
      `@extends` = () => List(),
      `@range` = () => List(Person.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
