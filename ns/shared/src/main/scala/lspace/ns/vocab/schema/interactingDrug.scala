package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object interactingDrug extends PropertyDef(
        iri = "http://schema.org/interactingDrug",
        iris = Set("http://schema.org/interactingDrug"),
        label = "interactingDrug",
        comment = """Another drug that is known to interact with this drug in a way that impacts the effect of this drug or causes a risk to the patient. Note: disease interactions are typically captured as contraindications.""",
        `@extends` = () => List(),
        `@range` = () => List(Drug.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}