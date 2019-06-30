package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Atlas extends OntologyDef(
        iri = "http://schema.org/Atlas",
        iris = Set("http://schema.org/Atlas"),
        label = "Atlas",
        comment = """A collection or bound volume of maps, charts, plates or tables, physical or in media form illustrating any subject.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}