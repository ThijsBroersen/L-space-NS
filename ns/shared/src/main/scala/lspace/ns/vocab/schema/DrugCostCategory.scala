package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugCostCategory extends OntologyDef(
        iri = "http://schema.org/DrugCostCategory",
        iris = Set("http://schema.org/DrugCostCategory"),
        label = "DrugCostCategory",
        comment = """Enumerated categories of medical drug costs.""",
        `@extends` = List(MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}