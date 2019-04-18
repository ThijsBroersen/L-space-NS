package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MonetaryGrant
    extends OntologyDef(
      iri = "http://schema.org/MonetaryGrant",
      iris = Set("http://schema.org/MonetaryGrant"),
      label = "MonetaryGrant",
      comment = """A monetary grant.""",
      `@extends` = () => List(Grant.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Grant.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Grant.Properties {}
}
