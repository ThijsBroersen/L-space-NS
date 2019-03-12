package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object taxID extends PropertyDef(
        iri = "https://schema.org/taxID",
        iris = Set("https://schema.org/taxID"),
        label = "taxID",
        comment = """The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.""",
        `@extends` = () => List(identifier),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}