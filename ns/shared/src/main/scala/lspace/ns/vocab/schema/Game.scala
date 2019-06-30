package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Game extends OntologyDef(
        iri = "http://schema.org/Game",
        iris = Set("http://schema.org/Game"),
        label = "Game",
        comment = """The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}