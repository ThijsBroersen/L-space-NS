package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object clinicalPharmacology extends PropertyDef(
        iri = "http://schema.org/clinicalPharmacology",
        iris = Set("http://schema.org/clinicalPharmacology"),
        label = "clinicalPharmacology",
        comment = """Description of the absorption and elimination of drugs, including their concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics, pD).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}