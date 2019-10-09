package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object City extends OntologyDef(
        iri = "http://schema.org/City",
        iris = Set("http://schema.org/City"),
        label = "City",
        comment = """A city or town.""",
        `@extends` = List(AdministrativeArea.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
}