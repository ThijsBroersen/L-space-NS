package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ItemAvailability extends OntologyDef(
        iri = "http://schema.org/ItemAvailability",
        iris = Set("http://schema.org/ItemAvailability"),
        label = "ItemAvailability",
        comment = """A list of possible product availability options.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}