package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Poster
    extends OntologyDef(
      iri = "http://schema.org/Poster",
      iris = Set("http://schema.org/Poster"),
      label = "Poster",
      comment =
        """A large, usually printed placard, bill, or announcement, often illustrated, that is posted to advertise or publicize something.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {}
}
