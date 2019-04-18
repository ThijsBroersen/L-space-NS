package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object legislationLegalValue
    extends PropertyDef(
      iri = "http://schema.org/legislationLegalValue",
      iris = Set("http://schema.org/legislationLegalValue"),
      label = "legislationLegalValue",
      comment =
        """The legal value of this legislation file. The same legislation can be written in multiple files with different legal values. Typically a digitally signed PDF have a "stronger" legal value than the HTML file of the same act.""",
      `@extends` = () => List(),
      `@range` = () => List(LegalValueLevel.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
