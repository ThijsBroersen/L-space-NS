package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CategoryCodeSet
    extends OntologyDef(
      iri = "http://schema.org/CategoryCodeSet",
      iris = Set("http://schema.org/CategoryCodeSet"),
      label = "CategoryCodeSet",
      comment = """A set of Category Code values.""",
      `@extends` = () => List(DefinedTermSet.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.DefinedTermSet.Properties {
    lazy val hasCategoryCode = lspace.ns.vocab.schema.hasCategoryCode.property
  }
  override lazy val properties: List[Property] = List(hasCategoryCode)
  trait Properties extends lspace.ns.vocab.schema.DefinedTermSet.Properties {
    lazy val hasCategoryCode = lspace.ns.vocab.schema.hasCategoryCode.property
  }
}
