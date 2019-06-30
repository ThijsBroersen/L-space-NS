package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BlogPosting extends OntologyDef(
        iri = "http://schema.org/BlogPosting",
        iris = Set("http://schema.org/BlogPosting"),
        label = "BlogPosting",
        comment = """A blog post.""",
        `@extends` = () => List(SocialMediaPosting.ontology)
       ){
}