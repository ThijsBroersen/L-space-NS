package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MonetaryGrant extends OntologyDef(
        iri = "http://schema.org/MonetaryGrant",
        iris = Set("http://schema.org/MonetaryGrant"),
        label = "MonetaryGrant",
        comment = """A monetary grant.""",
        `@extends` = () => List(Grant.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Grant.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Grant.Properties{

}
}