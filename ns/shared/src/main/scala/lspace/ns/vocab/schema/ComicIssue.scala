package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComicIssue extends OntologyDef(
        iri = "http://schema.org/ComicIssue",
        iris = Set("http://schema.org/ComicIssue"),
        label = "ComicIssue",
        comment = """Individual comic issues are serially published as
    part of a larger series. For the sake of consistency, even one-shot issues
    belong to a series comprised of a single issue. All comic issues can be
    uniquely identified by: the combination of the name and volume number of the
    series to which the issue belongs; the issue number; and the variant
    description of the issue (if any).""",
        `@extends` = () => List(PublicationIssue.ontology)
       ){
}