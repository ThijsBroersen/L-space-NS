package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UseAction extends OntologyDef(
        iri = "http://schema.org/UseAction",
        iris = Set("http://schema.org/UseAction"),
        label = "UseAction",
        comment = """The act of applying an object to its intended purpose.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.ConsumeAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.ConsumeAction.Properties{

}
}