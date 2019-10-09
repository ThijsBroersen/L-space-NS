package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object State extends OntologyDef(
        iri = "http://schema.org/State",
        iris = Set("http://schema.org/State"),
        label = "State",
        comment = """A state or province of a country.""",
        `@extends` = List(AdministrativeArea.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
}