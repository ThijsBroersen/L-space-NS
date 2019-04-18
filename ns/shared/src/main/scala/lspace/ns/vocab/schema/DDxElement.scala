package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DDxElement extends OntologyDef(
        iri = "http://schema.org/DDxElement",
        iris = Set("http://schema.org/DDxElement"),
        label = "DDxElement",
        comment = """An alternative, closely-related condition typically considered later in the differential diagnosis process along with the signs that are used to distinguish it.""",
        `@extends` = () => List(MedicalIntangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties{

}
}