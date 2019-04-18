package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object drugClass
    extends PropertyDef(
      iri = "http://schema.org/drugClass",
      iris = Set("http://schema.org/drugClass"),
      label = "drugClass",
      comment = """The class of drug this belongs to (e.g., statins).""",
      `@extends` = () => List(),
      `@range` = () => List(DrugClass.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
