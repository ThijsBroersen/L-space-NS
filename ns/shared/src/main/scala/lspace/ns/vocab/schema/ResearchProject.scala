package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ResearchProject
    extends OntologyDef(
      iri = "http://schema.org/ResearchProject",
      iris = Set("http://schema.org/ResearchProject"),
      label = "ResearchProject",
      comment = """A Research project.""",
      `@extends` = () => List(Project.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Project.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Project.Properties {}
}
