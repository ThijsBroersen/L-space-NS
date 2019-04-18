package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ControlAction extends OntologyDef(
        iri = "http://schema.org/ControlAction",
        iris = Set("http://schema.org/ControlAction"),
        label = "ControlAction",
        comment = """An agent controls a device or application.""",
        `@extends` = () => List(Action.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Action.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Action.Properties{

}
}