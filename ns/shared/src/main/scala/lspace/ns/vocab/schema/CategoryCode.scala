package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CategoryCode
    extends OntologyDef(
      iri = "http://schema.org/CategoryCode",
      iris = Set("http://schema.org/CategoryCode"),
      label = "CategoryCode",
      comment = """A Category Code.""",
      `@extends` = () => List(DefinedTerm.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.DefinedTerm.Properties {
    lazy val codeValue = lspace.ns.vocab.schema.codeValue.property
  }
  override lazy val properties: List[Property] = List(codeValue)
  trait Properties extends lspace.ns.vocab.schema.DefinedTerm.Properties {
    lazy val codeValue = lspace.ns.vocab.schema.codeValue.property
  }
}
