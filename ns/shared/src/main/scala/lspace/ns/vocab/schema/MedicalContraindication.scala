package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalContraindication extends OntologyDef(
        iri = "http://schema.org/MedicalContraindication",
        iris = Set("http://schema.org/MedicalContraindication"),
        label = "MedicalContraindication",
        comment = """A condition or factor that serves as a reason to withhold a certain medical therapy. Contraindications can be absolute (there are no reasonable circumstances for undertaking a course of action) or relative (the patient is at higher risk of complications, but that these risks may be outweighed by other considerations or mitigated by other measures).""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}