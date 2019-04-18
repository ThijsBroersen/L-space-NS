package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WorkersUnion extends OntologyDef(
        iri = "http://schema.org/WorkersUnion",
        iris = Set("http://schema.org/WorkersUnion"),
        label = "WorkersUnion",
        comment = """A Workers Union (also known as a Labor Union, Labour Union, or Trade Union) is an organization that promotes the interests of its worker members by collectively bargaining with management, organizing, and political lobbying.""",
        `@extends` = () => List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{

}
}