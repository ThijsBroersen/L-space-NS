package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DepartAction extends OntologyDef(
        iri = "http://schema.org/DepartAction",
        iris = Set("http://schema.org/DepartAction"),
        label = "DepartAction",
        comment = """The act of  departing from a place. An agent departs from an fromLocation for a destination, optionally with participants.""",
        `@extends` = List(MoveAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MoveAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MoveAction.Properties{

}
}