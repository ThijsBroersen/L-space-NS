package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TravelAction extends OntologyDef(
        iri = "http://schema.org/TravelAction",
        iris = Set("http://schema.org/TravelAction"),
        label = "TravelAction",
        comment = """The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants.""",
        `@extends` = List(MoveAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MoveAction.Properties{
lazy val distance = lspace.ns.vocab.schema.distance.property
}
override lazy val properties: List[LProperty] = List(distance)
trait Properties extends lspace.ns.vocab.schema.MoveAction.Properties{
lazy val distance = lspace.ns.vocab.schema.distance.property
}
}