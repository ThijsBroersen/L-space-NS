package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DiscoverAction extends OntologyDef(
        iri = "http://schema.org/DiscoverAction",
        iris = Set("http://schema.org/DiscoverAction"),
        label = "DiscoverAction",
        comment = """The act of discovering/finding an object.""",
        `@extends` = () => List(FindAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.FindAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.FindAction.Properties{

}
}