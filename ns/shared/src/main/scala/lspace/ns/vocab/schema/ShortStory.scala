package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ShortStory extends OntologyDef(
        iri = "http://schema.org/ShortStory",
        iris = Set("http://schema.org/ShortStory"),
        label = "ShortStory",
        comment = """Short story or tale. A brief work of literature, usually written in narrative prose.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}