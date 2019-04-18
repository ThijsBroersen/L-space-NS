package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AllocateAction extends OntologyDef(
        iri = "http://schema.org/AllocateAction",
        iris = Set("http://schema.org/AllocateAction"),
        label = "AllocateAction",
        comment = """The act of organizing tasks/objects/events by associating resources to it.""",
        `@extends` = () => List(OrganizeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.OrganizeAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.OrganizeAction.Properties{

}
}