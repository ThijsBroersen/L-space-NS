package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object procedureType extends PropertyDef(
        iri = "http://schema.org/procedureType",
        iris = Set("http://schema.org/procedureType"),
        label = "procedureType",
        comment = """The type of procedure, for example Surgical, Noninvasive, or Percutaneous.""",
        `@extends` = () => List(),
        `@range` = () => List(MedicalProcedureType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}