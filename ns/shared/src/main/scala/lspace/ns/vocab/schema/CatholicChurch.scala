package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CatholicChurch extends OntologyDef(
        iri = "http://schema.org/CatholicChurch",
        iris = Set("http://schema.org/CatholicChurch"),
        label = "CatholicChurch",
        comment = """A Catholic church.""",
        `@extends` = List(PlaceOfWorship.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PlaceOfWorship.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.PlaceOfWorship.Properties{

}
}