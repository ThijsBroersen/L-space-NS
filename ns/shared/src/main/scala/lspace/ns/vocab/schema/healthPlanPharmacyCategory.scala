package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object healthPlanPharmacyCategory extends PropertyDef(
        iri = "http://schema.org/healthPlanPharmacyCategory",
        iris = Set("http://schema.org/healthPlanPharmacyCategory"),
        label = "healthPlanPharmacyCategory",
        comment = """The category or type of pharmacy associated with this cost sharing.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}