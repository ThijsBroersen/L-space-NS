package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalProcedureType extends OntologyDef(
        iri = "http://schema.org/MedicalProcedureType",
        iris = Set("http://schema.org/MedicalProcedureType"),
        label = "MedicalProcedureType",
        comment = """An enumeration that describes different types of medical procedures.""",
        `@extends` = List(MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}