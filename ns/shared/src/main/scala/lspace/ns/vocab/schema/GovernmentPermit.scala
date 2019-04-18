package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object GovernmentPermit
    extends OntologyDef(
      iri = "http://schema.org/GovernmentPermit",
      iris = Set("http://schema.org/GovernmentPermit"),
      label = "GovernmentPermit",
      comment = """A permit issued by a government agency.""",
      `@extends` = () => List(Permit.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Permit.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Permit.Properties {}
}
