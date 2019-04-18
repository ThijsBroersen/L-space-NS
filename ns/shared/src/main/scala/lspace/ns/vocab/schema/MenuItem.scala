package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MenuItem extends OntologyDef(
        iri = "http://schema.org/MenuItem",
        iris = Set("http://schema.org/MenuItem"),
        label = "MenuItem",
        comment = """A food or drink item listed in a menu or menu section.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{

}
}