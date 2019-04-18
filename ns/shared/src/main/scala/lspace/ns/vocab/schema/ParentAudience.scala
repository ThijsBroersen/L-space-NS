package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ParentAudience
    extends OntologyDef(
      iri = "http://schema.org/ParentAudience",
      iris = Set("http://schema.org/ParentAudience"),
      label = "ParentAudience",
      comment = """A set of characteristics describing parents, who can be interested in viewing some content.""",
      `@extends` = () => List(PeopleAudience.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.PeopleAudience.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.PeopleAudience.Properties {}
}
