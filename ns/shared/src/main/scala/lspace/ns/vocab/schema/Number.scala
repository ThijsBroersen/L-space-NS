package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Number
    extends OntologyDef(
      iri = "http://schema.org/Number",
      iris = Set("http://schema.org/Number"),
      label = "",
      comment = """""",
      `@extends` = () => List()
    ) {
  object keys {}
  override lazy val properties: List[Property] = List()
  trait Properties {}
}
