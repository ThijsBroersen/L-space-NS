package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Sculpture
    extends OntologyDef(
      iri = "http://schema.org/Sculpture",
      iris = Set("http://schema.org/Sculpture"),
      label = "Sculpture",
      comment = """A piece of sculpture.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
