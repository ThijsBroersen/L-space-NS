package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableStrength extends PropertyDef(
        iri = "http://schema.org/availableStrength",
        iris = Set("http://schema.org/availableStrength"),
        label = "availableStrength",
        comment = """An available dosage strength for the drug.""",
        `@extends` = () => List(),
        `@range` = () => List(DrugStrength.ontology)
       ){
}