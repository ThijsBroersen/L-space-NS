package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ArriveAction extends OntologyDef(
        iri = "http://schema.org/ArriveAction",
        iris = Set("http://schema.org/ArriveAction"),
        label = "ArriveAction",
        comment = """The act of arriving at a place. An agent arrives at a destination from a fromLocation, optionally with participants.""",
        `@extends` = () => List(MoveAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MoveAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MoveAction.Properties{

}
}