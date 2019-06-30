package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GameServer extends OntologyDef(
        iri = "http://schema.org/GameServer",
        iris = Set("http://schema.org/GameServer"),
        label = "GameServer",
        comment = """Server that provides game interaction in a multiplayer game.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}