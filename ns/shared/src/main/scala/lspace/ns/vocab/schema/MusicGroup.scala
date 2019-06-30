package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicGroup extends OntologyDef(
        iri = "http://schema.org/MusicGroup",
        iris = Set("http://schema.org/MusicGroup"),
        label = "MusicGroup",
        comment = """A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.""",
        `@extends` = () => List(PerformingGroup.ontology)
       ){
}