package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParentAudience extends OntologyDef(
        iri = "http://schema.org/ParentAudience",
        iris = Set("http://schema.org/ParentAudience"),
        label = "ParentAudience",
        comment = """A set of characteristics describing parents, who can be interested in viewing some content.""",
        `@extends` = () => List(PeopleAudience.ontology)
       ){
}