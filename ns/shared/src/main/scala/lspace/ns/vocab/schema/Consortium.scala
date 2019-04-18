package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Consortium extends OntologyDef(
        iri = "http://schema.org/Consortium",
        iris = Set("http://schema.org/Consortium"),
        label = "Consortium",
        comment = """A Consortium is a membership <a class="localLink" href="http://schema.org/Organization">Organization</a> whose members are typically Organizations.""",
        `@extends` = () => List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{

}
}