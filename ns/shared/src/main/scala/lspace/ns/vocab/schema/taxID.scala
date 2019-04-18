package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object taxID
    extends PropertyDef(
      iri = "http://schema.org/taxID",
      iris = Set("http://schema.org/taxID"),
      label = "taxID",
      comment = """The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.""",
      `@extends` = () => List(identifier.property),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}
