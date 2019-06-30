package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WinAction extends OntologyDef(
        iri = "http://schema.org/WinAction",
        iris = Set("http://schema.org/WinAction"),
        label = "WinAction",
        comment = """The act of achieving victory in a competitive activity.""",
        `@extends` = () => List(AchieveAction.ontology)
       ){
}