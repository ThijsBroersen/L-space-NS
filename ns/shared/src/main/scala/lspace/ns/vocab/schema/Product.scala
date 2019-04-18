package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Product extends OntologyDef(
        iri = "http://schema.org/Product",
        iris = Set("http://schema.org/Product"),
        label = "Product",
        comment = """Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online.""",
        `@extends` = () => List(Thing.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Thing.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Thing.Properties{

}
}