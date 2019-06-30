package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object House extends OntologyDef(
        iri = "http://schema.org/House",
        iris = Set("http://schema.org/House"),
        label = "House",
        comment = """A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/House">http://en.wikipedia.org/wiki/House</a>).""",
        `@extends` = () => List(Accommodation.ontology)
       ){
}