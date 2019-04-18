package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object dissolutionDate
    extends PropertyDef(
      iri = "http://schema.org/dissolutionDate",
      iris = Set("http://schema.org/dissolutionDate"),
      label = "dissolutionDate",
      comment = """The date that this organization was dissolved.""",
      `@extends` = () => List(),
      `@range` = () => List(`@date`)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
