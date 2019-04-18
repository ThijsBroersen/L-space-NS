package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Project extends OntologyDef(
        iri = "http://schema.org/Project",
        iris = Set("http://schema.org/Project"),
        label = "Project",
        comment = """An enterprise (potentially individual but typically collaborative), planned to achieve a particular aim.
Use properties from <a class="localLink" href="http://schema.org/Organization">Organization</a>, <a class="localLink" href="http://schema.org/subOrganization">subOrganization</a>/<a class="localLink" href="http://schema.org/parentOrganization">parentOrganization</a> to indicate project sub-structures.""",
        `@extends` = () => List(Organization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Organization.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Organization.Properties{

}
}